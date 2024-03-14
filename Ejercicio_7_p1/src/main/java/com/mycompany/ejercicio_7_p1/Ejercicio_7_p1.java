package com.mycompany.ejercicio_7_p1;
import java.util.Scanner;

public class Ejercicio_7_p1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        double n1= scanner.nextDouble();
        System.out.print("Ingrese otro numero: ");
        double n2= scanner.nextDouble();
        
        if (n1>n2){
            System.out.println(n1+" es mayor que "+n2);
        } else if (n1 == n2){   
            System.out.print("Los dos numeros son iguales. ");
        } else if (n1<n2){
            System.out.print(n2+" es mayor que "+n1);
        }
        scanner.close();

    }
}