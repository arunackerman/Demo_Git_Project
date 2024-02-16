package org.java.programs;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

//FileWriter operations
public class FileOperations {

	public static void main(String[] args) throws IOException {
		File file = new File("C:\\Users\\hello\\Desktop\\ProjectFolder\\fileOperations.txt");
		boolean fileCreation = file.exists();
		if(fileCreation ==false)
			file.createNewFile();
		FileWriter writer = new FileWriter(file);
		writer.write("How are you today?");
		writer.flush();
		//writer.close();
		writer.write("\nThis is arun kumar manivannan from Testing team");
		writer.flush();
		writer.close();
		FileReader reader = new FileReader(file);
		int output = reader.read(); //At the end of the file, the file value will be -1
		while(output != -1) {
			System.out.println((char)output);
			output = reader.read();
		}
		

	}

}
