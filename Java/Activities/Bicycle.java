package activities;

class Bicycle implements BicycleParts, BicycleOperations {
	
	public int gears;
	public int currentspeed;
	
	public Bicycle(int gears, int currentspeed) {
		this.gears = gears;
		this.currentspeed = currentspeed;
	}
	
	public void applyBrake(int decrement) {
		currentspeed -= decrement;
		System.out.println("Current speed: "+currentspeed);
	}
	
	public void speedUp(int increment) {
		currentspeed += increment;
		System.out.println("Current speed: "+ currentspeed);
			}
	public String bicycleDesc() {
		return("No of gears are "+gears+"\nSpeed of bicycle is "+currentspeed);
	}

	@Override
	public void applyBreake(int decrement) {
		// TODO Auto-generated method stub
		
	}

	

	

}
