package com.sreenu.filesindirectory;

import java.io.File;

public class GetdirectoryandFiles {
	
	
	public static void main(String[] args) {
		
		
		File file = new File("D:\\arco09092017\\hybris\\bin\\platform\\resources\\ant");
	
	
	getrandFiles(file);
	
	}
public static void getrandFiles(File file) {
	
	if(file.isDirectory()) {
		File files[] = file.listFiles();
		for(int i = 0; i<files.length; i++) {
			
			if(files[i].isDirectory()) {
				System.out.println("Directory ::  "+files[i].getName()+" :: "+files[i].getAbsolutePath());
				getrandFiles(files[i]);
			}
			else {
				
				System.out.println("File Name  :: "+files[i].getName());
			}
			
		}
	}
}


}
