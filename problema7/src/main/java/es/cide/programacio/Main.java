package es.cide.programacio;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 0, line = -0, lletraA = 0;
        boolean usuariEscrivint = true;
        String text = "abc";
        char a = 'a';
        char lletra = 'a';
        while(lletra != '.' && usuariEscrivint){
            text = sc.nextLine();
            lletra = text.charAt(i);
            switch (lletra){
                case 'a':
                    lletraA++;
                    i++;
                    System.out.println();
                case '.':
                    System.out.println("oooo");
                    usuariEscrivint = false;
                default:
                    i++;
            }
            
        }
    }
}