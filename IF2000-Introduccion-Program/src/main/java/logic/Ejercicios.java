/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logic;

/**
 *
 * @author Justin Flores
 */
public class Ejercicios {
    
    public boolean capicua(int n){
        
        int numOriginal = 0;
        int numeroInvertido=0;
        int digito=0;
        
        while(n >0){
            
            digito = n%10;
            numInvertido=(numInvertido*10)+ digito;
            n = n/10;
        }
        
       if(numInvertido==n);
    }
    
}
