package com.leonardo.main.state;

public abstract class AbstractTrafficLightState {

	protected TrafficLightContext trafficLight;

	/**
	 * Default constructor.
	 *
	 * @param trafficLight the traffic light object.
	 */
	public AbstractTrafficLightState(TrafficLightContext trafficLight) {
		this.trafficLight = trafficLight;
	}

	/**
	 * Changes the traffic light color.
	 */
	public abstract void changeTrafficLight();

	/**
	 * Prints the light state (the traffic light color).
	 */
	public abstract void printState();

	/**
	 * @return if the current state can be is valid.
	 */
	public abstract boolean isNewStateValid(AbstractTrafficLightState newTrafficLight);

}
