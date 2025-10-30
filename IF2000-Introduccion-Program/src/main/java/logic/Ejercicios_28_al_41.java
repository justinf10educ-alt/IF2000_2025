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
public class Ejercicios_28_al_41 {
    
    Scanner sc = new Scanner(System.in);
    
    public void producto_dos_numeros_29(){
        
        int num1;
        int num2;
        int product = 0;
        
        System.out.println("Enter the first number: ");
        num1=sc.nextInt();
           
        System.out.println("Enter the second number: ");
        num2=sc.nextInt();
        
       for (int i=1; i<=num2; i++){
           
           product=product+num1;
       }  
       
       System.out.println("The product is: " + product);
        
    }//end the exercise.
    
    public void tablas_de_multiplicacion_30(){
        
        int num1;
        int result;
        for (int i=0; i>=12; i++){
            
            num1=num1+i;
            
            for (int j=0; j>=10; i++){
                
               result=num1*j;
               System.out.println(result);
            }
            
            System.out.println("El resultado es: " + result);
        }
    
    
    
    }
    
    
}
