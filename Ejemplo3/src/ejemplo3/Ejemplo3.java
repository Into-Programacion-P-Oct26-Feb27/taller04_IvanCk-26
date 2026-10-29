/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplo3;


import java.util.Locale;
import java.util.Scanner;
/**
 *
 * @author ASUS
 */
public class Ejemplo3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el nombre del titular: ");
        String titular = scanner.nextLine();

        System.out.print("Ingrese la dirección: ");
        String direccion = scanner.nextLine();

        System.out.print("Ingrese el costo por minuto ($): ");
        double costoMinuto = scanner.nextDouble();

        System.out.print("Ingrese los minutos consumidos: ");
        int minutos = scanner.nextInt();

        double totalPagar = costoMinuto * minutos;

        System.out.println("\n==========================================================");
        System.out.println("PLANILLA DE SERVICIO TELEFÓNICO");
        System.out.println("==========================================================");
        System.out.println("Titular: " + titular);
        System.out.println("Dirección: " + direccion);
        System.out.println("----------------------------------------------------------");
        System.out.printf("Costo por minuto: $%.2f\n", costoMinuto);
        System.out.println("Minutos consumidos: " + minutos);
        System.out.println("----------------------------------------------------------");
        System.out.printf("VALOR TOTAL A PAGAR:  $%.2f\n", totalPagar);
        System.out.println("==========================================================");

        scanner.close();
    }
}
    
    

