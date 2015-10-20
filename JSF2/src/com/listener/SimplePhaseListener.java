package com.listener;

import javax.faces.event.PhaseEvent;
import javax.faces.event.PhaseId;
import javax.faces.event.PhaseListener;

public class SimplePhaseListener implements PhaseListener {

	@Override
	public void afterPhase(PhaseEvent arg0) {
		System.out.println("I am before "+arg0.getPhaseId());

	}

	@Override
	public void beforePhase(PhaseEvent arg0) {
		System.out.println("I am after "+arg0.getPhaseId());

	}

	@Override
	public PhaseId getPhaseId() {
		// TODO Auto-generated method stub
		
		return PhaseId.ANY_PHASE;
	}

}
