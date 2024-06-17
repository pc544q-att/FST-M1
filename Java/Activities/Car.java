package activities;

public class Car {
	
	String color;
	String transmission;
	int make;
	int tyres;
	int doors;
	
	public  Car(int tyres, int doors) {
		this.tyres = tyres;
		this.doors =doors;
	}
	
	public void displaycharacteristics(String color, String transmission, int make) {
		
		System.out.println("Car color is : "+ color);
		System.out.println("Car Transmission is : "+ transmission);
		System.out.println("Car make is : "+ make);
		System.out.println("Car doors : "+ doors);
		System.out.println("Car tyres : "+ tyres);
	}
	
	public void accelarate() {
		
		System.out.println("Car moving forward.");
	}
	
	public void brake() {
		System.out.println("Car has stopped.");
	}

}
