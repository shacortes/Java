package es.cide.programacio;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Escriu un nombre per comprovar si és primer");
        Scanner sc = new Scanner(System.in);
        int residu = 1;
        int nombre = sc.nextInt();
        int i = 2;
        while (nombre > 2 && i < nombre && residu != 0 ){
            residu = nombre % i;
            i++;
            System.out.println(i);
            System.out.println(residu);
            
        }


        if (nombre == 1){
            System.out.println("No és primer");
        } else if (residu == 0){
            System.out.println("No és primer");
        } else {
            System.out.println("És primer");
        }



        /*for (int i = 2; nombre > 0 && i < nombre; i++){
                residu = nombre % i;
            }
        switch (residu){
            case 0:
                System.out.println("No és primer");
                break;
            default:
                System.out.println("És primer");*/
    }

}
    

