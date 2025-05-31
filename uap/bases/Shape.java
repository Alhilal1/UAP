package uap.bases;


public abstract class Shape {
    // Nama bentuk 
    private String name;


    public Shape(String inputName) {
        this.name = inputName;
    }

    public void setName(String inputName) {
        this.name = inputName;
    }

    public String getName() {
        return this.name;
    }

    
    // Method abstrak untuk mencetak informasi: volume, luas permukaan, massa (gram), massa (kg), biaya kirim.
    
    public abstract void printInfo();
}
