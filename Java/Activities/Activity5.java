package activities;

import java.util.Scanner;

public class Activity5 extends Book{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book book = new Activity5();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter book Title: ");
		String title = sc.nextLine();
		
		
		book.setTitle(title);
		
		System.out.println("Book Title is: "+ book.getTitle());
		

	}

}
