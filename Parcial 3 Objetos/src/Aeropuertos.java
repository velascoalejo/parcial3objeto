public class Aeropuertos {
    private String codigo;
    private String nombre;
    private String poblacion;
    private String pais;
    private String GMT;

    public Aeropuertos(String codigo, String nombre, String poblacion, String pais, String GMT) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.poblacion = poblacion;
        this.pais = pais;
        this.GMT = GMT;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(String poblacion) {
        this.poblacion = poblacion;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getGMT() {
        return GMT;
    }

    public void setGMT(String GMT) {
        this.GMT = GMT;
    }

    public void showInfo(){
        System.out.println("Codigo: " + codigo);
        System.out.println("Nombre: " + nombre);
        System.out.println("Poblacion: " + poblacion);
        System.out.println("Pais: " + pais);
        System.out.println("GMT: " + GMT);
        System.out.println("");
    }
}