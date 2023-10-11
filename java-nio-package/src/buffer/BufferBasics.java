package buffer;

import java.nio.ByteBuffer;

public class BufferBasics {

	public static void main(String[] args) {
		
		ByteBuffer byteBuffer = ByteBuffer.allocate(1024);
		
		String message = "Creating a buffer and storing a string in it";
		
		byteBuffer.put(message.getBytes());
		
		// Switch the buffer to read mode
		byteBuffer.flip();
		
		while(byteBuffer.hasRemaining()) {
			System.out.print((char) byteBuffer.get());
		}
		System.out.println();
		
		byteBuffer.clear();
		byteBuffer.put("Writing a second message into the buffer".getBytes());
		
		byteBuffer.flip();
		
		while(byteBuffer.hasRemaining()) {
			System.out.print((char) byteBuffer.get());
		}
		
		

	}

}
