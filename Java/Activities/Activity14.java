package activities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class Activity14 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		File file = new File("C:/Users/pavankumarchunchu/Desktop/FST-M1/Eclipse Work Space 1/fast-m1-java/newfile.txt");
		boolean fstatus = file.createNewFile();
		
		if(fstatus) {
			System.out.println("File created successfully!");
		}else {
			System.out.println("File is already exists at this location");
		}
		
		File fileutil = FileUtils.getFile("C:/Users/pavankumarchunchu/Desktop/FST-M1/Eclipse Work Space 1/fast-m1-java/newfile.txt");
		
	String read= FileUtils.readFileToString(fileutil, "UTF-8");	
	
	System.out.println("Data in File "+read);
	
	File destdir = new File("C:/Users/pavankumarchunchu/Desktop/FST-M1/Eclipse Work Space 1/fast-m1-java/src/Files/newfile.txt");
	
	FileUtils.copyFileToDirectory(file, destdir);
	
	File newfile = FileUtils.getFile(destdir,"newfile.txt");
	
	String newfiledata = FileUtils.readFileToString(newfile,"UTF-8");
	
	System.out.println("New file data "+ newfiledata);
	

	}

}
