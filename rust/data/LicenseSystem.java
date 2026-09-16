package nano.spook1998.rust.data;

import java.io.File;
import java.io.IOException;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.plugin.Plugin;

public class Config {

    private final Plugin plugin;
    private final File file;
    private final FileConfiguration configuration;

    public Config(Plugin plugin, String fileName) {
        this.plugin = plugin;
        this.file = new File(plugin.getDataFolder(), fileName);
        if (!this.file.exists()) {
            plugin.saveResource(fileName, false);
        }
        this.configuration = YamlConfiguration.loadConfiguration(this.file);
    }

    public Plugin getPlugin() {
        return plugin;
    }

    public File getFile() {
        return file;
    }

    public FileConfiguration getConfiguration() {
        return configuration;
    }

    public void save() {
        try {
            configuration.save(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void reload() {
        configuration.load(file);
    }
}
