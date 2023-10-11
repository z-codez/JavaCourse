package buffer;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class FileCopierWithBuffer {

	public static void main(String[] args) {
		try(FileInputStream fileInput = new FileInputStream("source.txt");
			FileOutputStream fileOutput = new FileOutputStream("destination.txt");
			FileChannel fileInputChannel = fileInput.getChannel();
				FileChannel fileOutputChannel = fileOutput.getChannel()) {
			System.out.println(); 
			
			ByteBuffer bytebuffer = ByteBuffer.allocate((int)fileInputChannel.size());
			
			fileInputChannel.read(bytebuffer);
			
			// Switches the buffer to read mode
			bytebuffer.flip();
			
			fileOutputChannel.write(bytebuffer);
			
		} catch(IOException e) {
			System.out.println(e);
		}
		
		System.out.println("File copied successfully");
	}
}
