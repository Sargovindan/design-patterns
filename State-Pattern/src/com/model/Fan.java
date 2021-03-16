package com.model;

import com.state.IState;
import com.state.OffSpeedState;

public class Fan {
	
	private IState state;
	
	public Fan(){
		this.state = new OffSpeedState();
	}
	
	public void setState(IState state){
		this.state = state;
	}
    
	public IState getState(){
		return state;
	}
	
	public void pullGreen(){
		this.state.greenPulled(this);
	}
	
	public void pullRed(){
		this.state.redPulled(this);
	}
}
