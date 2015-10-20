package com.bean;

import java.util.Iterator;
import java.util.Set;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

@SessionScoped
@ManagedBean(name="loginBean")
public class LoginBean {
	
	private String user;
	private String password;
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String doLogin(){
		
		return "welcome";
	}
	public String doReset(){
		this.user="";
		this.password="";
		
		return "login";
	}
	
	public String forgotPass(){
		
		Iterator<FacesMessage> itr =FacesContext.getCurrentInstance().getMessages();
		if(itr.hasNext()){
			FacesMessage fm =itr.next();
			System.out.println(" "+fm.getSummary());
			return "login";
		}
		Set<String> set= FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap().keySet();
		Iterator<String> itr2 =set.iterator();
		
		while(itr2.hasNext()){
			String key=itr2.next();
			if(key.contains("user")){
				user = FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap().get(key);
				break;
			}
		}
		
		return "forgot";
	}

}
