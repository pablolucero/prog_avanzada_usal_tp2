package negocio;

public abstract class StringedInstrument extends Instrument {
    protected int numberOfStrings;

    @Override public boolean equals(Object obj) {

        if (obj == null || !(obj instanceof StringedInstrument))
            return false;
        if (obj == this)
            return true;
        return (this.numberOfStrings == ((StringedInstrument) obj).numberOfStrings
                && this.name.equals(((StringedInstrument) obj).name));
    }

    @Override public int hashCode() {
        // 17 y 37 son numeros primos definidos arbitrariamente por mi, podria haber usado cualquier otro o, idealmente,
        // alguna libreria como la clase HashCodeBuilder de Apache Commons Lang
        int result = 17;
        result = 37*result + numberOfStrings;
        result = 37*result + name.hashCode();

        return result;
    }
}
