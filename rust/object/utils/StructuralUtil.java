package nano.spook1998.rust.object.utils;

import java.util.ArrayList;
import java.util.List;
import nano.spook1998.rust.object.Region;

public class RegionUtil {

    private static final List<Region> REGIONS = new ArrayList<>();

    private RegionUtil() {
    }

    public static void addRegion(Region region) {
        if (region != null && !REGIONS.contains(region)) {
            REGIONS.add(region);
        }
    }

    public static void removeRegion(Region region) {
        if (region != null) {
            REGIONS.remove(region);
        }
    }

    public static List<Region> getRegions() {
        return REGIONS;
    }
}
