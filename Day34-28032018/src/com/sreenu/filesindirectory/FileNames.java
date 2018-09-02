package com.sreenu.filesindirectory;

import java.io.File;

public class FileNames {
	
	public static void main(String[] args) {
		
		
		File file = new File("D:\\arco09092017\\hybris\\bin\\platform");
		
		
	/*	String string[] = file.list();
		for(int i=0; i<string.length; i++) {
			
			System.out.println(string[i]);
		}*/
		
		File[] files = file.listFiles();

		for(int i=0; i<files.length; i++) {
			if(files[i].isDirectory()) {
			System.out.println("Folder Name :: " +files[i].getName());
		}
			if(files[i].isFile()) {
				
				System.out.println("File Name :: " +files[i].getName());
			}
		}
		String na = file.getName();
		System.out.println(na);
		System.out.println("++++++++++++++++++++++");
		boolean fi = file.isFile();
		System.out.println(fi);
		System.out.println("++++++++++++++++++++++");
		

		boolean ex = file.canRead();
		System.out.println(ex);
		System.out.println("++++++++++++++++++++++");
		
		boolean dir = file.isDirectory();
		System.out.println(dir);
		System.out.println("++++++++++++++++++++++");
		System.out.println("=============");
		long lm=file.lastModified();
		
		System.out.println(lm);
		
	}

}
