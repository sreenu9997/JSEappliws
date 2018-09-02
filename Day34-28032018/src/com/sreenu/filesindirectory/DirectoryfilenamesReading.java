package com.sreenu.filesindirectory;

import java.io.File;

public class DirectoryfilenamesReading {

	public static void main(String[] args) {

		/*
		 * File file = new File("D:\\arco09092017\\hybris\\bin\\platform");
		 * 
		 * File[] files12 = file.listFiles(); for(int i=0;i<files12.length ; i++) {
		 * if(files12[i].isDirectory()) { files12[i].getParentFile(); }
		 */

		File file222 = new File("D:\\arco09092017\\hybris\\bin\\platform\\resources\\ant");

		getDirectoryfileNames(file222);
	}

	public static void getDirectoryfileNames(File file) {
		if (file.isDirectory()) {
			File[] files = file.listFiles();
			for (int i = 0; i < files.length; i++) {

				if (files[i].isDirectory()) {
					getDirectoryfileNames(files[i]);
				} else {
					System.out.println(files[i].getAbsolutePath() + " :: " + files[i].getName());
				}
			}

		}

	}
}
