package uap.models;

import uap.bases.Shape;
import uap.interfaces.ThreeDimensional;
import uap.interfaces.PiRequired;
import uap.interfaces.MassCalculable;
import uap.interfaces.MassConverter;
import uap.interfaces.ShippingCostCalculator;


public class Sphere extends Shape
    implements ThreeDimensional, PiRequired, MassCalculable, MassConverter, ShippingCostCalculator {

    private double radius;

    // Konstruktor kosong
    public Sphere() {
        super("Sphere");
    }

    // Konstruktor dengan parameter
    public Sphere(double radius) {
        super("Sphere");
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Menghitung volume Sphere (cm³).
     
    @Override
    public double getVolume() {
        return (4.0 / 3.0) * PI * radius * radius * radius;
    }

    // Menghitung luas permukaan Sphere (cm²).
    
    @Override
    public double getSurfaceArea() {
        return 4 * PI * radius * radius;
    }

    //Menghitung massa Sphere dalam gram:
     
    @Override
    public double getMass() {
        double area = getSurfaceArea(); // cm²
        return DENSITY * area * THICKNESS; // gram
    }

    //Mencetak informasi lengkap Sphere: Volume, Luas permukaan, Massa (g), Massa (kg), Biaya kirim (Rp).
     
    @Override
    public void printInfo() {
        double volume = getVolume();                  
        double surfaceArea = getSurfaceArea();        
        double massGram = getMass();                 
        double massKg = gramToKilogram(massGram);      
        int costRp = calculateCost(massKg);            

        System.out.println("Volume\t\t: " + volume);
        System.out.println("Luas permukaan\t: " + surfaceArea);
        System.out.println("Massa\t\t: " + massGram);
        System.out.println("Massa dalam kg\t: " + massKg);
        System.out.println("Biaya kirim\t: Rp" + costRp);
    }
}
