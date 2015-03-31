package negocio;

public abstract class PercussionInstrument extends Instrument {
    protected int numberOfCymbals;
    protected int numberOfDrums;

    @Override public boolean equals(Object obj) {

        if (!(obj instanceof PercussionInstrument))
            return false;
        if (obj == this)
            return true;
        return (this.numberOfCymbals == ((PercussionInstrument) obj).numberOfCymbals
                && this.numberOfDrums == ((PercussionInstrument) obj).numberOfDrums
                && this.name.equals(((PercussionInstrument) obj).name));
    }

    @Override public int hashCode() {
        // 17 y 37 son numeros primos definidos arbitrariamente por mi, podria haber usado cualquier otro o, idealmente,
        // alguna libreria como la clase HashCodeBuilder de Apache Commons Lang
        int result = 17;
        result = 37*result + numberOfCymbals;
        result = 37*result + numberOfDrums;
        result = 37*result + name.hashCode();

        return result;
    }
}
