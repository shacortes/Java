package es.cide.programacio;

public class Main {
    public static void main(String[] args) {
        int num1, num2;
        try {
            num1 = 0;
            num2 = 62/num1;
            System.out.println("Final Try");
        } catch (ArithmeticException e) {
            e.printStackTrace();
            System.out.println("No es pot dividir per 0");
        } finally {
            System.out.println("bloc finally");
        }
    }
}
