public class Compañias {
    private String nombre;

    public Compañias(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void showInfo(){
        System.out.println("Nombre: " + nombre);
        System.out.println("");
    }
}
