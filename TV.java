public class TV extends Device implements IScreenAdjustable, IAdjustableVolume {

    public TV(String brand, String model) {
        super(brand, model);
    }

    @Override
    public void turnOn() {
        System.out.println("Ligando a TV: " + getBrand() + " " + getModel());
    }

    @Override
    public void turnOff() {
        System.out.println("Desligando a TV: " + getBrand() + " " + getModel());
    }

    @Override
    public void adjustBrightness(int value) {
        System.out.println("Ajustando o brilho da TV para " + value);
    }

    @Override
    public void adjustContrast(int value) {
        System.out.println("Ajustando o contraste da TV para " + value);
    }

    @Override
    public void increaseVolume(int value) {
        System.out.println("Aumentando o volume da TV em " + value);
    }

    @Override
    public void decreaseVolume(int value) {
        System.out.println("Diminuindo o volume da TV em " + value);
    }
}