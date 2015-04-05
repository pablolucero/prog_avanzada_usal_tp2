package negocio;

public class ElectricBassGuitar extends StringedInstrument implements Pluggable {

    private PlugType plug = PlugType.TEN_VOLTS;

    public ElectricBassGuitar() {
        this.name = "Spector";
        this.numberOfStrings = 5;
    }

    public ElectricBassGuitar(String name, int numberOfStrings) {
        this.name = name;
        this.numberOfStrings = numberOfStrings;
    }

    public ElectricBassGuitar(String name, int numberOfStrings, PlugType plug) {
        this.name = name;
        this.numberOfStrings = numberOfStrings;
        this.plug = plug;
    }

    @Override public void play() {
        System.out.println(name + " bass guitar of " + numberOfStrings + "-string");
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

        if (obj == null || !(obj instanceof ElectricBassGuitar))
            return false;
        if (obj == this)
            return true;
        return (this.numberOfStrings == ((ElectricBassGuitar) obj).numberOfStrings
                && this.name.equals(((ElectricBassGuitar) obj).name));
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
