package es.cide.programacio;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        
        System.out.println("Escriu una paraula:");
        String a = sc.next();
        String b = sc.next();

        if (a.compareTo(b) > 0) {
            System.out.println(a + ">" + b);
        } else if (a.compareTo(b) < 0) {
            System.out.println(a + "<" + b);
        } else if (a.compareTo(b) == 0) {
            System.out.println(a + "=" + b);
        }
        else {
            System.err.println("Wut");
        }
    }
    public static void exdos(String[] args) {
        System.out.println("Escriu una paraula:");
        String a = sc.next();
        String b = sc.next();

        if (a.compareTo(b) > 0) {
            System.out.println(a + ">" + b);
        } else if (a.compareTo(b) < 0) {
            System.out.println(a + "<" + b);
        } else if (a.compareTo(b) == 0) {
            System.out.println(a + "=" + b);
        }
        else {
            System.err.println("Wut");
        }
        
    }
}