package test;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class Second {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileChannel fc = FileChannel.open(Paths.get("/root/Desktop/abc.txt"));
		FileChannel dc = FileChannel.open(Paths.get("/root/Desktop/xyz.txt"),StandardOpenOption.CREATE,StandardOpenOption.WRITE);
		ByteBuffer buffer = ByteBuffer.allocate(128);
		int i,v=0;
		//char ch;
		while((i=fc.read(buffer))!=-1)
		{v++;
			buffer.flip();
			
			dc.write(buffer);
//			while(buffer.hasRemaining())
//			{
//				ch=(char) buffer.get();
//				System.out.print(ch);
//			}
			buffer.clear();
		}
		System.out.println(v);
		fc.close();
		dc.close();
	}

}
