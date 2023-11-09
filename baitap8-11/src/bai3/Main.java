package bai3;

public class Main {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();
        VideoPlayer videoPlayer = new VideoPlayer();
        System.out.println(audioPlayer.play());
        System.out.println(videoPlayer.play());
    }
}
