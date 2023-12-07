import java.util.ArrayList;
import java.util.List;

public class ListaVuelos {
    private List<Vuelos> listaVuelos;

    public ListaVuelos(List<Vuelos> listaVuelos) {
        this.listaVuelos = listaVuelos;
    }

    public ListaVuelos() {
        listaVuelos = new ArrayList<>();
    }

    public List<Vuelos> getListaVuelos() {
        return listaVuelos;
    }

    public void add(Vuelos vuelos){
        listaVuelos.add(vuelos);
    }

    public void showList(){
        for(Vuelos vuelos: listaVuelos){
            vuelos.showInfo();
        }
    }
}
