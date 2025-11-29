public class Audio extends Media implements IMedia {

    public Audio(String title, int duration) {
        super(title, duration);
    }

    @Override
    public void play() {
        System.out.println("Reproduzindo áudio: " + getTitle());
    }

    @Override
    public void stop() {
        System.out.println("Parando áudio: " + getTitle());
    }
}