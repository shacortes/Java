package es.cide.programacio;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Scanner sc = new Scanner(System.in);
        int nombre, nombreDigits = 0;
        while (true) { 
            nombre = sc.next();
            
            nombreDigits = nombreDigits +1;
            System.out.println(nombreDigits);
        }
    }
}