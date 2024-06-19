package activities;

import java.util.ArrayList;
import java.util.List;

public class Activity9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> myList = new ArrayList<>();
		myList.add("Pavan");
		myList.add("Pavan1");
		myList.add("Pavan2");
		myList.add("Pavan3");
		myList.add("Pavan4");
		
		for (String names : myList) {
			System.out.println(names);
		}
		
		System.out.println("3rd name is: "+ myList.get(2));
		System.out.println("Contains name is: "+ myList.contains("Pavan1"));
		System.out.println("Remove name is: "+ myList.remove("Pavan4"));
		System.out.println("Final List is: "+ myList);
		System.out.println("Final List Size is: "+ myList.size());
		

	}

}
