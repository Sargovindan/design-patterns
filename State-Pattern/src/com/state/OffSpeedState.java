package com.state;

import com.model.Fan;

public class OffSpeedState implements IState {

	public OffSpeedState(){
		getSpeed();
	}
	@Override
	public void greenPulled(Fan fan) {
		fan.setState(new LowSpeedState());

	}

	@Override
	public void redPulled(Fan fan) {
		fan.setState(new HighSpeedState());

	}

	@Override
	public void getSpeed() {
		System.out.println("Off");

	}

}
