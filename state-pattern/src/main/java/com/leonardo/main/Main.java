package com.leonardo.main;

import com.leonardo.main.state.GreenLight;
import com.leonardo.main.state.TrafficLightContext;

public class Main {

	static TrafficLightContext trafficLightContext = new TrafficLightContext();

	public static void main(String [] args) {
		trafficLightContext.getCurrentState().printState();
		trafficLightContext.changeState(new GreenLight(trafficLightContext));
		trafficLightContext.changeStatus();
	}
}
