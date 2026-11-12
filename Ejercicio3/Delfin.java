package ejercicio3;

public class Delfin extends Animal implements Alimento {
    public Delfin(String nombre, int edad) {
        super("Delfin", nombre, edad);
    }

    @Override
    public void hacerSonido() {
        System.out.println("El delfin " + getNombre() + " emite chasquidos: Click-click");
    }

    @Override
    public void alimentar() {
        System.out.println("Alimentando al delfin " + getNombre() + " con pescado fresco.");
    }
}
