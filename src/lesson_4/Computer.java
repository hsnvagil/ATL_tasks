package lesson_4;

public abstract class Computer implements PowerInterface {
    private String Brand;
    private String Model;

    Computer(String Brand, String Model) {
        this.Brand = Brand;
        this.Model = Model;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String model) {
        Model = model;
    }

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String brand) {
        Brand = brand;
    }
}
