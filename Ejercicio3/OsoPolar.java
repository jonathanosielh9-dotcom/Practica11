package ejercicio3;

public final class OsoPolar extends Animal implements Alimento {
    public OsoPolar(String nombre, int edad) {
        super("Oso Polar", nombre, edad);
    }

    @Override
    public void hacerSonido() {
        System.out.println("El oso polar " + getNombre() + " ruge en el hielo: Grunidos");
    }

    @Override
    public void alimentar() {
        System.out.println("Alimentando al oso polar " + getNombre() + " con salmon fresco.");
    }
}
