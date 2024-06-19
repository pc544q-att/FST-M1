package activities;

public class MountainBike extends Bicycle {
	
	public int seatHeight;
	
	public MountainBike(int gears, int currentspeed, int startHeight) {
		
		super(gears, currentspeed);
		seatHeight = startHeight;
	}
	
	public void setHeight(int newvalue) {
		seatHeight = newvalue;
	}
	
	public String bicycleDesc() {
		return (super.bicycleDesc()+"\nSeat height is "+seatHeight);
	}
	
	

}
