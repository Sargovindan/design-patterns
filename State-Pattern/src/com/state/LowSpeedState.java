package com.state;

import com.model.Fan;

public class LowSpeedState implements IState {

	public LowSpeedState(){
		getSpeed();
	}
	@Override
	public void greenPulled(Fan fan) {
		fan.setState(new MediumSpeedState());

	}

	@Override
	public void redPulled(Fan fan) {
		fan.setState(new OffSpeedState());

	}

	@Override
	public void getSpeed() {
		System.out.println("Low");

	}

}
