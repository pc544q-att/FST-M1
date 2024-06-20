package activities;

import java.util.*;

public class Activity13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		List<Integer> list = new ArrayList<>();
		
		Random rn = new Random();
		
		while(sc.hasNextInt()) {
			list.add(sc.nextInt());
			
		}
		
		System.out.println(list);
		
		Integer [] nums = list.toArray(new Integer[0]);
		
		int index = rn.nextInt(nums.length);
		
		System.out.println(index);
		System.out.println(nums[index]);
		sc.close();
		
		
	}

}
