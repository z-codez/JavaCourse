package buffer;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.BufferOverflowException;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class FileReading {

	public static void main(String[] args) {
		try(FileOutputStream fileOut = new FileOutputStream("example.txt");
			FileInputStream fileIn = new FileInputStream("example.txt");
			FileChannel fileChannel =fileIn.getChannel()) {
			
			fileOut.write("Creating my second buffer object".getBytes());
			
			// This creates a buffer of capacity 32, only 32 bytes are allowed.
			ByteBuffer byteBuffer = ByteBuffer.allocate(32);
			
			
			fileChannel.read(byteBuffer);
			
			byteBuffer.flip(); // switch to read mode
			
			while(byteBuffer.hasRemaining()) {
					System.out.print((char)byteBuffer.get());
				}
				byteBuffer.clear();	// switch it to write mode
		
			
		// This catches the checked io operations	
		} catch(IOException e) {
			System.out.println(e);
			
			// This catches unchecked nio operations
		} catch(BufferOverflowException |
				BufferUnderflowException boe) {
			System.out.println(boe);
		}
	}
}
