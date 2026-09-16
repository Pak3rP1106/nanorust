package nano.spook1998.rust.data.manager;

import java.util.HashMap;
import java.util.Map;
import nano.spook1998.rust.object.Region;

public class RegionManager {

    private static final RegionManager INSTANCE = new RegionManager();

    private final Map<String, Region> regions = new HashMap<>();

    private RegionManager() {
    }

    public static RegionManager getInstance() {
        return INSTANCE;
    }

    public void load() {
        regions.clear();
    }

    public void save() {
        // Simple in-memory storage placeholder.
    }

    public Region get(String id) {
        return regions.get(id);
    }

    public void put(Region region) {
        if (region != null && region.getId() != null) {
            regions.put(region.getId(), region);
        }
    }

    public void remove(String id) {
        regions.remove(id);
    }

    public Map<String, Region> getRegions() {
        return regions;
    }
}
