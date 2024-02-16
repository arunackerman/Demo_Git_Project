package org.java.programs;
import java.io.*;

public class FileCreationPgm {

	public static void main(String[] args) {
		File file = new File("C:\\Users\\hello\\Desktop\\ProjectFolder\\mno.txt");
		boolean fileCreation = file.exists();
		
			try {
				file.createNewFile();
				fileCreation = file.exists();
				System.out.println("After file creation " + fileCreation);
				FileWriter writer = new FileWriter(file,true); //When we provide true as an argument with file, it will append the new work. won't erase anything
				BufferedWriter bwriter = new BufferedWriter(writer);
				bwriter.write("Arun Kumar Manivannan. This is a sample for file handling projects");
				bwriter.flush();
				//bwriter.close();
				bwriter.newLine();
				bwriter.write("This is the second line");
				bwriter.flush();
				//bwriter.close();
				bwriter.newLine();
				bwriter.write("This is the third line");
				bwriter.flush();
				bwriter.close();
				
				FileReader reader = new FileReader(file);
				BufferedReader breader = new BufferedReader(reader);
				String line = breader.readLine();
				int lineCount = 0;
				while(line != null) {
					lineCount++;
					System.out.println(line);
					line = breader.readLine();
				}
				
				
				System.out.println("Number of lines " + lineCount);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}


