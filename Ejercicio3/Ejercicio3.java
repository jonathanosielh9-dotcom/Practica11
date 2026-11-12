package ejercicio3;

import java.util.ArrayList;

public class Ejercicio3 {

    public static void main(String[] args) {
        ArrayList<Animal> zoo = new ArrayList<>();

        zoo.add(new Leon("Simba", 5));
        zoo.add(new Elefante("Dumbo", 10));
        zoo.add(new Delfin("Flipi", 7));
        zoo.add(new Loro("Pancho", 2));
        zoo.add(new OsoPolar("Nieve", 8));

        System.out.println("\t\t Bienvenidos al Zoologico ");
        System.out.println("Contamos con " + zoo.size() + " animales dentro del resinto\n");

        System.out.println("Presentacion de los animales:");
        for (Animal animal : zoo) {
            animal.presentar();
            animal.hacerSonido();
            System.out.println("\n\n");
        }

        System.out.println("\n Hora de alimentar a los animales");
        for (Animal animal : zoo) {
            if (animal instanceof Alimento) {
                ((Alimento) animal).alimentar();
            } else {
                System.out.println(animal.getNombre() + " no requiere alimentacion asistida.");
            }
        }
    }
    
}
