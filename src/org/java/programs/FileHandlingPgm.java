package org.java.programs;
import java.io.File;
import java.io.IOException;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class FileHandlingPgm {

	public static void main(String[] args) throws IOException {
		//subfolder creation 
		
		/*File file = new File("C:\\Users\\hello\\Desktop\\ProjectFolder\\Day-1\\Evaluation");
		boolean fileCreation = file.exists();
		System.out.println("The folder already exists : " + fileCreation);
		if(fileCreation == false) {
			file.mkdirs();
		}
		
		System.out.println("Folder creation completed : " + file.exists());
		
	*/
		
		
		//New file creation
		
		/*File file = new File("C:\\Users\\hello\\Desktop\\ProjectFolder\\text.txt");
		boolean present = file.exists();
		System.out.println("File existed : " + present);
		if(present == false)
			try {
				boolean created = file.createNewFile();
				System.out.println("file created : " + created);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}*/
		
		// File deletion
		/*File file = new File ("C:\\Users\\hello\\Desktop\\ProjectFolder\\text.txt");
		boolean fileExisted = file.exists();
		
		System.out.println("File existed : " + fileExisted);
		boolean fileDeleted = file.delete();
		fileExisted = file.exists();
		System.out.println("After deletion, file existed : " + fileExisted);
		*/
		
		
		//File renaming, checking permissions of that particular file
		/*
		File file = new File ("C:\\Users\\hello\\Desktop\\ProjectFolder\\text.txt");
		boolean fileCreated = file.createNewFile();
		System.out.println("fileCreated " + fileCreated);
		File newFile = new File("C:\\Users\\hello\\Desktop\\ProjectFolder\\reNamedFile.txt");
		boolean fileRenamed = file.renameTo(newFile);
		System.out.println("fileRenamed : " + fileRenamed);
		//Printing the file names
		System.out.println("File name " + file.getName());
		System.out.println("File name " + newFile.getName());
		System.out.println("Execute : " + newFile.canExecute());
		System.out.println("Read : " + newFile.canRead());
		System.out.println("Write : " + newFile.canWrite());
		*/
		
		//Listing all the files in a folder
		/*File file = new File("C:\\Users\\hello\\Downloads");
		/*String [] fileNames = file.list();
		for(String s : fileNames)
			System.out.println(s);*/
		/*File[] listOfFilesFolders = file.listFiles();
		for(File f : listOfFilesFolders)
			if(f.isDirectory()==true) // printing the folders. For files --> if(f.isFile() == true) syso(f);
				System.out.println(f);
			*/
		
		// Listing only .txt files
		
		/*File file = new File("C:\\Users\\hello\\Downloads");
		File [] fileFolderNames = file.listFiles();
		for(File f : fileFolderNames) {
			if(f.isFile()) {
				String fileName = f.getName();
				int lastIndexOfDot = fileName.lastIndexOf(".");
				String extension = fileName.substring(lastIndexOfDot+1);
				//System.out.println(extension); //printing the extension of the files in the given folder
				if(extension.equals("txt"))
					System.out.println(fileName);
			}
		}*/
		
		/*File file = new File("C:\\Users\\hello\\Downloads");
		File [] fileFolderList = file.listFiles();
		for(File f : fileFolderList) {
			if(f.isFile()) {
				String fileName = f.getName();
				int lastIndexOfDot = fileName.lastIndexOf(".");
				String extension = fileName.substring(lastIndexOfDot+1);
				//System.out.println(extension);
				//if(extension.equals("txt")) //printing only the txt files
				if(f.length()>5000000) // printing only files above 5mb size
					System.out.println(fileName + "--->"  +" size of the file :  " + f.length());
			}*/
		
		
		File file = new File("C:\\Users\\hello\\Downloads");
		File [] fileFolderList = file.listFiles();
		for(File f : fileFolderList)
			if(f.isFile()) {
				String fileName = f.getName();
				int lastIndexOfDot = fileName.lastIndexOf(".");
				String extension = fileName.substring(lastIndexOfDot+1);
				/*if(extension.equals("exe"))
					System.out.println(fileName + "size of the file : " + f.length());*/
				//System.out.println(extension);
				if(extension.equals("exe")) // files with .exe extension
					if(f.length()>5000000) //files with 5MB above size
					System.out.println(fileName + " size of the file is " + f.length());
				
			}
		
		}
		
		
	}


