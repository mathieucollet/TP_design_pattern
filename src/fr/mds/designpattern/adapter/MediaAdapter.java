package fr.mds.designpattern.adapter;

public class MediaAdapter implements MediaPlayer {
    AdvancedMediaPlayer amp;

    public MediaAdapter(String type) {
        if (type.equalsIgnoreCase("vlc")) amp = new VlcPlayer();
        else if (type.equalsIgnoreCase("mp4")) amp = new Mp4Player();
    }

    @Override
    public void play(String type, String filename) {
        if (type.equalsIgnoreCase("vlc")) amp.playVlc(filename);
        else if (type.equalsIgnoreCase("mp4")) amp.playMp4(filename);
    }
}
