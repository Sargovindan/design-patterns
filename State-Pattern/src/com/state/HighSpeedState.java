package com.state;

import com.model.Fan;

public class HighSpeedState implements IState {

	public HighSpeedState(){
		getSpeed();
	}
	@Override
	public void greenPulled(Fan fan) {
		fan.setState(new OffSpeedState());

	}

	@Override
	public void redPulled(Fan fan) {
		fan.setState(new MediumSpeedState());

	}

	@Override
	public void getSpeed() {
		System.out.println("High");

	}

}
