package paquete1;

public class Persona {
    private int edad;
    private String nombre;

    public Persona(int edad, String nombre){
        setEdad(edad);
        setNombre(nombre);
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "Persona [edad=" + edad + ", nombre=" + nombre + ']';
    }
}
