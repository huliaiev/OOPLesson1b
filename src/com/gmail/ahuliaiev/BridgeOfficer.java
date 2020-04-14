package com.gmail.ahuliaiev;

public class BridgeOfficer {

	private int maxWeight;

	public BridgeOfficer(int normalVolume) {
		this.maxWeight = normalVolume;
	}

	public boolean checkTruck(Truck truck) {

		if (truck.getWeight() > maxWeight) {
			return false;
		} else {
			return true;
		}
	}

}