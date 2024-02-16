package org.java.programs;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedReaderWriter {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file = new File("C:\\Users\\hello\\Desktop\\ProjectFolder\\abc.txt");
		boolean fileCreation = file.exists();
		System.out.println("Before fileCreation " + fileCreation);
		if(fileCreation == false) {
			try {
				file.createNewFile();
				System.out.println("After File cration : " + file.exists());
				FileWriter writer = new FileWriter(file);
				BufferedWriter bwriter = new BufferedWriter(writer);
				bwriter.write("Arun Kumar Manivannan");
				bwriter.flush();
				bwriter.close();
			}
		catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}

}}
