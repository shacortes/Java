/*Nom: Sergi Hui Amorós Cortés
 * DNI: 46395575K
 * Data: 09/10/2025
*/

package es.cide.programacio;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Començam especificant les variables necessàries, declarant-les i inicialitzant les que calgui, degut a que fem servir l'utilitat Scanner, hem d'importar-la.
        Aquest programa necessita 5 variables, una per seleccionar l'operació (nombreselector), en aquest cas un enter ja que no es necessitaran decimals en cap moment, tres variables double,
        dues per obtenir els operands numèrics (operand1 i operand2) i una altra per obtenir i guardar el resultat de les operacions (resultat). Finalment utilitzem un booleà per poder sortir del bucle.
        */
        Scanner sc = new Scanner(System.in);
        int nombreselector;
        double operand1, operand2, resultat;
        boolean sortir = false;
        System.out.println("Benvingut a la calculadora! Introdueix un nombre (de l'u al cinc) per seleccionar una operació:");
        /* 
        Començam amb un bucle while que repetirà les preguntes fins que l'usuari selccioni l'opció de sortir [5]. En el cas que l'usuari introdueixi el nombre 5, el booleà sortir
        passarà a ser true, per tant, el bucle ja no serà vàlid per la condició "sortir == false" i el bucle s'aturarà.
         */
        while(sortir == false){ 
            System.out.println("[1] Sumar");
            System.out.println("[2] Restar");
            System.out.println("[3] Multiplicar");
            System.out.println("[4] Dividir");
            System.out.println("[5] Sortir");
            nombreselector = sc.nextInt();

            /*Aquí estroba el switch que bàsicament gestiona el manú d'operacions. Hi ha 5 casos, de l'1 al 5, i un 
            default en cas en què l'usuari escrigui un nombre que no compleixi cap dels casos.*/
            switch (nombreselector) { 
            
                case 1: //El procés aquí es simple, l'ordinandor demana els dos operands i els suma per després mostrar el resultat. S'ha de tenir en compte que ja es sap quina operació s'ha de dur a terme
                    System.out.println("Has seleccionat sumar. \nIntrodueix el primer nombre:");
                    operand1 = sc.nextDouble();
                    System.out.println("Introdueix el segon nombre:");
                    operand2 = sc.nextDouble();
                    resultat = operand1 + operand2;
                    System.out.println("El resultat de la suma és: " + resultat);
                    break;
                case 2: //El procés aquí es molt similar al case 1 però amb una resta
                    System.out.println("Has seleccionat restar. \nIntrodueix el primer nombre:");
                    operand1 = sc.nextDouble();
                    System.out.println("Introdueix el segon nombre:");
                    operand2 = sc.nextDouble();
                    resultat = operand1 - operand2;
                    System.out.println("El resultat de la resta és: " + resultat);
                    break;
                case 3: //El procés aquí es molt similar al case 1 i 2 però amb una multiplicació
                    System.out.println("Has seleccionat multiplicar. \nIntrodueix el primer nombre:");
                    operand1 = sc.nextDouble();
                    System.out.println("Introdueix el segon nombre:");
                    operand2 = sc.nextDouble();
                    resultat = operand1 * operand2;
                    System.out.println("El resultat de la multiplicació és: " + resultat);
                    break;
                case 4: //El procés aquí es el mateix que en els altres 3 casos però s'ha de tenir en compte que no es pot dividir per zero, per tant s'ha d'afegir una condició per comprova i informar a l'usuari de que no es pot calcular.
                    System.out.println("Has seleccionat dividir. \nIntrodueix el primer nombre:");
                    operand1 = sc.nextDouble();
                    System.out.println("Introdueix el segon nombre:");
                    operand2 = sc.nextDouble();
                    //Comprovacióp per si un cas l'usuari introdueix el nombre zero per la variable operand2
                    if (operand2 != 0) {
                        resultat = operand1 / operand2;
                        System.out.println("El resultat de la divisió és: " + resultat);
                    } else {
                        System.out.println("No es pot dividir per zero.");
                    }
                    break;
                case 5: //Aquest cas serveix per sortir del bucle, la variable booleana canvia de valor i per tant el bucle ja no compleix la condició especificada (sortir == false).
                    System.out.println("Sortint de la calculadora. Fins aviat!");
                    sortir = true;
                    break;
                default: //Aquesta condició serveix per si un cas l'usuari escriu un nombre que no es troba entre els límits [1-5], en aquest cas s'informa a l'usuari de que l'opció no és vàlida i es repeteix el menú una altra vegada recordant-lo de que ha de ser entre 1 i 5 ambdós inclosos
                    System.out.println("Opció no vàlida. Tria una opció entre 1 i 5 (ambdós inclosos) en el següent menú:\n\n");
                    break;
            }
        }
    }
}