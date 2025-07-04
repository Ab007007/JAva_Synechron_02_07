package com.synechron.io;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {

	
	public static void main(String[] args) throws IOException {
		
		File f = new File("data/newdata.txt");
		if(!f.exists())
			f.createNewFile();
		
		FileOutputStream fos = new FileOutputStream(f);
		String s = "Thanks for attending java session with me.. -Aravinda";
		fos.write(s.getBytes());
		fos.flush();
		fos.close();
	}
}
