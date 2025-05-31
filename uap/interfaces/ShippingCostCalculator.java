package uap.interfaces;

// Interface untuk menghitung biaya kirim berdasarkan berat (kg).
public interface ShippingCostCalculator {
    int PRICE_PER_KG = 2000; // Rp 2.000 per kg

    // Menghitung biaya kirim (dalam rupiah)
    default int calculateCost(double weightInKg) {
        int kg = (int) weightInKg;
        if (weightInKg > kg) {
            kg++; 
        }
        return kg * PRICE_PER_KG;
    }
}
