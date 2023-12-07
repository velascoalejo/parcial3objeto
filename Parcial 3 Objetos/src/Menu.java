import java.util.Scanner;

public class Menu {
    public void mostrarMenu(ListaAeropuertos listaAeropuertos, ListaVuelos listaVuelos){
        Scanner scanner = new Scanner(System.in);
        ManejoDatos datos = new Datos();
        int opcion;
        do {
            System.out.println("Menú:");
            System.out.println("1. Mostrar aeropuertos.");
            System.out.println("2. Mostrar los vuelos.");
            System.out.println("3. Salir");
            System.out.print("Elige una opción: ");

            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    datos.escribirListaAeropuertos(listaAeropuertos);
                    break;
                case 2:
                    datos.escribirListaVuelos(listaAeropuertos, listaVuelos);
                    break;
                case 3:
                    System.out.println("Hasta la proxima.");
                    break;
                default:
                    System.out.println("Digite una opcion valida.");
                    break;
            }
        } while (opcion != 3);
        scanner.close();
    }
}
