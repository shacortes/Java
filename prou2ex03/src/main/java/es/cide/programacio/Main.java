package es.cide.programacio;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Random insultsAleatoris = new Random();
        Random respostesIncorrectes = new Random();
        Random locuraNumero3 = new Random();
        //explicar variables que no entenc res
        int vides = 3;
        char continuacio = 'y';
        Scanner sc = new Scanner(System.in);
        int respIncAleat = 0;
        int insult = 0;
        int resposta = 0;
        int respostaNumJugador = -1;
        boolean cercantResposta = true;
        int respostesTrobades = 0;
        int indexResposteMostrades = 0;
        int noTeNom = 0;
        String respostaString = "Hola";
        int respostesMostJug = 0;
        int mecachisRespostaAleatoriaIndexCompANoTeNom = 0;
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
        String[] respostesMostrades = {"a", "b", "c"};

        /*String[] respostesIncorrectes = {"¿Por qué? ¿Acaso querías pedir uno prestado?",
            "Sí que las hay, sólo que nunca las has aprendido.",
            "Me alegra que asistieras a tu reunión familiar diaria.",
            "Primero deberías dejar de usarla como un plumero.",
            "Qué apropiado, tú peleas como una vaca.",
            "Ya te están fastidiando otra vez las almorranas, ¿eh?",
            "Ah, ¿ya has obtenido ese trabajo de barrendero?",
            "Y yo tengo un SALUDO para ti, ¿te enteras?",
            "Te habrá enseñado todo lo que sabes.",
            "¿TAN rápido corres?"};*/
        System.out.println("Quantes rondes vols jugar? Si vols sortir prem 0");
        int rondes = sc.nextInt();
        if (rondes >= 0) {
            System.out.println("Començem el Joc");
            for (int i = 0; i < rondes && continuacio != 'n' && vides > 0; i++) {
                insult = insultsAleatoris.nextInt(9);
                System.out.println("Pirata: " + insults[insult]);
                respostaString = insults[insult];
                System.out.println("Tria la teva resposta!");
                System.out.println("Jugador: " + respostesJugador[insult]);
                respostesMostrades[0] = respostesJugador[insult];
                while (cercantResposta && respostesTrobades < 2) {
                    respIncAleat = respostesIncorrectes.nextInt(9);
                    if (respIncAleat != insult) {
                        System.out.println(respostesJugador[respIncAleat]);
                        respostesMostrades[indexResposteMostrades + 1] = respostesJugador[respIncAleat];
                        respostesTrobades++;
                    }
                }
                //randomitzar respostes
                noTeNom = locuraNumero3.nextInt(respostesMostrades.length);
                while (respostesMostJug <= 2){
                    if (noTeNom != mecachisRespostaAleatoriaIndexCompANoTeNom && noTeNom != insult){
                        System.out.println(respostesMostrades[noTeNom]);
                        respostesMostJug++;
                        noTeNom = locuraNumero3.nextInt(respostesMostrades.length);
                    } else if (noTeNom == mecachisRespostaAleatoriaIndexCompANoTeNom || noTeNom == insult){
                        noTeNom = locuraNumero3.nextInt(respostesMostrades.length);
                    }
                }
                










                respostaNumJugador = sc.nextInt();


            }
        } else if (rondes < 0) {
            System.out.println("El nombre de rondes ha de ser positiu.");
        } else if (rondes == 0) {
            System.out.println("Fins aviat!");
        }

    }

}
