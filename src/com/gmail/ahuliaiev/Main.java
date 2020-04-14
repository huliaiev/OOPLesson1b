package com.gmail.ahuliaiev;




public class Main {
	
	public static void main(String[] args) {
		
		Truck first = new Truck();
		first.setWeight(10000);
		
		Truck second = new Truck();
		second.setWeight(20000);
		
		Truck third = new Truck();
		second.setWeight(14000);

		BridgeOfficer officer = new BridgeOfficer(15000);
		
		System.out.println("Грузовик номер 1! Могу я проехать, офицер?");
		boolean canFirstTruckGo = officer.checkTruck(first);
		System.out.println(canFirstTruckGo);

		System.out.println();

		System.out.println("Грузовик номер 2! А мне можно?");
		boolean canSecondTruckGo = officer.checkTruck(second);
		System.out.println(canSecondTruckGo);
		
		System.out.println();

		System.out.println("Грузовик номер 3! А мне можно?");
		boolean canThirdTruckGo = officer.checkTruck(third);
		System.out.println(canSecondTruckGo);

		
	}
}