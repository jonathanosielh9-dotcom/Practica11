/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistematransporte;

/**
 *
 * @author fita
 */
public abstract class Vehiculo {
    protected String modelo;
    protected double combustible; 

    public Vehiculo(String modelo, double combustibleInicial) {
        this.modelo = modelo;
        this.combustible = combustibleInicial;
    }
    
    public abstract double calcularConsumo(double km);

    public void recorrer(double km) {
        double consumo = calcularConsumo(km);
        combustible -= consumo;
        if (combustible < 0) {
            combustible = 0;
        }
        System.out.printf("[%s] Recorrió %.1f km | Consumo: %.1f%% | Combustible restante: %.1f%%\n",
                modelo, km, consumo, combustible);
    }

    public double getCombustible() {
        return combustible;
    }
}
