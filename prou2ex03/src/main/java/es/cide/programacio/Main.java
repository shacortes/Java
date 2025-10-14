package es.cide.programacio;
import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Random insultsAleatoris = new Random();
        int vides = 3;
        char continuacio  = 'y';
        System.out.println("Quantes rondes vols jugar?");
        Scanner sc = new Scanner(System.in);
        int rondes = sc.nextInt();
        int insult = 0;
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
        String[] insultsJugador = {"¿Por qué? ¿Acaso querías pedir uno prestado?",
        "Sí que las hay, sólo que nunca las has aprendido.",
        "Me alegra que asistieras a tu reunión familiar diaria.",
        "Primero deberías dejar de usarla como un plumero.",
        "Qué apropiado, tú peleas como una vaca.",
        "Ya te están fastidiando otra vez las almorranas, ¿eh?",
        "Ah, ¿ya has obtenido ese trabajo de barrendero?",
        "Y yo tengo un SALUDO para ti, ¿te enteras?",
        "Te habrá enseñado todo lo que sabes.",
        "¿TAN rápido corres?"};
        for (int i = 0; i < rondes && continuacio != 'n' && vides > 0; i++) {
            
        }


    }
}