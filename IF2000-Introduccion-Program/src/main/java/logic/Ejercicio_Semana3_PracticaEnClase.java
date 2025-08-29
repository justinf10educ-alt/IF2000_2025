/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logic;

/**
 *
 * @author Justin Flores
 */
public class Ejercicio_Semana3_PracticaEnClase {
    
    public void Parte3() {
        int filas = 5;
        int columnas = 9;

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                // Bordes superior e inferior
                if (i == 0 || i == filas - 1) {
                    System.out.print("*");
                }
                // Bordes laterales y asterisco central
                else if (j == 0 || j == columnas - 1 || (i == 2 && j == 4)) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    
}
