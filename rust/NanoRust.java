package nano.spook1998.rust;

import nano.spook1998.rust.data.Manager;
import org.bukkit.plugin.java.JavaPlugin;

public final class NanoRust extends JavaPlugin {

    private static NanoRust instance;

    public static NanoRust getInstance() {
        return instance;
    }

    @Override
    public void onEnable() {
        instance = this;
        Manager.getInstance().load();
    }

    @Override
    public void onDisable() {
        Manager.getInstance().save();
    }
}
