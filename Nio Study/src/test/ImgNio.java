package test;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.net.*;
import java.nio.ByteBuffer;
import java.nio.channels.*;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class ImgNio {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		URL u = new URL("https://images-na.ssl-images-amazon.com/images/G/01/img15/pet-products/small-tiles/23695_pets_vertical_store_dogs_small_tile_8._CB312176604_.jpg"); 
		BufferedInputStream bs = new BufferedInputStream(u.openConnection().getInputStream());
		byte [] a = new byte[16];
		FileChannel dc = FileChannel.open(Paths.get("/root/Desktop/dog.jpeg"),StandardOpenOption.CREATE,StandardOpenOption.WRITE);
		while(bs.read(a)>=0)
		{
			ByteBuffer b = ByteBuffer.wrap(a);
			dc.write(b);
		}
		dc.close();
		bs.close();
	}

}
