package es.cide.programacio;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Random insultsAleatoris = new Random();
        Random respostesIncorrectes = new Random();
        // Random locuraNumero3 = new Random(); 
        Random rnd = new Random();
        Scanner sc = new Scanner(System.in);
        int vides = 3;
        char continuacio = 'y';
        int insult = 0;
        int respostaNumJugador = -1;
        int puntuacio = 0;
        String[] insults = {"¡Has dejado ya de usar pañales?",
            "¡No hay palabras para describir lo asqueroso que eres!",
            "¡He hablado con simios más educados que tú!",
            "¡Llevarás mi espada como si fueras un pincho moruno!",
            "¡Luchas como un ganadero!",
            "¡No pienso aguantar tu insolencia aquí sentado!",
            "¡Mi pañuelo limpiará tu sangre!",
            "¡Ha llegado tu HORA, palurdo de ocho patas!",
            "¡Una vez tuve un perro más listo que tú!",
            "¡Nadie me ha sacado sangre jamás, y nadie lo hará!"};
        String[] respostesJugador = {"¿Por qué? ¿Acaso querías pedir uno prestado?",
            "Sí que las hay, sólo que nunca las has aprendido.",
            "Me alegra que asistieras a tu reunión familiar diaria.",
            "Primero deberías dejar de usarla como un plumero.",
            "Qué apropiado, tú peleas como una vaca.",
            "Ya te están fastidiando otra vez las almorranas, ¿eh?",
            "Ah, ¿ya has obtenido ese trabajo de barrendero?",
            "Y yo tengo un SALUDO para ti, ¿te enteras?",
            "Te habrá enseñado todo lo que sabes.",
            "¿TAN rápido corres?"};
        boolean[] usat = new boolean[insults.length];
        System.out.println("Quantes rondes vols jugar? Si vols sortir prem 0");
        int rondes = sc.nextInt();
        if (rondes >= 0) {
            System.out.println("Començem el Joc");
            for (int i = 0; i < rondes && continuacio != 'n' && vides > 0 && i < insults.length; i++) {
                do {
                    insult = insultsAleatoris.nextInt(insults.length);
                } while (usat[insult]);
                usat[insult] = true;
                System.out.println("Pirata: " + insults[insult]);
                System.out.println("Tria la teva resposta!");
                int[] opcions = new int[3];
                opcions[0] = insult;
                int count = 1;
                while (count < 3) {
                    int aleat = respostesIncorrectes.nextInt(respostesJugador.length);
                    boolean jaExisteix = false;

                    for (int indexArraySort = 0; indexArraySort < count; indexArraySort++) {
                        if (opcions[indexArraySort] == aleat || aleat == insult) {
                            jaExisteix = true;
                            break;
                        }
                    }
                    if (!jaExisteix) {
                        opcions[count] = aleat;
                        count++;
                    }
                }
                for (int j = 0; j < 3; j++) {
                    int k = rnd.nextInt(3);
                    int temp = opcions[j];
                    opcions[j] = opcions[k];
                    opcions[k] = temp;
                }
                for (int j = 0; j < 3; j++) {
                    System.out.println((j + 1) + ": " + respostesJugador[opcions[j]]);
                }
                respostaNumJugador = sc.nextInt();
                if (opcions[respostaNumJugador - 1] == insult) {
                    System.out.println("Correcte!");
                    puntuacio++;
                } else {
                    System.out.println("Incorrecte!");
                    vides--;
                }
                System.out.println("Vides restants: " + vides);
                System.out.println("--------------------------------------\n");
            }
            if (vides == 0) {
                System.out.println("Has perdut totes les vides. Fi del joc!");
            } else {
                System.out.println("Has acabat el joc amb " + vides + " vides restants.");
                if (puntuacio > 8) {
                    System.out.println("Ets el rei dels pirates");
                } else if (puntuacio > 4) {
                    System.out.println("Ets un bon pirata");
                } else {
                    System.out.println("Els lloros riuen de tu!");

                }
            }
        } else if (rondes < 0) {
            System.out.println("El nombre de rondes ha de ser positiu.");
        } else if (rondes == 0) {
            System.out.println("Fins aviat!");
        }
    }
}
