package fan;

public enum Direction {

    FORWARD("FORWARD"),

    BACKWARD("BACKWARD");

    private String code;


    public String getCode() {

        return code;

    }

     Direction(String eCode) {

        this.code = eCode;

    }

    public String toString() {

        return code;

    }
    public static Direction valueFor(String eCode) {
        return Enum.valueOf(Direction.class, eCode);
    }
}
