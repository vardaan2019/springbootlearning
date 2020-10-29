package com.in28minutes.microservices.limitsservice.bean;

public class LimitConfiguration {
	private int min;
	private int max;

	public LimitConfiguration(int min, int max) {
		this.max = max;
		this.min = min;

	}

	public int getMin() {
		return min;
	}

	public void setMin(int min) {
		this.min = min;
	}

	public int getMax() {
		return max;
	}

	public void setMax(int max) {
		this.max = max;
	}
	

}
