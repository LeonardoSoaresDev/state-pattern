package com.leonardo.main.state;

/**
 * Implementation of a red light for a {@link TrafficLightContext}.
 *
 * @author leonardo
 */
public class GreenLight extends AbstractTrafficLightState {

	public GreenLight(TrafficLightContext trafficLight) {
		super(trafficLight);
	}

	@Override
	public void changeTrafficLight() {
		trafficLight.changeState(new YellowLight(trafficLight));
	}

	@Override
	public void printState() {
		System.out.println("Green light.");
	}

	@Override
	public boolean isNewStateValid(AbstractTrafficLightState newState) {
		return (newState instanceof YellowLight);
	}
}
