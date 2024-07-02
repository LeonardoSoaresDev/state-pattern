package com.leonardo.main.state;

/**
 * Implementation of a yellow light for a {@link TrafficLightContext}.
 *
 * @author leonardo
 */
public class YellowLight extends AbstractTrafficLightState {

	public YellowLight(TrafficLightContext trafficLight) {
		super(trafficLight);
	}

	@Override
	public void changeTrafficLight() {
		trafficLight.changeState(new RedLight(trafficLight));
	}

	@Override
	public void printState() {
		System.out.println("Yellow light.");
	}

	@Override
	public boolean isNewStateValid(AbstractTrafficLightState newState) {
		return (newState instanceof RedLight);
	}
}
