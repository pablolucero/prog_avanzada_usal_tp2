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
}
