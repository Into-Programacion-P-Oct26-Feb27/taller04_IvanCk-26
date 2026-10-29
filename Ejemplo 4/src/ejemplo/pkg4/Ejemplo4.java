/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplo.pkg4;


import java.util.Locale;
import java.util.Scanner;
/**
 *
 * @author ASUS
 */
public class Ejemplo4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el nombre del cliente: ");
        String cliente = scanner.nextLine();

        System.out.print("Ingrese el costo de la CPU (Torre): ");
        double cpu = scanner.nextDouble();

        System.out.print("Ingrese el costo del Teclado: ");
        double teclado = scanner.nextDouble();

        System.out.print("Ingrese el costo del Ratón: ");
        double raton = scanner.nextDouble();

        System.out.print("Ingrese el costo de la Pantalla: ");
        double pantalla = scanner.nextDouble();

        double costoBase = cpu + teclado + raton + pantalla;
        double costosOperacionales = costoBase * 0.15;
        double costoFinal = costoBase + costosOperacionales;

        System.out.println("\nReporte:");
        System.out.println("Nombres de cliente: " + cliente);
        System.out.println("Valores iniciales:");
        System.out.printf("CPU:  $ %.1f\n", cpu);
        System.out.printf("Teclado: $ %.1f\n", teclado);
        System.out.printf("Ratón: $ %.1f\n", raton);
        System.out.printf("Pantalla: $ %.1f\n", pantalla);
        System.out.println();
        System.out.printf("Costo base: $ %.0f\n", costoBase);
        System.out.printf("Costo adicional del 15%%: %.2f\n", costosOperacionales);
        System.out.printf("Costo final: $ %.2f\n", costoFinal);

        scanner.close();
    }
}
    
  

