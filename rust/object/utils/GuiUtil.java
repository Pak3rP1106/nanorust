package nano.spook1998.rust.object.utils;

import java.util.ArrayList;
import java.util.List;
import nano.spook1998.rust.object.AirDrop;

public class AirDropUtil {

    private static final List<AirDrop> AIR_DROPS = new ArrayList<>();

    private AirDropUtil() {
    }

    public static void addAirDrop(AirDrop airDrop) {
        if (airDrop != null && !AIR_DROPS.contains(airDrop)) {
            AIR_DROPS.add(airDrop);
        }
    }

    public static void removeAirDrop(AirDrop airDrop) {
        if (airDrop != null) {
            AIR_DROPS.remove(airDrop);
        }
    }

    public static List<AirDrop> getAirDrops() {
        return AIR_DROPS;
    }

    public static AirDrop getById(String id) {
        if (id == null) {
            return null;
        }
        for (AirDrop airDrop : AIR_DROPS) {
            if (airDrop != null && id.equals(airDrop.getId())) {
                return airDrop;
            }
        }
        return null;
    }
}
