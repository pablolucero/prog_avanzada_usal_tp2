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

}
