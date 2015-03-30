package negocio;

public class ElectricGuitar extends StringedInstrument {

    public ElectricGuitar() {
        this.name = "Fender";
        this.numberOfStrings = 6;
    }

    public ElectricGuitar(String name, int numberOfStrings) {
        this.name = name;
        this.numberOfStrings = numberOfStrings;
    }

    @Override public void play() {
        System.out.println(name + " guitar of " + numberOfStrings + "-string");
    }
}
