import java.util.ArrayList;
import java.util.List;

public class ListaAeropuertos {
    private List<Aeropuertos> listaAeropuertos;

    public ListaAeropuertos(List<Aeropuertos> listaAeropuertos) {
        this.listaAeropuertos = listaAeropuertos;
    }
    public ListaAeropuertos() {
        listaAeropuertos = new ArrayList<>();
    }

    public List<Aeropuertos> getListaAeropuertos() {
        return listaAeropuertos;
    }

    public void add(Aeropuertos aeropuertos){
        listaAeropuertos.add(aeropuertos);
    }

    public void showList(){
        for(Aeropuertos aeropuertos: listaAeropuertos){
            aeropuertos.showInfo();
        }
    }

}
