import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Bienvenido a la calculadora");
        System.out.println("Ingresa el primer numero: ");
        double n1=sc.nextDouble();
        System.out.println("Ingresa la operacion que quieres realizar (+),(-),(*),()");
        try {
            System.out.println();
        }
        catch (Exception e) {
            System.out.println("No se puede hacer una división entre 0");
            System.out.println("Error: "+ e);
        }
    }
}
