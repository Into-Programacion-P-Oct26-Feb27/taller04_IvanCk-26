/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplo.pkg2;


import java.util.Locale;
import java.util.Scanner;
/**
 *
 * @author ASUS
 */
public class Ejemplo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la base del triángulo: ");
        double base = scanner.nextDouble();

        System.out.print("Ingrese la altura del triángulo: ");
        double altura = scanner.nextDouble();

        double area = (base * altura) / 2.0;

        System.out.println("\n--- CÁLCULO DEL ÁREA DE UN TRIÁNGULO ---");
        System.out.printf("Base ingresada: %.2f\n", base);
        System.out.printf("Altura ingresada: %.2f\n", altura);
        System.out.printf("Área del triángulo: %.2f\n", area);

        scanner.close();
    }
}
    

