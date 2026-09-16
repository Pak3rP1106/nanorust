package nano.spook1998.rust.utils.type;

public enum DirectionType {
    NORTH(0),
    SOUTH(1),
    EAST(2),
    WEST(3),
    UP(4),
    DOWN(5),
    UNKNOWN(-1);

    private final int id;

    DirectionType(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public static DirectionType fromId(int id) {
        for (DirectionType type : values()) {
            if (type.id == id) {
                return type;
            }
        }
        return UNKNOWN;
    }
}
