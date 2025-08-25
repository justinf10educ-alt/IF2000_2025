/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logic;


/**
 *
 * @author Justin Flores
 */
import java.util.Scanner;
import java.util.Random;
public class Ejercicio_Semana2_PracticaEnClase {

    public void Quiz2_piramide(int n) {

        for (int i = 1; i <= n; i++) {
            // Controla los espacios
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }//end for interno 1

            // Imprimir asteriscos
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }//end for interno 2

            // Salto de línea al final de cada fila
            System.out.println();
        }//end for externo;

    }//Quiz2
    
    public void Ejercicio_A(int n) {
        
    for (int i = 1; i <= n; i++) {
    if (i == 1 || i == n) {
        for (int j = 1; j <= n; j++) {
            System.out.print("* ");
        }
    } else {
        System.out.print("* ");
        for (int j = 1; j <= n - 2; j++) {
            System.out.print("  ");
        }
        System.out.print("*");
    }
    System.out.println();
}  
    
}
    
   public void Ejercicio_B(int n){
   
       for (int i = 1; i <= n; i++) {
        for (int j = 1; j <= (n - i + 1); j++) {
            System.out.print("*");
        }
        System.out.println(); // Salto de línea
    }
   
   }
   
   public void Ejercicio_C(int n){
   
   for (int i = 1; i <= n; i++) {
        for (int j = 1; j < i; j++) {
            System.out.print(" "); // Espacios
        }
        for (int k = 1; k <= (n - i + 1); k++) {
            System.out.print("*"); // Asteriscos
        }
        System.out.println(); // Salto de línea
    }
   }
       //Ejercicio_D
       public int[] ingresarNumeros() {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10];
        
        System.out.println("Ingrese 10 números enteros:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número " + (i+1) + ": ");
            numeros[i] = sc.nextInt();
        }
        return numeros;
    }

    // Método para ordenar de forma ascendente
    public void ordenarAscendente(int[] arreglo) {
        for (int i = 0; i < arreglo.length - 1; i++) {
            for (int j = i + 1; j < arreglo.length; j++) {
                if (arreglo[i] > arreglo[j]) {
                    int temp = arreglo[i];
                    arreglo[i] = arreglo[j];
                    arreglo[j] = temp;
                }
            }
        }
    }

    // Método para imprimir el arreglo
    public void imprimeArreglo(int[] arreglo) {
        System.out.println("Arreglo ordenado ascendentemente:");
        for (int num : arreglo) {
            System.out.print(num + " ");
        }
        System.out.println();
    }//End exercise D
    
    //Ejercicio_E
    public int[] generarNumerosAleatorios() {
        Random rand = new Random();
        int[] numeros = new int[100];  // Arreglo de tamaño 100

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = rand.nextInt(1000); // 👈 Aleatorios entre 0 y 999
        }
        return numeros;
    }

    //Ordena de forma descendente
    public void ordenarDescendente(int[] arreglo) {
        for (int i = 0; i < arreglo.length - 1; i++) {
            for (int j = i + 1; j < arreglo.length; j++) {
                if (arreglo[i] < arreglo[j]) {  // 
                    int temp = arreglo[i];
                    arreglo[i] = arreglo[j];
                    arreglo[j] = temp;
                }
            }
        }
    }

    // 3. Imprimir el arreglo
    public void imprimirArregloGrande(int[] arreglo) {
        System.out.println("Arreglo ordenado descendentemente:");
        for (int num : arreglo) {
            System.out.print(num + " ");
        }
        System.out.println();
    }//end exercise E
    
    //Ejercicio F
    public void mostrarTablero() {
        int n = 8; // tamaño del tablero (8x8)
        String[][] tablero = new String[n][n];

        // Llena el tablero con N y R de forma alterna
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ((i + j) % 2 == 0) {
                    tablero[i][j] = "N"; // Negras
                } else {
                    tablero[i][j] = "R"; // Rojas
                }
            }
        }

        // Imprimir el tablero
        System.out.println("Tablero inicial:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(tablero[i][j] + " ");
            }
            System.out.println();
        }
    }//end exercise F
       
}





