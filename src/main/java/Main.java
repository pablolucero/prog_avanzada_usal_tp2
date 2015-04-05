import negocio.BandsEquipment;
import negocio.Drums;
import negocio.ElectricBassGuitar;
import negocio.ElectricGuitar;
import presentacion.Menu;

import static presentacion.IOManager.*;

public class Main {

    public static void main(String[] args) {

        Menu menu = new Menu();
        boolean fin = false;

        while (!fin) {
            menu.mostrarMenu();
            int opcionMenuPrincipal = menu.getOpcion();

            switch (opcionMenuPrincipal) {

                case 1:
                    BandsEquipment.generarEquipoBasico().pruebaDeSonido();
                    break;

                case 2:
                    BandsEquipment.generarEquipoFull().pruebaDeSonido();
                    break;

                case 3:
                    menu.printCrearBandaOpciones();
                    int opcionBanda = menu.getOpcion();

                    final BandsEquipment customBand = BandsEquipment.generarEquipoVacio();

                    while (opcionBanda != 5) {

                        switch (opcionBanda) {
                            case 1: // agregar guitarra
                                final String guitarName = leerLinea("Ingrese el nombre");
                                final int guitarStrings = leerEntero("Ingrese la cantidad de cuerdas", "Ingrese un numero");
                                customBand.addStringedInstrument(new ElectricGuitar(guitarName, guitarStrings));
                                break;
                            case 2: // agregar bajo
                                final String bassName = leerLinea("Ingrese el nombre");
                                final int bassStrings = leerEntero("Ingrese la cantidad de cuerdas", "Ingrese un numero");
                                customBand.addStringedInstrument(new ElectricBassGuitar(bassName, bassStrings));
                                break;
                            case 3: // agregar bateria
                                final String drumName = leerLinea("Ingrese el nombre");
                                final int platillos = leerEntero("Ingrese la cantidad de platillos", "Ingrese un numero");
                                final int tambores = leerEntero("Ingrese la cantidad de tambores", "Ingrese un numero");
                                customBand.addPercussionInstrument(new Drums(drumName, platillos, tambores));
                                break;
                            case 4: // prueba de sonido para el nuevo equipo
                                customBand.pruebaDeSonido();
                                break;
                        }

                        menu.printCrearBandaOpciones();
                        opcionBanda = menu.getOpcion();
                    }
                    break;

                case 4:
                    menu.printFinDelPrograma();
                    fin = true;
                    break;

                default:
                    menu.printOpcionInvalida();
                    break;
            }
        }
    }
}
