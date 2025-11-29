public abstract class Device {
    private String brand;
    private String model;

    public Device(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public void turnOn() {
        System.out.println("Ligando o dispositivo: " + brand + " " + model);
    }

    public void turnOff() {
        System.out.println("Desligando o dispositivo: " + brand + " " + model);
    }

    public void playMedia(IMedia media) {
        System.out.println("Reproduzindo mídia no dispositivo: " + brand + " " + model);
        media.play();
    }

    public String getBrand() { return brand; }
    public void setBrand(String brand) { this.brand = brand; }

    public String getModel() { return model; }
    public void setModel(String model) { this.model = model; }
}