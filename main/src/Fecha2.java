//import java.util.Scanner;
//
//public class Fecha2 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        boolean funcionames=true;
//        boolean papa = true;
//        while (papa) {
//            while (funcionames) {
//                System.out.println("Ingresa una fecha en números (dia, mes, año)");
//                System.out.println("Ingresa el dia: ");
//                int dia = sc.nextInt();
//                System.out.println("Ingresa el mes: ");
//                while (!sc.hasNextInt()) {
//                    System.out.println("Ese no es un número");
//                    sc.next();
//                }
//                int mes = sc.nextInt();
//                if (mes == 2 || mes == 4 || mes == 6 || mes == 9 || mes == 11) {
//                    if (dia > 30) {
//                        System.out.println("Este mes solo tiene 30 dias, ingrese un numero valid");
//                        funcionames = true;
//                    } else if (dia < 1) {
//                        System.out.println("Ingrese un dia valido");
//                        funcionames = true;
//                    }
//                } else if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 12) {
//                    if (dia > 31) {
//                        System.out.println("Este mes tiene 31 dias, ingrese un numero valido");
//                        funcionames = true;
//                    } else if (dia < 1) {
//                        System.out.println("Ingrese un dia valido");
//                        funcionames = true;
//                    }
//                }
//            }
//
//            boolean añovalido = true;
//            while (añovalido) {
//                System.out.println("Ingrese el año: ");
//                while (!sc.hasNextInt()) {
//                    System.out.println("Ese no es un número");
//                    sc.next();
//                }
//                int año = sc.nextInt();
//                if (String.valueOf(año).length() == 4) {
//                    System.out.println("Numero valido: " + año);
//                    System.out.println("La fecha es" + dia + " " + mes + " " + año);
//                    añovalido = false;
//                } else if (String.valueOf(año).length() < 4) {
//                    System.out.println("Longitud: " + String.valueOf(año).length());
//                    System.out.println("La longitud debe ser de 4 caracteres, escribe un año que cumpla con esa condición");
//                } else if (String.valueOf(año).length() > 4) {
//                    System.out.println("Longitud: " + String.valueOf(año).length());
//                    System.out.println("La longitud debe ser de 4 caracteres, escribe un año que cumpla con esa condición");
//                }
//            }
//        }
//
//
//
//    }
//}
