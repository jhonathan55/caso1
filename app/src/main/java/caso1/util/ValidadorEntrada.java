package caso1.util;

import java.util.Scanner;

public class ValidadorEntrada {
    
    private  static final Scanner scanner=new Scanner(System.in);

    public static String leerCadena(String mensaje){
        System.out.print(mensaje);
        return scanner.nextLine();
    }

    public static double leerDouble(String mensaje){
        while (true) { 
            try {
                System.out.println(mensaje);
                return Double.parseDouble(scanner.nextLine());
            } catch (Exception e) {
                // TODO: handle exception
                System.out.println("Entrada inválida. Por favor, ingrese un número válido. error:"+e.getMessage());
            }
        }
    }

    public static int leerEntero(String mensaje){
        while (true) { 
            try {
                System.out.println(mensaje);
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Por favor, ingrese un número válido. error:"+e.getMessage());
            }
        }
    }
}