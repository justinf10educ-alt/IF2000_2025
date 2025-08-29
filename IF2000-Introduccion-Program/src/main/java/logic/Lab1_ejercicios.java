/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logic;
import java.util.Scanner;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author Justin Flores
 */
public class Lab1_ejercicios {
    
    Scanner sc = new Scanner(System.in);
    
  public void Ejercicio1(){

      int num1 = 0;
      System.out.println("Digite el número: ");
      num1 = sc.nextInt();
      
      if (num1%2 ==0 ){
      System.out.println("El número ingresado es par: ");
      }//end if
      else{
      System.out.println("El número ingresado es impar: ");
      }//end else.

}//end method
  
  public void Ejercicio2(){
  
  int numab = 0;
  
  System.out.println("Digite el numero: ");
  numab=sc.nextInt();
  
  if (numab < 0){
      
      numab = -numab;
  }
  else {
      numab = numab;
  }
  System.out.println("El valor absoluto es: " + numab);
  
  }//end method
  
  public void Ejercicio3(){
  
  int sum = 0;
  int num = 3;
  
  while (num <= 99){
    System.out.println("" + num);
    sum = sum + num;
    num = num + 3;
      
  }
  System.out.println("La sumatoria de los numeros es de: " + sum);
  }
  
  public void Ejercicio4(){
  
  int[] nums = new int [3];
  
  Scanner sc = new Scanner(System.in);
  
      for (int i = 0; i < nums.length; i++) {
          
          System.out.println("Digite un numero: ");
          
          nums [i] = sc.nextInt();    
      }//end firs for
      
      System.out.println("El arreglo de forma desordenada");
      
      for (int j = 0; j < nums.length; j++) {
          
          System.out.println(nums[j] + ",");    
      }//end two for
  
  System.out.println();
  Arrays.sort(nums);
  System.out.println("El arreglo de forma ordenada");
      for (int k = 0; k < nums.length; k++) {
          
         System.out.print(nums[k] + ",");
          
      }
  
  }
  
  public void Ejercicio5(){
      
      int num1 = 0;
      int num2 = 0;
      int result = 0;
      
      System.out.println("Digite el primer numero: ");
      num1=sc.nextInt();
      
      System.out.println("Digite el segundo numero: ");
      num2=sc.nextInt();
      
      if (num1 == num2){
      
      result = num1*num2;
      
      System.out.println("El resultado de la multiplicacion es: " + result);
      }
      else if (num1 > num2){
              
      result = num1 - num2;
      
      System.out.println("El resultado de la resta es: " + result);
              
              }
      else{
      
      result = num2 + num1;
              
       System.out.println("El resultado de la suma es: " + result);
      }
  
  }//end method
  
  public void Ejercicio6(){
  
  Scanner sc = new Scanner(System.in);
  
  boolean ten = false;
  int note;
  
  do{
  System.out.println("Ingrese una nota del 0 al 10 o puede poner -1 para terminar de ejecutar");
  System.out.println("Ingrese una nota del 0 al 10: ");
  note = sc.nextInt();
  
  if(note == 10){
      
      ten = true;
  }
  }while (note != -1);
  
  if (ten){
      
      System.out.println("Sí hay una nota de 10: ");
  }
  
  else{
      
      System.out.println("No hay una nota de 10: ");
  }
  
  }//end method
  
  public void Ejercicio7(){
  
  Scanner sc = new Scanner(System.in);
  
  System.out.println("Ingrese su sexo (Femenino/Masculino: ");
  String sexo = sc.next();
  
  System.out.println("Ingrese su edad (año)");
  double edad = sc.nextDouble();
  
  double pulsaciones;
  
  if (sexo.equalsIgnoreCase("Femenino")){
  
  /*El squarsignoreCase, nos permite que el usuario al ingrese "Femenino o Masculino"
      no le sea exigido en mayuscula, debido a que si lo ingresa en minuscula lo tomará
      como masculino*/
     
  pulsaciones = (220 - edad)/10;
  }
  else{
      
      pulsaciones = (210 - edad) / 10;
  }
  
  System.out.println("El numero de pulsaciones es de: " + pulsaciones + " su sexo es: " + sexo);
  }//end method
  
  public void Ejercicio8(){
  
  Scanner sc = new Scanner(System.in);

    System.out.print("Ingrese el salario mensual: ");
    double salario = sc.nextDouble();

    System.out.print("Ingrese los años de antigüedad: ");
    int antiguedad = sc.nextInt();

    double utilidad;

    if (antiguedad < 1) {
        utilidad = salario * 0.05;
    } else if (antiguedad >= 1 && antiguedad < 2) {
        utilidad = salario * 0.07;
    } else if (antiguedad >= 2 && antiguedad < 5) {
        utilidad = salario * 0.10;
    } else if (antiguedad >= 5 && antiguedad < 10) {
        utilidad = salario * 0.15;
    } else {
        utilidad = salario * 0.20;
    }

    System.out.println("La utilidad a recibir es: " + utilidad);

  }//end method
  
  public void Ejercicio9(){
  
  Scanner sc = new Scanner(System.in);
     int suma = 0;
     System.out.println("Digite el número: ");
     int numero= sc.nextInt();
     
         for (int i = 1; i <= numero; i++) {
             int auxiliar = numero%i;
             if (auxiliar==0){
                 suma = suma + 1;     
             }   
         }
        if(suma==2){
        System.out.println("El numero si es primo");
        } 
        else{
            System.out.println("El numero no es primo");
        }
         
     }//end method
  
  public void Ejercicio10(){
  
  Scanner sc = new Scanner(System.in);

    final double precioUnitario = 11000;
    System.out.print("Ingrese la cantidad de computadoras que comprará: ");
    int cantidad = sc.nextInt();

    double precioTotal = cantidad * precioUnitario;
    double descuento;

    if (cantidad < 5) {
        descuento = precioTotal * 0.10;
    } else if (cantidad >= 5 && cantidad < 10) {
        descuento = precioTotal * 0.20;
    } else {
        descuento = precioTotal * 0.40;
    }

    double totalPagar = precioTotal - descuento;

    System.out.println("Cantidad de computadoras es de: " + cantidad);
    System.out.println("Precio total sin descuento es de: $" + precioTotal);
    System.out.println("Monto descontado es de : $" + descuento);
    System.out.println("Monto total a pagar es de: $" + totalPagar);

  
  }
  
  public void Ejercicio11(){
  
  Scanner sc = new Scanner(System.in);
    System.out.println("Digite un número (num >= 2):");
    int n = sc.nextInt();

    if (n < 2) {
        System.out.println("No hay números primos menores que 2");
        return; 
    }

    // genera una lista con List
    List<Integer> primos = new ArrayList<>();
    for (int i = 2; i <= n; i++) {
        boolean esPrimo = true;
        for (int j = 2; j * j <= i; j++) {
            if (i % j == 0) {
                esPrimo = false;
                break;
            }
        }
        if (esPrimo) primos.add(i); 
    }

    System.out.println("Los números primos entre 2 y " + n + " son: " + primos);
  
  }//end method
  
  public void Ejercicio12(){
  
  Scanner sc = new Scanner(System.in);
       int base;
       int altura;
       int area;
       
       System.out.println("ingrese la base del triángulo");
       base = sc.nextInt();
       
       System.out.println("ingrese la altura del triángulo");
       altura = sc.nextInt();
       
       area= (base*altura)/2;
       
       System.out.println("El area es de: " + area);
  }//end method
    
}//end principal public
