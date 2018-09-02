package com.sreenu.messageTest;

import java.util.Scanner;

import com.sreenu.message.Message;
import com.sreenu.messageclass.Mail;
import com.sreenu.messageclass.SMS;

public class MessageTestCase {
	
	public static void main(String[] args) {
		
		
		Message message = null;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Select your Choice");
		System.out.println("1. SMS");
		System.out.println("2. Mail");
		
		int option = scanner.nextInt();
		if(option == 1) {
			message = new SMS();
			/*SMS sms = new SMS();
			sms.send();*/
		}
		else if(option == 2) {
			message = new Mail();
			/*Mail mail = new Mail();
			mail.send();*/
		}
		message.send();
		
		scanner.close();
	}

}
