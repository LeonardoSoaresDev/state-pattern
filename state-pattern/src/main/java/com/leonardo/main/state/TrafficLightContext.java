package com.leonardo.main.state;

/**
 * Class that represents a simple traffic light
 * @author leonardo
 */
public class TrafficLightContext {

	private AbstractTrafficLightState trafficLightState;

	/**
	 * Default TrafficLight construct
	 *
	 * @param initialTrafficLight the initial traffic light state
	 */
	public TrafficLightContext() {
		this.trafficLightState = new RedLight(this);
	}

	/**
	 * Changes the current state based in the given new state.
	 *
	 * @param newTrafficState the new state.
	 */
	public void changeState(AbstractTrafficLightState newTrafficState) {
		if (!trafficLightState.isNewStateValid(newTrafficState)) {
			throw new IllegalAccessError("The new given don't state does not follow the right order and cannot not be changed");
		}
		this.trafficLightState = newTrafficState;
	}

	/**
	 * Default changer for the traffic light state.
	 */
	public void changeStatus() {
		while(true) {
			try {
				Thread.sleep(5000);
				trafficLightState.changeTrafficLight();
				trafficLightState.printState();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	/**
	 * @return the current traffic light state.
	 */
	public AbstractTrafficLightState getCurrentState() {
		return trafficLightState;
	}
}
