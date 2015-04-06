package negocio;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

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

//    @Override public boolean equals(Object obj) {
//
//        if (obj == null || !(obj instanceof ElectricBassGuitar))
//            return false;
//        if (obj == this)
//            return true;
//        return (this.numberOfStrings == ((ElectricBassGuitar) obj).numberOfStrings
//                && this.name.equals(((ElectricBassGuitar) obj).name));
//    }
//
//    @Override public int hashCode() {
//        // 17 y 37 son numeros primos definidos arbitrariamente por mi, podria haber usado cualquier otro o, idealmente,
//        // alguna libreria como la clase HashCodeBuilder de Apache Commons Lang
//        int result = 17;
//        result = 37*result + numberOfStrings;
//        result = 37*result + name.hashCode();
//        result = 37*result + getClass().hashCode();
//
//        return result;
//    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof ElectricBassGuitar) {
            ElectricBassGuitar other = (ElectricBassGuitar) obj;
            EqualsBuilder builder = new EqualsBuilder();
            builder.append(name, other.name);
            builder.append(numberOfStrings, other.numberOfStrings);
            return builder.isEquals();
        }
        return false;
    }

    @Override
    public int hashCode() {
        HashCodeBuilder builder = new HashCodeBuilder();
        builder.append(name);
        builder.append(numberOfStrings);
        return builder.toHashCode();
    }

}
