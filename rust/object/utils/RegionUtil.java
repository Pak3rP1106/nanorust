package nano.spook1998.rust.object.utils;

import java.util.HashMap;
import java.util.Map;
import nano.spook1998.rust.object.Gui;

public class GuiUtil {

    private static final Map<String, Gui> GUI_MAP = new HashMap<>();

    private GuiUtil() {
    }

    public static void register(Gui gui) {
        if (gui != null && gui.getId() != null) {
            GUI_MAP.put(gui.getId(), gui);
        }
    }

    public static Gui get(String id) {
        return GUI_MAP.get(id);
    }

    public static void unregister(String id) {
        GUI_MAP.remove(id);
    }

    public static Map<String, Gui> getGuiMap() {
        return GUI_MAP;
    }
}
