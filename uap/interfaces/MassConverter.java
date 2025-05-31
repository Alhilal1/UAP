package uap.interfaces;

//Interface untuk mengubah massa dari gram ke kilogram.
public interface MassConverter {
    int DENOMINATOR = 1000; // 1 kg = 1000 g

    //Mengubah nilai gram ke kilogram.
    
    default double gramToKilogram(double gram) {
        return gram / DENOMINATOR;
    }
}
