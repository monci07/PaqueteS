package test;

public class pruebas {

    public static void main(String[] args) {
        paquete1.Persona p = new paquete1.Persona(25,"maria");
        paquete2.Persona m = new paquete2.Persona(20,"Jose","masculino");

        System.out.println(p.toString());
        System.out.println(m.toString());
    }
}
