package activities;

import java.util.HashSet;
import java.util.Set;

public class Activity10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<Integer> hs = new HashSet<>();
		hs.add(1);
		hs.add(2);
		hs.add(3);
		hs.add(4);
		hs.add(5);
		hs.add(6);
		
		int size= hs.size();
		boolean remove = hs.remove(1);
		boolean remove1 = hs.remove(hs);
		boolean contains = hs.contains(2);
		int size1= hs.size();
		System.out.println("Size of the set is: "+ size);
		System.out.println("Remove 1 from the set: "+ remove);
		System.out.println("Remove others from the set: "+ remove1);
		System.out.println("2 contains in the set: "+ contains);
		System.out.println("Updated set is: "+ hs);
		System.out.println("Size of the set is: "+ size1);

	}

}
