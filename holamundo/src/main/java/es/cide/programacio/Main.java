package es.cide.programacio;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        double x, y;
        x=0.2;
        y=2;
        while ((x!=y) && (x<=y)) { 

            if (x==y) {
                System.out.println("Igual");
                } else {
                System.out.println("Diferent");
                System.out.println(x); 
                System.out.println(y);
                x=x+0.2;
                y=y+0.1;
                }
            if (x>=1000){
                return;
            }
        }
            
    }
}