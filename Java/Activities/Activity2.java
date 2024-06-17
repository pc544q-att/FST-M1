package activities;

public class Activity2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] array = {10,77,10,54,-11,10};
		
		int sum =0;
		for (int arrays: array ) {
			if(arrays== 10) {
				 sum += arrays;			
			}		
		}
		
		if(sum!=30) {
			System.out.println("Sum is not equal to 30 and total sum is : "+ sum);
		
		}else {
			System.out.println("Sum is equal to 30: "+ sum);
		}
		
		
		
		

	}

}
