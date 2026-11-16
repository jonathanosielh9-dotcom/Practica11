/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package orquestaproyecto;

/**
 *
 * @author fita
 */
public class Orquestaproyecto {
    public static void main(String[] args) {
        Instrumento[] instrumentos = new Instrumento[3];
        
        instrumentos[0] = new Guitarra();
        instrumentos[1] = new Piano();
        instrumentos[2] = new Bateria();

        System.out.println("--- Concierto de instrumentos ---");
        for (Instrumento inst : instrumentos) {
            inst.hacerSonido();
        }
    }
    
}
