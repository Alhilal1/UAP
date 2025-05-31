package uap.models;

import uap.bases.Shape;
import uap.interfaces.ThreeDimensional;
import uap.interfaces.PiRequired;
import uap.interfaces.MassCalculable;
import uap.interfaces.MassConverter;
import uap.interfaces.ShippingCostCalculator;


public class Torus extends Shape
    implements ThreeDimensional, PiRequired, MassCalculable, MassConverter, ShippingCostCalculator {

    private double majorRadius;
    private double minorRadius; 

    // Konstruktor kosong
    public Torus() {
        super("Torus");
    }

    // Konstruktor dengan parameter
    public Torus(double majorRadius, double minorRadius) {
        super("Torus");
        this.majorRadius = majorRadius;
        this.minorRadius = minorRadius;
    }

    public double getMajorRadius() {
        return majorRadius;
    }

    public void setMajorRadius(double majorRadius) {
        this.majorRadius = majorRadius;
    }

    public double getMinorRadius() {
        return minorRadius;
    }

    public void setMinorRadius(double minorRadius) {
        this.minorRadius = minorRadius;
    }

    
    @Override
    public double getVolume() {

        return 2 * (PI * PI) * majorRadius * (minorRadius * minorRadius);
    }

   
    @Override
    public double getSurfaceArea() {
        return 4 * (PI * PI) * majorRadius * minorRadius;
    }

   
    @Override
    public double getMass() {
        double area = getSurfaceArea(); 
        return DENSITY * area * THICKNESS; 
    }

    @Override
    public void printInfo() {     
        double massGram = getMass();                  
        double massKg = gramToKilogram(massGram);      
        int costRp = calculateCost(massKg);           

        System.out.printf("Volume          : %.2f%n", getVolume());
        System.out.printf("Luas permukaan  : %.2f%n", getSurfaceArea());
        System.out.printf("Massa           : %.2f%n", getMass());
        System.out.println("Massa dalam kg\t: " + massKg);
        System.out.println("Biaya kirim\t: Rp" + costRp);

        
    }
}
