/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logic;

/**
 *
 * @author Justin Flores
 */
public class Lab2_Ejercicios {
    
    
    public void ejercicio13() {
        int suma = 0;
        for (int i = 2; i <= 1000; i += 2) {
            suma += i;
        }
        System.out.println("Ej13: Suma pares = " + suma);
    }

   
    public void ejercicio14() {
        double celsius = 30;
        double fahrenheit = (9.0 / 5.0) * celsius + 32;
        System.out.println("Ej14: " + celsius + "C = " + fahrenheit + "F");
    }

    
    public void ejercicio15() {
        int x = 2, n = 5, resultado = 1;
        for (int i = 0; i < n; i++) {
            resultado *= x;
        }
        System.out.println("Ej15: " + x + "^" + n + " = " + resultado);
    }

    
    public void ejercicio16() {
        int numero = 7;
        String[] meses = {"Enero","Febrero","Marzo","Abril","Mayo","Junio",
                          "Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"};
        if (numero >= 1 && numero <= 12) {
            System.out.println("Ej16: mes " + numero + " = " + meses[numero - 1]);
        } else {
            System.out.println("Ej16: Número inválido");
        }
    }

    
    public void ejercicio17() {
        int x = -3;
        int resultado;
        if (x > 0) resultado = x + 5;
        else if (x < 0) resultado = x * x;
        else resultado = 1;
        System.out.println("Ej17: f(" + x + ") = " + resultado);
    }

    
    public void ejercicio18() {
        double a = 3, b = 4, c = 5;
        double p = (a + b + c) / 2.0;
        double area = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        System.out.println("Ej18: área triángulo = " + area);
    }

   
    public void ejercicio19() {
        int a = 5, b = 10;
        System.out.println("Ej19 Antes: A=" + a + " B=" + b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("Ej19 Después: A=" + a + " B=" + b);
    }

    
    public void ejercicio20() {
        double x0 = 1, y0 = 2, x1 = 3, y1 = 4;
        double m = (y0 - y1) / (x0 - x1);
        double b = y0 - m * x0;
        System.out.println("Ej20: y = " + m + "x + " + b);
    }

    
    public void ejercicio21() {
        int k = 10, suma = 0;
        for (int i = 1; i < k; i++) {
            suma += i;
        }
        System.out.println("Ej21: suma menores que " + k + " = " + suma);
    }

   
    public void ejercicio22() {
        int[] numeros = {5, 10, 15};
        int suma = 0;
        for (int n : numeros) suma += n;
        double promedio = (double) suma / numeros.length;
        System.out.println("Ej22: promedio = " + promedio);
    }

   
    public void ejercicio23() {
        int[] numeros = {1,2,3,4,5,6,7,8,9,10};
        int sumaPares = 0, sumaImpares = 0, total = 0, pares = 0, impares = 0;
        for (int n : numeros) {
            total += n;
            if (n % 2 == 0) {
                sumaPares += n;
                pares++;
            } else {
                sumaImpares += n;
                impares++;
            }
        }
        System.out.println("Ej23: suma pares = " + sumaPares);
        System.out.println("Ej23: suma impares = " + sumaImpares);
        System.out.println("Ej23: total suma = " + total);
        System.out.println("Ej23: cantidad pares = " + pares + ", impares = " + impares);
    }

    
    public void ejercicio24() {
        int sumaPares = 0, sumaImpares = 0;
        for (int i = 1; i <= 200; i++) {
            if (i % 2 == 0) sumaPares += i;
            else sumaImpares += i;
        }
        System.out.println("Ej24: suma pares = " + sumaPares);
        System.out.println("Ej24: suma impares = " + sumaImpares);
    }

    
    public void ejercicio25() {
        int suma = 0;
        for (int i = 1; i <= 100; i++) {
            suma += i * i;
        }
        System.out.println("Ej25: suma cuadrados = " + suma);
    }

    
    public void ejercicio26() {
        int n = 5;
        long factorial = 1;
        for (int i = 2; i <= n; i++) {
            factorial *= i;
        }
        System.out.println("Ej26: " + n + "! = " + factorial);
    }

    
    public void ejercicio27() {
        int[] numeros = {7, 3, 15, 2, 9};
        int max = numeros[0];
        for (int n : numeros) {
            if (n > max) max = n;
        }
        System.out.println("Ej27: máximo = " + max);
    }
  

    
}
