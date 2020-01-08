package fr.mds.designpattern.adapter;

public class AudioPlayer implements MediaPlayer {
    MediaAdapter ma;

    @Override
    public void play(String type, String filename) {
        if (type.equalsIgnoreCase("mp3")) System.out.println("Playing mp3 file. Name: " + filename);
        else if (type.equalsIgnoreCase("vlc") || type.equalsIgnoreCase("mp4")) {
            ma = new MediaAdapter(type);
            ma.play(type, filename);
        }
        else System.out.println("Invalid type. " + type + " format not supported");
    }
}
