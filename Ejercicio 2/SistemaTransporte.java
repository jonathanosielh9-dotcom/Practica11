/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistematransporte;

/**
 *
 * @author fita
 */
public class SistemaTransporte {
    public static void main(String[] args) {
        Vehiculo[] flota = new Vehiculo[5];

        flota[0] = new Automovil("Sedán Compacto", 100.0);
        flota[1] = new Autobus("Autobús Urbano", 100.0);
        flota[2] = new CamionDeCarga("Camión (Sin carga)", 100.0, 0.0);
        flota[3] = new CamionDeCarga("Camión (Carga 120 kg)", 100.0, 120.0);
        flota[4] = new CamionDeCarga("Camión (Carga 250 kg)", 100.0, 250.0);

        double distanciaViaje = 3.0;

        System.out.println("=== SIMULACIÓN DE RECORRIDO (" + distanciaViaje + " km) ===");
        for (Vehiculo v : flota) {
            v.recorrer(distanciaViaje); 
        }
    }
    
}