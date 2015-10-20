package com.listener;

import javax.faces.bean.ManagedProperty;
import javax.faces.context.FacesContext;
import javax.faces.event.AbortProcessingException;
import javax.faces.event.ValueChangeEvent;
import javax.faces.event.ValueChangeListener;

import com.bean.ListenerBean;

public class SimpleValueChangeListner implements ValueChangeListener {
	
	

	@Override
	public void processValueChange(ValueChangeEvent event)
			throws AbortProcessingException {
		
		System.out.println("Hello VCL");
		ListenerBean listenerBean = (ListenerBean) FacesContext.getCurrentInstance().
				getExternalContext().getRequestMap().get("listenerBean");
		String code="";
		if("IN".equalsIgnoreCase(event.getNewValue().toString())){
			code="+91";
		}else if("UK".equalsIgnoreCase(event.getNewValue().toString())) {
			code="+44";
		}else if("US".equalsIgnoreCase(event.getNewValue().toString())) {
			code="+11";
		}

		listenerBean.setMobcode(code);

	}

}
