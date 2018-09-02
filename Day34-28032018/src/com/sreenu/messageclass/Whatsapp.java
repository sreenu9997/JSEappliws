package com.sreenu.messageclass;

import com.sreenu.message.Message;

public class Whatsapp implements Message {

	@Override
	public void send() {
		System.out.println("Sending message to Phone from whatsapp");

	}

}
