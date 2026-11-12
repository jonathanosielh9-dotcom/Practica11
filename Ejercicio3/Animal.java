package ejercicio3;

public abstract class Animal {
    private String tipo;
    private String nombre;
    private int edad;

    public Animal(String tipo, String nombre, int edad) {
        this.tipo = tipo;
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getTipo() {
        return tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void presentar() {
        System.out.println("Tipo: " + tipo + " | Nombre: " + nombre + " | Edad: " + edad + " anios");
    }

    public abstract void hacerSonido();
}
