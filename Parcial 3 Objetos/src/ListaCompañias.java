import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class ListaCompañias {
    private List<Compañias> listaCompañias;

    public ListaCompañias(List<Compañias> listaCompañias) {
        this.listaCompañias = listaCompañias;
    }

    public ListaCompañias() {
        listaCompañias = new ArrayList<>();
    }

    public List<Compañias> getListaCompañias() {
        return listaCompañias;
    }

    public void add(Compañias compañias){
        boolean encontrado = false;
        for (Compañias compañias1 : listaCompañias) {
            if (compañias1.getNombre().equals(compañias.getNombre())) {
                encontrado = true;
                break;
            }
        }
        if(encontrado != true){
            listaCompañias.add(compañias);
        }
    }

    public void showList(){
        for(Compañias compañias : listaCompañias){
            compañias.showInfo();
        }
    }
}
