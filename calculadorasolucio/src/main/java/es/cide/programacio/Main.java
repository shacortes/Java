package es.cide.programacio;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Variables per emmagatzemar l'opció de l'usuari i els operands
        int menuOpcio = 0;
        int primerOperand = 0, segonOperand = 0; // Inicialitzar operands
        double resultat;

        Scanner escaner = new Scanner(System.in); // Crear escàner per llegir l'entrada de l'usuari 

        while (menuOpcio != 5) { // Bucle principal que continua fins que l'usuari triï sortir (opció 5)
            System.out.println("Benvingut a Calculator10000\nTrieu una opció [Enter]:"); // Mostrar el menú principal
            System.out.println("1. Sumar\n2. Restar\n3. Multiplicar\n4. Dividir\n5. Sortir");
            System.out.print("Opció: ");

            menuOpcio = escaner.nextInt(); // Llegir l'opció de l'usuari

            // Demanar operands per a les operacions matemàtiques (casos 1-4)
            if (menuOpcio >= 1 && menuOpcio <= 4) {
                System.out.print("Introduïu el primer número: "); // Demanar el primer nombre
                primerOperand = escaner.nextInt();
                System.out.print("Introduïu el segon número: "); // Demanar el segon nombre
                segonOperand = escaner.nextInt();
            }

            switch (menuOpcio) { // Evaluar l'opció triada per l'usuari
                case 1: // Suma
                    resultat = primerOperand + segonOperand; // Calcular el resultat de la suma
                    System.out.println("El resultat de la suma és: " + resultat);
                    break;
                case 2: // Resta
                    resultat = primerOperand - segonOperand; // Calcular el resultat de la resta
                    System.out.println("El resultat de la resta és: " + resultat);
                    break;
                case 3: // Multiplicació
                    resultat = primerOperand * segonOperand; // Calcular el resultat de la multiplicació
                    System.out.println("El resultat de la multiplicació és: " + resultat);
                    break;
                case 4: // Divisió
                    if (segonOperand != 0) { // Comprovar que no es divideix per zero
                        resultat = (double) primerOperand / segonOperand; // Calcular el resultat de la divisió (conversió a double per decimals)
                        System.out.println("El resultat de la divisió és: " + resultat);
                    } else {
                        System.out.println("Error: Divisió per zero no permesa."); // Mostrar error si es vol dividir per zero
                    }
                    break;
                case 5: // Sortir del programa
                    System.out.println("Gràcies per utilitzar Calculator10000");
                    break;
                default: // Opció no vàlida
                    System.out.println("Opció no vàlida");
                    break;
            }
        } // Fi del bucle while
        escaner.close(); // Tancar el scanner per evitar resource leak
    } // Fí del programa
}