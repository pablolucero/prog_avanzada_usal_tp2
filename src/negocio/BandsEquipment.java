package negocio;

import java.util.*;

public class BandsEquipment {

    private List<PercussionInstrument> percussion = new ArrayList<>();
    private List<StringedInstrument> stringed = new ArrayList<>();

    // Default constructor
    public BandsEquipment() {
        getPercussion().add(new Drums());
        getStringed().add(new ElectricGuitar());
        getStringed().add(new ElectricBassGuitar());
    }

    public BandsEquipment(List<PercussionInstrument> percussion, List<StringedInstrument> stringed) {
        this.percussion = percussion;
        this.stringed = stringed;
    }

    public static BandsEquipment generarBandsEquipmentFull() {

        final BandsEquipment bandsEquipment = new BandsEquipment();
        bandsEquipment.getStringed().add(new ElectricGuitar("Gibson", 6));
        bandsEquipment.getStringed().add(new ElectricGuitar("Gibson", 6));
        bandsEquipment.getStringed().add(new ElectricBassGuitar("Archer", 5));
        bandsEquipment.getPercussion().add(new Drums("Tama", 5, 7));
        return bandsEquipment;
    }

    public void addStringedInstrument(StringedInstrument i) {
        getStringed().add(i);
    }

    public void addPercussionInstrument(PercussionInstrument i) {
        getPercussion().add(i);
    }

    public void pruebaDeSonido() {

        final List<StringedInstrument> stringed = getStringed();
        Set<Instrument> stringedSet = new HashSet<>(stringed);

        for (Instrument stringedInstrument : stringedSet) {
            System.out.print(Collections.frequency(stringed, stringedInstrument) + " ");
            stringedInstrument.play();
        }

        final List<PercussionInstrument> percussion = getPercussion();
        Set<PercussionInstrument> percussionSet = new HashSet<>(percussion);

        for (Instrument percussionInstrument : percussionSet) {
            System.out.print(Collections.frequency(percussion, percussionInstrument) + " ");
            percussionInstrument.play();
        }

    }

    public List<PercussionInstrument> getPercussion() {
        return percussion;
    }

    public void setPercussion(List<PercussionInstrument> percussion) {
        this.percussion = percussion;
    }

    public List<StringedInstrument> getStringed() {
        return stringed;
    }

    public void setStringed(List<StringedInstrument> stringed) {
        this.stringed = stringed;
    }
}
