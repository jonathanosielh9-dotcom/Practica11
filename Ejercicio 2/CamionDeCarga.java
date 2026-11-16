/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistematransporte;

/**
 *
 * @author fita
 */
public class CamionDeCarga extends Vehiculo {
    private double cargaKg;

    public CamionDeCarga(String modelo, double combustibleInicial, double cargaKg) {
        super(modelo, combustibleInicial);
        this.cargaKg = cargaKg;
    }

    public void setCargaKg(double cargaKg) {
        this.cargaKg = cargaKg;
    }

    @Override
    public double calcularConsumo(double km) {
        double tasaPorKm;

        if (cargaKg <= 0) {
            tasaPorKm = 10.0; 
        } else if (cargaKg <= 150) {
            tasaPorKm = 15.0; 
        } else {
            tasaPorKm = 20.0; 
        }

        return km * tasaPorKm;
    }
}