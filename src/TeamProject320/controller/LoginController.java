package TeamProject320.controller;

import TeamProject320.model.Library;

public class LoginController {
	private Library model = null;
	
	public LoginController(Library model) {
		this.model = model;
	}
	
	public boolean checkUserName(String name) {
		return model.validateUserName(name);
	}
	
	public boolean validateCredentials(String name, String pw) {
		return model.validatePW(name, pw);
	}
}
