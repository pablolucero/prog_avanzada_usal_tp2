package negocio;

import java.util.*;

public class BandsEquipment {

    private List<PercussionInstrument> percussion = new ArrayList<>();
    private List<StringedInstrument> stringed = new ArrayList<>();

    public static BandsEquipment generarEquipoVacio() {
        return new BandsEquipment();
    }

    public static BandsEquipment generarEquipoBasico() {
        final BandsEquipment bandsEquipment = new BandsEquipment();
        bandsEquipment.getPercussion().add(new Drums());
        bandsEquipment.getStringed().add(new ElectricGuitar());
        bandsEquipment.getStringed().add(new ElectricBassGuitar());
        return bandsEquipment;
    }

    public static BandsEquipment generarEquipoFull() {
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

        System.out.println("Test sound");

        final List<StringedInstrument> stringed = getStringed();
        Set<StringedInstrument> stringedSet = new HashSet<>(stringed);

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

        List<PlugType> plugTypeList = new ArrayList<>();

        for (StringedInstrument stringedInstrument : stringed) {
            if (stringedInstrument instanceof ElectricGuitar) {
                plugTypeList.add(((ElectricGuitar) stringedInstrument).getPlug());
            }

            if (stringedInstrument instanceof ElectricBassGuitar) {
                plugTypeList.add(((ElectricBassGuitar) stringedInstrument).getPlug());
            }
        }

        System.out.println("Need");

        for (PlugType plugType : PlugType.values()) {
            final int frequency = Collections.frequency(plugTypeList, plugType);
            if (frequency > 0)
                System.out.println(frequency + " " + plugType + " plug");
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
