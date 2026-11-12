package ejercicio3;

public class Elefante extends Animal implements Alimento {
    public Elefante(String nombre, int edad) {
        super("Elefante", nombre, edad);
    }

    @Override
    public void hacerSonido() {
        System.out.println("El elefante " + getNombre() + " trompetea: Prrrf");
    }

    @Override
    public void alimentar() {
        System.out.println("Alimentando al elefante " + getNombre() + " con hojas y ramas.");
    }
}
