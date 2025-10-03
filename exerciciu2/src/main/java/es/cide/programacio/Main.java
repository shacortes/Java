package es.cide.programacio;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Primer exercici: Número positivo o negativo");
        System.out.println("Introdueix un nombre");
        int edad = sc.nextInt();
        if (edad > 0) {
            System.out.println("Aquest nombre és positiu");

        } else if (edad < 0) {
            System.out.println("Aquest nombre és negatiu");
        } else {
            System.out.println("Aquest nombre és 0");

        }

        //---------------------------------------------------------------------------------------------------------------------------------
        System.out.println("Tercer exercici: Par o impar");
        int nombrex3 = sc.nextInt();
        if ((nombrex3 % 2 == 0)) {
            System.out.println("Aquest nombre és parell.");
        } else {
            System.out.println("Aquest nombre és imparell.");
        }

        //---------------------------------------------------------------------------------------------------------------------------------
        System.out.println("Quart exercici: Calificación escolar");
        System.out.println("Introdueix la nota: ");
        int nota = sc.nextInt();
        if (nota < 5) {
            System.out.println("Suspenso");
        } else if (nota >= 5 && nota <= 6) {
            System.out.println("Aprobado");
        } else if (nota >= 7 && nota <= 8) {
            System.out.println("Notable");
        } else if (nota >= 9 && nota <= 10) {
            System.out.println("Sobresaliente");
        } else if (nota > 10){
            System.out.println("Aquest nombre és major a 10");
        }
        //---------------------------------------------------------------------------------------------------------------------------------

        System.out.println("Cinquè exercici: Día de la semana");
        System.out.println("Dies de la setmana");
        int dia = sc.nextInt();

        switch (dia) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miércoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sábado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("Escriu un nombre de 1-9!");
        }
        //---------------------------------------------------------------------------------------------------------------------------------

        System.out.println("Sisè exercici: Votar o no");
        System.out.println("Escriu la teva edat: ");
        int edat = sc.nextInt();
        if (edat >= 18){
            System.out.println("Puedes votar");
        }
        else if(edat <= 18){
            System.out.println("Aún no puedes votar");
        }

        //---------------------------------------------------------------------------------------------------------------------------------


        System.out.println("Setè exercici: Comparar dos números");
        System.out.println("Introdueix un nombre");
        int a = sc.nextInt();
        System.out.println("Introdueix un nombre");
        int b = sc.nextInt();

        if (a < b){
            System.out.println(a + " és menor que " + b);
        } else if (a == b){
            System.out.println(a + " és igual que " + b);
        } else if (a > b){
            System.out.println(a + " és major que " + b);
        }

        //---------------------------------------------------------------------------------------------------------------------------------


        System.out.println("Vuitè exercici: Mes del año");
        int mes = sc.nextInt();
        switch (mes) {
            case 1:
                System.out.println("Enero");
                break;
            case 2:
                System.out.println("Febrero");
                break;
            case 3:
                System.out.println("Marzo");
                break;
            case 4:
                System.out.println("Abril");
                break;
            case 5:
                System.out.println("Mayo");
                break;
            case 6:
                System.out.println("Junio");
                break;
            case 7:
                System.out.println("Julio");
                break;
            case 8:
                System.out.println("Agosto");
                break;
            case 9:
                System.out.println("Septiembre");
                break;
            case 10:
                System.out.println("Octubre");
                break;
            case 11:
                System.out.println("Noviembre");
                break;
            case 12:
                System.out.println("Diciembre");
                break;
            default:
                System.out.println("Escriu un nombre de 1-12!");
        }
        //---------------------------------------------------------------------------------------------------------------------------------
        System.out.println("Nouè exercici: Adivinar carácter");
        String caracter = sc.next();
        if (caracter == "a"  && caracter == "e" && caracter == "i" && caracter == "o" && caracter == "u"){
            
        }
    }
}