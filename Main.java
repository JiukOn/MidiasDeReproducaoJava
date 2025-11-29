public class Main {
    public static void main(String[] args) {
        
        Audio podcast = new Audio("Podcast de Tecnologia", 3000);
        Video filme = new Video("Filme de Ação", 7200);

        TV tv = new TV("Samsung", "QLED");
        Computer pc = new Computer("Dell", "XPS");
        Smartphone phone = new Smartphone("Apple", "iPhone");

        System.out.println("--------------------------------------------------");
        tv.turnOn();
        tv.playMedia(filme);
        tv.adjustBrightness(75);
        tv.increaseVolume(50);
        filme.stop();
        tv.turnOff();

        System.out.println("--------------------------------------------------");
        pc.turnOn();
        pc.playMedia(podcast);
        pc.increaseVolume(50);
        podcast.stop();
        pc.turnOff();

        System.out.println("--------------------------------------------------");
        phone.turnOn();
        phone.playMedia(filme);
        phone.adjustBrightness(60);
        phone.increaseVolume(70);
        filme.stop();
        phone.turnOff();
    }
}