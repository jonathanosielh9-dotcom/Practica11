/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistematransporte;

/**
 *
 * @author fita
 */
public class Automovil extends Vehiculo {

    public Automovil(String modelo, double combustibleInicial) {
        super(modelo, combustibleInicial);
    }

    @Override
    public double calcularConsumo(double km) {
        return km * 10.0; 
    }
}
