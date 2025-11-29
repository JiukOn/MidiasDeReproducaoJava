public class Video extends Media implements IMedia {

    public Video(String title, int duration) {
        super(title, duration);
    }

    @Override
    public void play() {
        System.out.println("Reproduzindo vídeo: " + getTitle());
    }

    @Override
    public void stop() {
        System.out.println("Parando vídeo: " + getTitle());
    }
}