package negocio;

public class ElectricGuitar extends StringedInstrument implements Pluggable {

    private PlugType plug = PlugType.NINE_VOLTS;
    
    public ElectricGuitar() {
        this.name = "Fender";
        this.numberOfStrings = 6;
    }

    public ElectricGuitar(String name, int numberOfStrings) {
        this.name = name;
        this.numberOfStrings = numberOfStrings;
    }

    public ElectricGuitar(String name, int numberOfStrings, PlugType plug) {
        this.name = name;
        this.numberOfStrings = numberOfStrings;
        this.plug = plug;
    }

    @Override public void play() {
        System.out.println(name + " guitar of " + numberOfStrings + "-string");
    }

    @Override public void plug() {
        System.out.println(plug);
    }

    public PlugType getPlug() {
        return plug;
    }

    public void setPlug(PlugType plug) {
        this.plug = plug;
    }

    @Override public boolean equals(Object obj) {

        if (obj == null || !(obj instanceof ElectricGuitar))
            return false;
        if (obj == this)
            return true;
        return (this.numberOfStrings == ((ElectricGuitar) obj).numberOfStrings
                && this.name.equals(((ElectricGuitar) obj).name));
    }

    @Override public int hashCode() {
        // 17 y 37 son numeros primos definidos arbitrariamente por mi, podria haber usado cualquier otro o, idealmente,
        // alguna libreria como la clase HashCodeBuilder de Apache Commons Lang
        int result = 17;
        result = 37*result + numberOfStrings;
        result = 37*result + name.hashCode();
        result = 37*result + getClass().hashCode();

        return result;
    }

}
