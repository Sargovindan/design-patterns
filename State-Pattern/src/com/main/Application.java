package com.main;

import com.model.Fan;

public class Application {

	/**
	 * @param args
	 * Here the pulling green function of the fan is executed. 
	 * As one consistently pulls on the green ribbon on the fun,
	 * the state should change from off->low->medium->high->off.
	 * 
	 */
	public static void main(String[] args) {
		Fan fan = new Fan();
		fan.pullGreen();
		fan.pullGreen();
		fan.pullGreen();
	}

}
