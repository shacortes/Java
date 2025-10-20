package es.cide.programacio;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Escriu un nombre");
        Scanner sc = new Scanner(System.in);
        int nombre = sc.nextInt();

        char asterisc = '*';
        for (int i = 0; i < nombre; i++){

            for(int i2 = 0; i2 <= i; i2++){
                System.out.print("*");

            }
            System.out.println();
            
        }
    }
}