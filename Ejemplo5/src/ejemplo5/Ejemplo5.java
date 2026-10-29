/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplo5;


import java.util.Locale;
import java.util.Scanner;
/**
 *
 * @author ASUS
 */
public class Ejemplo5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el nombre del cliente: ");
        String cliente = scanner.nextLine();

        System.out.print("Ingrese el precio mensual original de Netflix: ");
        double precioNetflix = scanner.nextDouble();

        System.out.print("Ingrese el precio mensual original de YouTube Premium: ");
        double precioYoutube = scanner.nextDouble();

        System.out.print("Ingrese el precio mensual original de Dropbox: ");
        double precioDropbox = scanner.nextDouble();

        System.out.print("Ingrese el precio mensual original de Spotify: ");
        double precioSpotify = scanner.nextDouble();

        // Cálculo de descuentos
        double descNetflix = precioNetflix * 0.23;
        double descYoutube = precioYoutube * 0.23;
        double descDropbox = precioDropbox * 0.45;
        double descSpotify = 0.0;

        // Precios finales por servicio
        double finalNetflix = precioNetflix - descNetflix;
        double finalYoutube = precioYoutube - descYoutube;
        double finalDropbox = precioDropbox - descDropbox;
        double finalSpotify = precioSpotify - descSpotify;

        // Totales generales
        double costoSinDescuentos = precioNetflix + precioYoutube + precioDropbox + precioSpotify;
        double ahorroTotal = descNetflix + descYoutube + descDropbox + descSpotify;
        double totalPagar = finalNetflix + finalYoutube + finalDropbox + finalSpotify;

        System.out.println("\n==========================================================");
        System.out.println("INFORME DE SERVICIOS DIGITALES");
        System.out.println("==========================================================");
        System.out.println("Cliente: " + cliente);
        System.out.println("----------------------------------------------------------");
        System.out.printf("Netflix      -> Descuento: $%.2f | Precio Final: $%.2f\n", descNetflix, finalNetflix);
        System.out.printf("YouTube Pr.  -> Descuento: $%.2f | Precio Final: $%.2f\n", descYoutube, finalYoutube);
        System.out.printf("Dropbox      -> Descuento: $%.2f | Precio Final: $%.2f\n", descDropbox, finalDropbox);
        System.out.printf("Spotify      -> Descuento: $%.2f | Precio Final: $%.2f\n", descSpotify, finalSpotify);
        System.out.println("----------------------------------------------------------");
        System.out.printf("Costo mensual total (sin descuentos): $%.2f\n", costoSinDescuentos);
        System.out.printf("Ahorro mensual total: $%.2f\n", ahorroTotal);
        System.out.printf("VALOR TOTAL A PAGAR MENSUALMENTE: $%.2f\n", totalPagar);
        System.out.println("==========================================================");

        scanner.close();
    }
}
    
    

