package activities;

public class Activity3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double Seconds=1000000000;
		double EarthSeconds =31557600;
		double MercurySeconds= 0.2408467;
		double VenusSeconds= 0.61519726;
		double MarsSeconds = 1.8808158;
		double JupiterSeconds = 11.862615;
		double SaturnSeconds = 29.447498;
		double UranusSeconds = 84.016846;
		double NeptuneSeconds = 164.79132;
		
		System.out.println("Mercury Age is: "+ Seconds/EarthSeconds/MercurySeconds);
		System.out.println("Venus Age is: "+ Seconds/EarthSeconds/VenusSeconds);
		System.out.println("Mars Age is: "+ Seconds/EarthSeconds/MarsSeconds);
		System.out.println("Jupiter Age is: "+ Seconds/EarthSeconds/JupiterSeconds);
		System.out.println("Saturn Age is: "+ Seconds/EarthSeconds/SaturnSeconds);
		System.out.println("Uranus Age is: "+ Seconds/EarthSeconds/UranusSeconds);
		System.out.println("Neptune Age is: "+ Seconds/EarthSeconds/NeptuneSeconds);
	}

}
