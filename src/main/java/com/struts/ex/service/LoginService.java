package com.struts.ex.service;

import com.struts.ex.model.User;

public class LoginService {
	
public boolean verifyLogin(User user){ 
		
		if(user.getUserId().equals("bhaiyya") && user.getPassword().equals("1234"))
		{
			return true;  
		}
		
		return false;
	}

}
