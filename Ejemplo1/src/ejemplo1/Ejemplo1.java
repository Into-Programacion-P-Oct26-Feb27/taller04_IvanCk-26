/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplo1;


import java.util.Locale;
import java.util.Scanner;
/**
 *
 * @author ASUS
 */
public class Ejemplo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el nombre del proyecto 1: ");
        String p1 = scanner.nextLine();
        System.out.print("Ingrese el gasto mensual: ");
        double g1 = scanner.nextDouble();
        scanner.nextLine(); // Limpiar el buffer

        System.out.print("Ingrese el nombre del proyecto 2: ");
        String p2 = scanner.nextLine();
        System.out.print("Ingrese el gasto mensual: ");
        double g2 = scanner.nextDouble();
        scanner.nextLine(); // Limpiar el buffer

        System.out.print("Ingrese el nombre del proyecto 3: ");
        String p3 = scanner.nextLine();
        System.out.print("Ingrese el gasto mensual: ");
        double g3 = scanner.nextDouble();

        double total = g1 + g2 + g3;

        System.out.println("\nCONTROL DE GASTOS DE PROYECTOS");
        System.out.println("Proyectos:");
        System.out.println("-------------------------------");
        System.out.printf("1. %s: $%.2f\n", p1, g1);
        System.out.printf("2. %s: $%.2f\n", p2, g2);
        System.out.printf("3. %s: $%.2f\n", p3, g3);
        System.out.println("-------------------------------");
        System.out.printf("GASTO MENSUAL TOTAL: $%.2f\n", total);

        scanner.close();
    }
}
    
    

