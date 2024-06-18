package activities;

public class Activity6 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		Plane p = new Plane(10);
		
		p.onboard("Pavan");
		p.onboard("Abhiram");
		p.onboard("Anusha");
		
		System.out.println("Plane took off at: "+ p.takeOff());
		
		System.out.println("People on the plane: "+ p.getPassengers());
		Thread.sleep(5000);
		p.land();
		System.out.println("Plane landed at: "+ p.getLastTimeLanded());
		
		System.out.println("People on the plane after landing: "+ p.getPassengers());

	}

}
