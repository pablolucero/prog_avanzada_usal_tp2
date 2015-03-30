package presentacion;

public class Menu extends IOManager {

    public void mostrarMenu() {
        IOManager.print("Seleccione una opcion:");
        IOManager.print("1. Prueba de sonido para equipo básico");
        IOManager.print("2. Prueba de sonido para equipo full");
        IOManager.print("3. Armar equipo para banda");
        IOManager.print("4. Salir");
    }

    public int getOpcion() {
        int opcion = IOManager.leerEntero("Seleccione la opcion", "Debe seleccionar un numero");
        return opcion;
    }

    public String leerCadena(String queLeer) {
        return IOManager.leerLinea("Ingrese el " + queLeer);
    }

//    public void mostrarResultado(Persona p) {
//        IOManager.print("Nombre: " + p.getNombre() + " " + p.getApellido());
//        IOManager.print("Email: " + p.getEmail());
//        IOManager.print("Direccion: " + p.getDireccion());
//    }

    public void printOpcionInvalida() {
        IOManager.print("Ha seleccionado una opcion invalida");
    }

    public void printFinDelPrograma() {
        IOManager.print("Fin del programa");
    }
}