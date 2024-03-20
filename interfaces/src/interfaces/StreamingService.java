package interfaces;

public class StreamingService implements MusicPlayer {
	
	String currentSong;
	String playbackStatus;

	@Override
	public void play(String song) {
		
		System.out.println("The streaming service is streaming this: " + song);
		playbackStatus = "streaming";
		currentSong = song;
	}

	@Override
	public void pause() {
		
		System.out.println("The streaming service is pausing the song");
		playbackStatus = "paused";
	}

	@Override
	public void stop() {
		System.out.println("The streaming service is stopping the song");
		playbackStatus = "stopped";
	}
}
