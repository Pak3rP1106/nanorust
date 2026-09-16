package nano.spook1998.rust.object.utils;

import nano.spook1998.rust.utils.type.DirectionType;

public class DirectionUtil {

    private DirectionUtil() {
    }

    public static DirectionType fromString(String value) {
        if (value == null) {
            return DirectionType.UNKNOWN;
        }
        String normalized = value.trim().toUpperCase();
        switch (normalized) {
            case "N":
            case "NORTH":
                return DirectionType.NORTH;
            case "S":
            case "SOUTH":
                return DirectionType.SOUTH;
            case "E":
            case "EAST":
                return DirectionType.EAST;
            case "W":
            case "WEST":
                return DirectionType.WEST;
            case "U":
            case "UP":
                return DirectionType.UP;
            case "D":
            case "DOWN":
                return DirectionType.DOWN;
            default:
                return DirectionType.UNKNOWN;
        }
    }
}
