package com.struts.ex.actions;

import com.opensymphony.xwork2.Action;

public class LoginActionImplementsActionInterface implements Action{
	
	private String userId;
	private String password;
	
	public String execute(){ 
		
		if(getUserId().equals("bhaiyya") && getPassword().equals("1234"))
		{
			return SUCCESS;  
		}
		
		return LOGIN;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	

}
