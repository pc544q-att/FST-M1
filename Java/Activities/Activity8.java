package activities;

public class Activity8 {

	public static void main(String[] args) throws CustomException {
		// TODO Auto-generated method stub
		try {
			exceptionTest("Pavan");
			 
		    exceptionTest(null);
		   
		}catch(CustomException CE) {
			System.out.println("Custom MGS is: "+ CE.getMessage());
		}
		finally {
			exceptionTest("Wrong Text");
			
		}
		

	}

	public static void exceptionTest(String str) throws CustomException {
		
		if(str ==null) {
			throw new CustomException("String is null");
		}else {
			System.out.println(str);
		}
		
		
	}

	
}
