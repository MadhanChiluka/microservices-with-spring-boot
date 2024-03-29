package com.madhan.microservices.limitsservice.bean;

import com.madhan.microservices.limitsservice.LimitsConfigurationController;

public class LimitConfiguration {

	private int maximum;
	private int minimum;

	protected LimitConfiguration() {

	}

	public LimitConfiguration(int maximum, int minimum) {
		super();
		this.maximum = maximum;
		this.minimum = minimum;
	}

	public int getMinimum() {
		return minimum;
	}

	public int getMaximum() {
		return maximum;
	}

}
