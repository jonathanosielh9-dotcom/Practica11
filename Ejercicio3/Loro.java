package ejercicio3;

public class Loro extends Animal {
    public Loro(String nombre, int edad) {
        super("Loro", nombre, edad);
    }

    @Override
    public void hacerSonido() {
        System.out.println("El loro " + getNombre() + " habla: Hola, bonito");
    }
}
