package es.cide.programacio;
import  java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introdueix un nombre positiu");
        int nombre1 = sc.nextInt();
        int operandFix = nombre1;
        System.out.println("Introdueix un altre nombre nombre positiu");
        int nombre2 = sc.nextInt();
        while ((nombre2 = nombre2 - 1) != 0){
            nombre1 = nombre1 + operandFix;
            //nombre2= nombre2 - 1;
        }
        System.out.println("El resultat de l'operació: " + operandFix + " * " + nombre2 + " és igual a " + nombre1);
    }
}