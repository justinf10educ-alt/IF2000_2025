/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logic;
import java.util.Scanner;

/**
 *
 * @author Justin Flores
 */
public class Práctica_examen_1 {
    
    Scanner entrada = new Scanner(System.in);
    
    public void Num_48(){
    
    String fecha;
    
    System.out.println("Digite la fecha: ");
    fecha = entrada.nextLine();
    
    String dia = fecha.substring(0,2);
    String mes = fecha.substring(3,5);
    String año = fecha.substring(6,10);
    
    int numdia=Integer.parseInt(dia);
    numdia++;
    
    System.out.println("El día es: " + numdia);
    }
}    
        
        
