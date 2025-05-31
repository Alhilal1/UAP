package uap.mains;

import java.util.Scanner;
import uap.models.Torus;
import uap.models.Sphere;


public class KalkulatorPabrik {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Header
        System.out.println("================================================");
        System.out.println("Kalkulator Pabrik Cetakan Donat Rumahan");
        System.out.println("NAMA LENGKAP");
        System.out.println("NIM");
        System.out.println("================================================");

      
        // Donat dengan lubang 
       
        System.out.println("Donat dengan lubang");
        System.out.println("================================================");
        System.out.print("Isikan Radius    : ");
        double R_major = scanner.nextDouble(); 
        System.out.print("Isikan radius    : ");
        double r_minor = scanner.nextDouble(); 
        System.out.println("================================================");

        Torus torus = new Torus(R_major, r_minor);
        torus.printInfo();
        System.out.println("================================================");

       
        // Donat tanpa lubang 
        System.out.println("Donat tanpa lubang");
        System.out.println("================================================");
        System.out.print("Isikan radius    : ");
        double r_sphere = scanner.nextDouble(); 
        System.out.println("================================================");

        Sphere sphere = new Sphere(r_sphere);
        sphere.printInfo();
        System.out.println("================================================");

        scanner.close();
    }
}
