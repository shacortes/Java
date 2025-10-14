package es.cide.programacio;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arrayProblema1[] = {1,2,3,4,5,6,7,8};
        System.out.println("Escriu 8 nombres enters 1 per 1:");
        System.out.println("Escriu el primer nombre:");
        arrayProblema1[0] = sc.nextInt();
        System.out.println("Escriu el segon nombre:");
        arrayProblema1[1] = sc.nextInt();
        System.out.println("Escriu el tercer nombre:");
        arrayProblema1[2] = sc.nextInt();
        System.out.println("Escriu el quart nombre:");
        arrayProblema1[3] = sc.nextInt();
        System.out.println("Escriu el cinquè nombre:");
        arrayProblema1[4] = sc.nextInt();
        System.out.println("Escriu el sisè nombre:");
        arrayProblema1[5] = sc.nextInt();
        System.out.println("Escriu el setè nombre:");
        arrayProblema1[6] = sc.nextInt();
        System.out.println("Escriu el vuitè nombre:");
        arrayProblema1[7] = sc.nextInt();
        System.out.println("Array: " + arrayProblema1);
        System.out.println("Escriu un nombre pel que vulguis comprovar si existeix en l'array:");
        int nombre = sc.nextInt();
        int i = 0, repeticions = 0;
        boolean mateixNombre = false;
        while (mateixNombre = false && repeticions < 8){
            if (arrayProblema1[i] != nombre){
                i++;
            } else if (arrayProblema1[i] == nombre){
                repeticions++;
                mateixNombre = true;
            }
        }
        if (mateixNombre = true){
            System.out.println("El nombre " + nombre + " existeix en l'array.");
        } else if (mateixNombre = false){
            System.out.println("El nombre " + nombre + " no existeix en l'array.");
        }
        sc.close();
    }

    public static void Problema2(String[] args){
        Scanner sc = new Scanner(System.in);
        int arrayProblema2[] = {1,2,3,4,5,6};
        System.out.println("Escriu 8 nombres enters 1 per 1:");
        System.out.println("Escriu el primer nombre:");
        arrayProblema2[0] = sc.nextInt();
        System.out.println("Escriu el segon nombre:");
        arrayProblema2[1] = sc.nextInt();
        System.out.println("Escriu el tercer nombre:");
        arrayProblema2[2] = sc.nextInt();
        System.out.println("Escriu el quart nombre:");
        arrayProblema2[3] = sc.nextInt();
        System.out.println("Escriu el cinquè nombre:");
        arrayProblema2[4] = sc.nextInt();
        System.out.println("Escriu el sisè nombre:");
        arrayProblema2[5] = sc.nextInt();
        System.out.println("Escriu el setè nombre:");
        arrayProblema2[6] = sc.nextInt();
        System.out.println("Escriu el vuitè nombre:");
        arrayProblema2[7] = sc.nextInt();
    }
}

