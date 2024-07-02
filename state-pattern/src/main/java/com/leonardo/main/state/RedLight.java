package com.leonardo.main.state;

/**
 * Implementation of a red light for a {@link TrafficLightContext}.
 *
 * @author leonardo
 */
public class RedLight extends AbstractTrafficLightState {

	public RedLight(TrafficLightContext trafficLight) {
		super(trafficLight);
	}

	@Override
	public void changeTrafficLight() {
		trafficLight.changeState(new GreenLight(trafficLight));
	}

	@Override
	public void printState() {
		System.out.println("Red light.");
	}

	@Override
	public boolean isNewStateValid(AbstractTrafficLightState newState) {
		return (newState instanceof GreenLight);
	}
}
