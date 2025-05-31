package uap.interfaces;

//Interface untuk menghitung massa sebuah objek berbahan stainless steel.
 
public interface MassCalculable {
    // Kerapatan dalam gram per cm³ 
    int DENSITY = 8;      
    // Ketebalan bahan dalam cm
    double THICKNESS = 0.5; 

    // Menghitung massa objek dalam gram:
    double getMass();
}
