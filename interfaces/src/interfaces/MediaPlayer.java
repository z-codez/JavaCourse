package interfaces;

public class MediaPlayer implements MusicPlayer {
	
	String currentSong;
	String playbackStatus;

	@Override
	public void play(String song) {
		
		System.out.println("The media player is playing the song " + song);
		playbackStatus = "playing";
		
	}

	@Override
	public void pause() {
		System.out.println("The media player is pausing the song ");
		playbackStatus = "paused";
	}

	@Override
	public void stop() {
		System.out.println("The media player is stopping the song ");
		playbackStatus = "stopped";
	}
}
