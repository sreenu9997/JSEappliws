package com.sreenu.messageTest;

import java.util.Scanner;

import com.sreenu.message.Message;
import com.sreenu.messageclass.FaceBook;
import com.sreenu.messageclass.Mail;
import com.sreenu.messageclass.SMS;
import com.sreenu.messageclass.Whatsapp;

public class MesageTest2 {

	public static void main(String[] args) {
		
		
		
		Message message = null;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Select your Choice");
		System.out.println("1. SMS");
		System.out.println("2. Mail");
		System.out.println("3. facebook");
		System.out.println("4. whatsapp");
		System.out.println("5. Exit");
		
		int option = scanner.nextInt();
		while(option !=5) {
		switch(option) {
		case 1: message =new SMS(); break;
		case 2: message = new Mail();break;
		case 3: message =new FaceBook(); break;
		case 4: message = new Whatsapp();break;
		
		}
		message.send();
		System.out.println("======================");
		System.out.println("Select your Choice");
		System.out.println("1. SMS");
		System.out.println("2. Mail");
		System.out.println("3. facebook");
		System.out.println("4. whatsapp");
		System.out.println("5. Exit");
		option = scanner.nextInt();
		}

		
		scanner.close();
	}
}
