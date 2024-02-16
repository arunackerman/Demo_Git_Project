package org.java.programs;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriting {

	public static void main(String[] args) throws IOException {
		File file = new File("C:\\Users\\hello\\Desktop\\ProjectFolder\\file1.txt");
		boolean fileExisted = file.exists();
		System.out.println("fileExisted : " + fileExisted);
		if(fileExisted == false)
			file.createNewFile();
		fileExisted = file.exists();
		System.out.println("fileExisted : " + fileExisted);
		FileWriter writer = new FileWriter(file);
		//writer.write(100);
		writer.write("Arun kumar Manivannan");
		writer.flush();
		writer.close();
		FileReader reader  = new FileReader(file);
		//file reading
		/*int output = reader.read();
		while(output != -1) {
			System.out.print((char)output);
			output = reader.read();
			}
		*/
		
		//Another file reading method
		
		char [] ch = new char[(int)file.length()];
		System.out.println(file.length());
		reader.read(ch);
		for(char ch1 : ch)
			System.out.print(ch1);
		
		

	}

}
