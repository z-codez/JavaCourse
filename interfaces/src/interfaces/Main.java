package interfaces;

public class Main {

	public static void main(String[] args) {
		
		MediaPlayer media = new MediaPlayer();
		StreamingService stream = new StreamingService();
		
		stream.play("Papaoutai");
		stream.pause();
		stream.stop();
		
		System.out.println();
		media.play("Adele");
		media.stop();
		media.pause();
	}
}
