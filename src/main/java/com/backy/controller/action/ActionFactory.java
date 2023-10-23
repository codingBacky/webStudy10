package com.backy.controller.action;

public class ActionFactory {
	private ActionFactory() {}
	
	private static ActionFactory instance;
	
	public static ActionFactory getInstance() {
		return instance;
	}
	
	public Action getAction(String command) {
		Action action = null;
		if(command.equals("customer_sign_form"))
			action = new CustomerSignForm();
		
		return action;
	}
}
