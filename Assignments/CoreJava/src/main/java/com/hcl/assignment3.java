package com.hcl;

public class assignment3 {

}


class Vehicle {
	int vehicleNum;
	String model;
	String manufacturer;
	String color= "white";
}
class Truck extends Vehicle {
	int loadingCapacity = 100;
	public void changeAttribute() {
		this.color="black";
		this.loadingCapacity=200;
		
	}
}
abstract class assignment_3 {
	public static void main(String[] args) {
		Truck truck=new Truck();
		truck.changeAttribute();
	}
}

