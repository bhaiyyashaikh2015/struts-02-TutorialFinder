package com.struts.ex.actions;

import org.apache.commons.lang3.StringUtils;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.struts.ex.model.User;
import com.struts.ex.service.LoginService;

public class LoginAction extends ActionSupport implements ModelDriven{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private User user = new User();
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public void validate() {
		
		if(StringUtils.isEmpty(user.getUserId())) {
			// user ID is blank
			addFieldError("userId", "User ID can not be blank");
		}
		if(StringUtils.isEmpty(user.getPassword())) {
			// password is blank
			addFieldError("password", "Password can not be blank");
		}
	}
	
	public String execute(){ 
		
		LoginService loginService = new LoginService();
		
		if(loginService.verifyLogin(user))
		{
			return SUCCESS;  
		}
		
		return LOGIN;
	}

	@Override
	public Object getModel() {
		return user;
	}
	

}
