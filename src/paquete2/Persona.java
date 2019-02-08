package paquete2;

public class Persona {
    private int edad;
    private String nombre;
    private String genero;

    public Persona(int edad, String nombre, String genero){
        setEdad(edad);
        setGenero(genero);
        setNombre(nombre);
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getGenero() {
        return genero;
    }
}
