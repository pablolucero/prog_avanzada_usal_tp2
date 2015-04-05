package negocio;

public enum PlugType {
    NINE_VOLTS("nine volts"),
    TEN_VOLTS("ten volts"),
    TWELVE_VOLTS("twelve volts");

    private final String name;

    PlugType(String s) {
        name = s;
    }

    public boolean equalsName(String otherName){
        return (otherName != null) && name.equals(otherName);
    }

    public String toString(){
        return name;
    }
}
