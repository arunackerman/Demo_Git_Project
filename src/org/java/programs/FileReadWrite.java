package org.java.programs;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReadWrite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("C:\\Users\\hello\\Desktop\\ProjectFolder\\practiceFile.txt");
		boolean fileExist = file.exists();
		if(fileExist == false)
			try {
				file.createNewFile();
				FileWriter writer = new FileWriter(file);
				writer.write("This is arun kumar manivannan. \n An aspiring student from the world of java");
				writer.flush();
				writer.close();
				FileReader reader = new FileReader(file);
				int output = reader.read();
				while(output != -1) {
					System.out.print((char)output);
					output = reader.read();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

	}

}
