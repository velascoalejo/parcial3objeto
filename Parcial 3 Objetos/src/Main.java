import java.util.List;

public class Main {
    public static void main(String[] args) {

    ListaAeropuertos listaAeropuertos = new ListaAeropuertos();
    ListaVuelos listaVuelos = new ListaVuelos();
    ListaCompañias listaCompañias = new ListaCompañias();
    ManejoDatos datos = new Datos();
    datos.leerDatos(listaAeropuertos, listaVuelos, listaCompañias);
    Menu menu = new Menu();
        .menu.mostrarMenu(listaAeropuertos, listaVuelos);

    //listaAeropuertos.showList();
    //listaVuelos.showList();
    //listaCompañias.showList();

    }
}