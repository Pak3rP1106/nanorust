package nano.spook1998.rust.data;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.bukkit.configuration.InvalidConfigurationException;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

public final class Config {

    private static final Map<String, RConfig> CONFIGS = new HashMap<>();

    public static boolean registerConfig(String configId, String fileName, JavaPlugin plugin) {
        File file = new File(plugin.getDataFolder(), fileName);

        if (!file.exists()) {
            file.getParentFile().mkdirs();
            try (InputStream input = plugin.getResource(fileName)) {
                if (input != null) {
                    Files.copy(input, file.toPath());
                }
            } catch (IOException e) {
                e.printStackTrace();
                return false;
            }
        }

        RConfig config = new RConfig(configId, file);
        if (CONFIGS.containsKey(configId)) {
            return false;
        }

        CONFIGS.put(configId, config);
        return true;
    }

    public static boolean unregisterConfig(String configId) {
        RConfig config = CONFIGS.remove(configId);
        return config != null;
    }

    public static RConfig getConfig(String configId) {
        return CONFIGS.get(configId);
    }

    public static boolean load(String configId) {
        RConfig config = CONFIGS.get(configId);
        if (config == null) {
            return false;
        }

        try {
            config.load();
            return true;
        } catch (InvalidConfigurationException | FileNotFoundException | IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static boolean save(String configId) {
        RConfig config = CONFIGS.get(configId);
        if (config == null) {
            return false;
        }

        try {
            config.save();
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static boolean loadAll() {
        boolean ok = true;
        for (RConfig config : new ArrayList<>(CONFIGS.values())) {
            try {
                config.load();
            } catch (InvalidConfigurationException | FileNotFoundException | IOException e) {
                e.printStackTrace();
                ok = false;
            }
        }
        return ok;
    }

    public static boolean saveAll() {
        boolean ok = true;
        for (RConfig config : new ArrayList<>(CONFIGS.values())) {
            try {
                config.save();
            } catch (IOException e) {
                e.printStackTrace();
                ok = false;
            }
        }
        return ok;
    }

    public static void clear(String configId) {
        RConfig config = CONFIGS.remove(configId);
        if (config != null) {
            config.getFile().delete();
        }
    }

    public static final class RConfig extends YamlConfiguration {

        private final String configId;
        private final File file;

        private RConfig(String configId, File file) {
            this.configId = configId;
            this.file = file;
        }

        public String getConfigId() {
            return configId;
        }

        public File getFile() {
            return file;
        }

        public void load() throws InvalidConfigurationException, FileNotFoundException, IOException {
            super.load(file);
        }

        public void save() throws IOException {
            super.save(file);
        }
    }
}
