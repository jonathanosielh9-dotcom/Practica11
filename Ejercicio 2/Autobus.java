/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistematransporte;

/**
 *
 * @author fita
 */
public class Autobus extends Vehiculo {

    public Autobus(String modelo, double combustibleInicial) {
        super(modelo, combustibleInicial);
    }

    @Override
    public double calcularConsumo(double km) {
        return km * 20.0; // 20% por km
    }
}
