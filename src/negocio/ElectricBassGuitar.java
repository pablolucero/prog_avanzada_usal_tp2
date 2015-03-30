package negocio;

public class ElectricBassGuitar extends StringedInstrument {

    public ElectricBassGuitar() {
        this.name = "Spector";
        this.numberOfStrings = 5;
    }

    public ElectricBassGuitar(String name, int numberOfStrings) {
        this.name = name;
        this.numberOfStrings = numberOfStrings;
    }

    @Override public void play() {
        System.out.println(name + " bass guitar of " + numberOfStrings + "-string");
    }
}
