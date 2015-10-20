package com.bean;

/*
 * 
    Okay, when should I use the immediate attribute?

    If it isn't entirely clear yet, here's a summary, complete with real world use examples when they may be beneficial:

        If set in UIInput(s) only, the process validations phase will be taken place in apply request values phase instead. Use this to prioritize validation for the UIInput component(s) in question. When validation/conversion fails for any of them, the non-immediate components won't be validated/converted.

        If set in UICommand only, the apply request values phase until with update model values phases will be skipped for any of the UIInput component(s). Use this to skip the entire processing of the form. E.g. "Cancel" or "Back" button.

        If set in both UIInput and UICommand components, the apply request values phase until with update model values phases will be skipped for any of the UIInput component(s) which does not have this attribute set. Use this to skip the processing of the entire form expect for certain fields (with immediate). E.g. "Password forgotten" button in a login form with a required but non-immediate password field.


 * 
 */

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name="welBean")
@SessionScoped
public class WelcomeBean {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
