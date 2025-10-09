package es.cide.programacio;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Scanner sc = new Scanner(System.in);
        int nombre = sc.nextInt();
        int u = 0, reps = 1;
        while (reps <= nombre) { 
            System.out.println(u);
            u = u+2;
            System.out.println(u);
            reps = reps + 2;            
        }


        
    }
}