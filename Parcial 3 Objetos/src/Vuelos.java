public class Vuelos {
    private String variable;
    private String origen;
    private String destino;
    private int plazas;
    private String duracion;

    public Vuelos(String variable, String origen, String destino, int plazas, String duracion) {
        this.variable = variable;
        this.origen = origen;
        this.destino = destino;
        this.plazas = plazas;
        this.duracion = duracion;
    }

    public String getVariable() {
        return variable;
    }

    public void setVariable(String variable) {
        this.variable = variable;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public int getPlazas() {
        return plazas;
    }

    public void setPlazas(int plazas) {
        this.plazas = plazas;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public void showInfo(){
        System.out.println("Orgien: " + origen);
        System.out.println("Destino: " + destino);
        System.out.println("Plazas: " + plazas);
        System.out.println("Duracion: " + duracion);
        System.out.println("");
    }
}
