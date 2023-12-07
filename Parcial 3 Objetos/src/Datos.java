import java.awt.*;
import java.io.*;

public class Datos implements ManejoDatos {
    @Override
    public void leerDatos(ListaAeropuertos listaAeropuertos, ListaVuelos listaVuelos, ListaCompañias listaCompañias){
        String linea;
        String seccion = null;
        Aeropuertos aeropuerto;
        Vuelos vuelos;
        Compañias compañias;
        try (BufferedReader br = new BufferedReader(new FileReader("vuelos.txt"))) {
            while ((linea = br.readLine()) != null) {
                linea = linea.trim();
                if (linea.isEmpty()) {
                    continue;
                }
                if (linea.startsWith("#")) {
                    seccion = linea;
                    continue;
                }
                if ("#Aeropuertos".equals(seccion)) {
                    String[] tokens = linea.split(";");
                    if (tokens.length >= 5) {
                        String code = tokens[0];
                        String name = tokens[1];
                        String population = tokens[2];
                        String country = tokens[3];
                        String GMT = tokens[4];
                        aeropuerto = new Aeropuertos(code, name, population, country, GMT);
                        listaAeropuertos.add(aeropuerto);
                    }
                }
                if ("#Vuelos".equals(seccion)) {
                    String[] tokens = linea.split(";");
                    if (tokens.length >= 9) {
                        String variable = tokens[0];
                        String origen = tokens[1];
                        String destino = tokens[2];
                        String plazas = tokens[6];
                        String duracion = tokens[3];
                        String compañia = tokens[4];
                        vuelos = new Vuelos(variable, origen, destino, Integer.parseInt(plazas), duracion);
                        listaVuelos.add(vuelos);
                        compañias = new Compañias(compañia);
                        listaCompañias.add(compañias);
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @Override
    public void escribirListaAeropuertos(ListaAeropuertos listaAeropuertos) {
        String nombreArchivo = "Lista de Aeropuertos.txt";
        String guiones ="-----------------------------------------------------------------------------------------------------";
        int tamaño = 0;
        try (PrintWriter writer = new PrintWriter(new FileWriter(nombreArchivo))) {
            writer.printf("%-20s %-30s %-20s %-20s %s%n", "Codigo", "Nombre", "Poblacion", "Pais", "GTM");
            writer.println(guiones);
            for (Aeropuertos aeropuerto : listaAeropuertos.getListaAeropuertos()) {
                writer.printf("%-20s %-30s %-20s %-20s %s%n", aeropuerto.getCodigo(), aeropuerto.getNombre(), aeropuerto.getPoblacion(), aeropuerto.getPais(), aeropuerto.getGMT());
                tamaño++;
            }
            writer.println(guiones);
            writer.println("Numero de Aeropuertos: " + tamaño);
            File archivo = new File(nombreArchivo);
            java.awt.Desktop.getDesktop().open(archivo);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @Override
    public void escribirListaVuelos(ListaAeropuertos listaAeropuertos, ListaVuelos listaVuelos) {
        String nombreArchivo = "Lista de Vuelos.txt";
        String guiones ="-----------------------------------------------------------------------------------------------------";

        try (PrintWriter writer = new PrintWriter(new FileWriter(nombreArchivo))) {
            writer.println("LISTA DE VUELOS");

            for (Aeropuertos aeropuerto : listaAeropuertos.getListaAeropuertos()) {
                writer.println(guiones);
                writer.println("");
                writer.println("Aeropuerto: " + aeropuerto.getNombre());
                writer.println("");
                writer.println("SALIDAS:");
                writer.println("");
                writer.printf("%-15s %-15s %-15s %s%n", "Origen", "Destino", "Plazas", "Duracion");
                writer.println("");
                int tamaño = 0;
                for(Vuelos vuelo : listaVuelos.getListaVuelos()){
                    if(vuelo.getVariable().equals("C")){
                        if(vuelo.getOrigen().equals(aeropuerto.getCodigo())){
                            writer.printf("%-15s %-15s %-15s %s%n", vuelo.getOrigen(), vuelo.getDestino(), vuelo.getPlazas(), vuelo.getDuracion());
                            tamaño++;
                        }
                    }
                }
                writer.println("");
                writer.println("Numero de salidas: " + tamaño);
                tamaño = 0;
                writer.println("");
                writer.println("LLEGADAS:");
                writer.println("");
                writer.printf("%-15s %-15s %-15s %s%n", "Origen", "Destino", "Plazas", "Duracion");
                writer.println("");
                for(Vuelos vuelo : listaVuelos.getListaVuelos()){
                    if(vuelo.getVariable().equals("C")){
                        if(vuelo.getDestino().equals(aeropuerto.getCodigo())){
                            writer.printf("%-15s %-15s %-15s %s%n", vuelo.getOrigen(), vuelo.getDestino(), vuelo.getPlazas(), vuelo.getDuracion());
                            tamaño++;
                        }
                    }
                }
                writer.println("");
                writer.println("Numero de entradas: " + tamaño);
            }
            File archivo = new File(nombreArchivo);
            java.awt.Desktop.getDesktop().open(archivo);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}