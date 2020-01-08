package fr.mds.designpattern.adapter;

public class AdapterPatternDemo {
	public static void main(String[] args) {
		AudioPlayer audioPlayer = new AudioPlayer();

		audioPlayer.play("mp3", "Cypress Hill - Lowrider.mp3");
		audioPlayer.play("mp4", "Wu-Tang Clan - C.R.E.A.M.mp4");
		audioPlayer.play("vlc", "IAM - L'Empire du côté obscur.vlc");
		audioPlayer.play("avi", "NTM - IV My People.avi");

		MediaPlayer player = new MediaAdapter("mp4");
		player.play("mp4", "Nyan Cat 10 hours.mp4");

		MediaPlayer player1 = new AudioPlayer();
		player1.play("mp4", "Les Kassos Hello Kiki 'Je veux de la b***!' 10H!.mp4");
	}
}
