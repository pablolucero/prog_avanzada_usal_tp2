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

}
