package nano.spook1998.rust.object.utils;

import java.util.ArrayList;
import java.util.List;
import nano.spook1998.rust.object.StoneGenerator;

public class StoneGeneratorUtil {

    private static final List<StoneGenerator> GENERATORS = new ArrayList<>();

    private StoneGeneratorUtil() {
    }

    public static void addGenerator(StoneGenerator generator) {
        if (generator != null && !GENERATORS.contains(generator)) {
            GENERATORS.add(generator);
        }
    }

    public static void removeGenerator(StoneGenerator generator) {
        if (generator != null) {
            GENERATORS.remove(generator);
        }
    }

    public static List<StoneGenerator> getGenerators() {
        return GENERATORS;
    }

    public static StoneGenerator getById(String id) {
        if (id == null) {
            return null;
        }
        for (StoneGenerator generator : GENERATORS) {
            if (generator != null && id.equals(generator.getId())) {
                return generator;
            }
        }
        return null;
    }
}
