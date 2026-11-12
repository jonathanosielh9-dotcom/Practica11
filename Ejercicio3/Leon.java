package ejercicio3;

public class Leon extends Animal implements Alimento {
    public Leon(String nombre, int edad) {
        super("Leon", nombre, edad);
    }

    @Override
    public void hacerSonido() {
        System.out.println("El leon " + getNombre() + " ruge fuertemente: Groar");
    }

    @Override
    public void alimentar() {
        System.out.println("Alimentando al leon " + getNombre() + " con carne fresca.");
    }
}
