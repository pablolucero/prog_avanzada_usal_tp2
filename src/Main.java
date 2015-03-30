import negocio.BandsEquipment;
import negocio.ElectricGuitar;
import negocio.StringedInstrument;
import presentacion.Menu;

import java.util.*;

public class Main {

    public static void main(String[] args) {

//        final ElectricGuitar gibson = new ElectricGuitar("Gibson", 6);
//        final ElectricGuitar gibson2 = new ElectricGuitar("Gibson", 6);
//
//        Set set = new HashSet<StringedInstrument>();
//        set.add(gibson);
//        set.add(gibson);
//        System.out.println("set.size(): " + set.size());
//
//        List lista = new ArrayList<StringedInstrument>();
//        lista.add(gibson);
//        lista.add(gibson);
//
//        System.out.println(Collections.frequency(lista, gibson));
//
//        System.out.println(gibson.equals(gibson2));


        final BandsEquipment bandsEquipmentFull = BandsEquipment.generarBandsEquipmentFull();
        bandsEquipmentFull.pruebaDeSonido();

        System.out.println(" ");

        final BandsEquipment bandsEquipment = new BandsEquipment();
        bandsEquipment.pruebaDeSonido();

//
//        Menu menu = new Menu();
//        menu.mostrarMenu();
//        int opcion = menu.getOpcion();
//
//        boolean fin = false;
//
//        while (!fin) {
//
//            switch (opcion) {
//
//                case 1:
//                    final BandsEquipment bandsEquipment = new BandsEquipment();
////                    for (String s : bandsEquipment.) {
////
////                    }
//                    break;
//
//                case 2:
//
//                    break;
//
//                case 3:
//
//                    break;
//
//                case 4:
//                    menu.printFinDelPrograma();
//                    fin = true;
//                    break;
//
//                default:
//                    menu.printOpcionInvalida();
//                    opcion = menu.getOpcion();
//                    break;
//            }
//        }
    }
}
