package me.bebeli555.cookieclient.events.render;

import me.bebeli555.cookieclient.events.bus.Cancellable;

public class GetRainStrenghtEvent extends Cancellable {
	public float value;
	
	public GetRainStrenghtEvent(float value) {
		this.value = value;
	}
}
