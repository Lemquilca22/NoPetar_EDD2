import java.util.Scanner;

public class pin4numeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa un pin de cuatro numeros");

    while (!sc.hasNextInt()){
        System.out.println("Pin no valido");
        sc.next();
    }
        boolean continua = true;
        while (continua) {
            int num2 = sc.nextInt();
            if (num2 > 2025) {
                System.out.println("No creo que seas del futuro, ingresa un numero valido.");
            }  else {
                int edad = 2025 - num2;
                System.out.println("Tienes " + edad+" años.");
                continua=false;
            }
        }
}
}
