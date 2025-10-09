package es.cide.programacio;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String aturaString = "aturar";
        String operador;
        double nombre1, nombre2, resultat;
        while (aturaString != "aturar" ){
            System.out.println("Introdueix un nombre: ");
            nombre1 = sc.nextInt();
            System.out.println("Introdueix un operador: ");
            operador = sc.nextLine();
            System.out.println("Introdueix un nombre: ");
            nombre2 = sc.nextInt();
            if (operador == "sumar") {
                resultat = nombre1 + nombre2;
                System.out.println(resultat);
            } else if (exp instanceof Object) {
                ;
                
            }

        }
        


    }
}