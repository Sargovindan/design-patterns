package com.state;

import com.model.Fan;

public interface IState {
	public void greenPulled(Fan fan);
	public void redPulled(Fan fan);
	public void getSpeed();
}
