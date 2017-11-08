package oopsConcept;

public class ACMEBicycle implements BicycleIneterface {

	int cadence = 0;
	int speed = 0;
	int gear = 1;
	
	/* The compiler now requires that(from Bicycle Interface) methods
	 changeCadence, changeGear , speedUp, and applyBrakes
	 all be implemented. Compilation will fail these methods are missed from the
	 same class. */
	
	@Override
	public void changeCadence(int newValue) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void speedUp(int increment) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void changeGear(int newValue) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void applyBrakes(int decrement) {
		// TODO Auto-generated method stub
		
	}
	
	public void printStates() {
		System.out.println("cadence: "+ cadence + " speed: "+ speed+ " gear: "+gear);
	}

}
