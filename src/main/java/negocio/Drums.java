package negocio;

public class Drums extends PercussionInstrument {

    public Drums() {
        this.name = "Pearl";
        this.numberOfCymbals = 3;
        this.numberOfDrums = 5;
    }

    public Drums(String name, int numberOfCymbals, int numberOfDrums) {
        this.name = name;
        this.numberOfCymbals = numberOfCymbals;
        this.numberOfDrums = numberOfDrums;
    }

    @Override public void play() {
        System.out.println(name + " drum of " + numberOfCymbals + " cymbals and " + numberOfDrums + " drums");
    }

    @Override public boolean equals(Object obj) {

        if (obj == null || !(obj instanceof Drums))
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
        result = 37*result + getClass().hashCode();

        return result;
    }
}
