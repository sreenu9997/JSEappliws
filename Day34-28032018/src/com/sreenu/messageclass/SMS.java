package com.sreenu.messageclass;

import com.sreenu.message.Message;

public class SMS implements Message{

	public void send() { 
		
		System.out.println("Sending Message to Phone through SMS");
	}
}
