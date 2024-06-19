package activities;

import java.util.HashMap;
import java.util.Map;

public class Activity11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String, String> m = new HashMap<>();
		
		m.put("color1", "black");
		m.put("color2", "white");
		m.put("color3", "yellow");
		m.put("color4", "green");
		m.put("color5", "blue");
		
		System.out.println("map: "+m);
		int size = m.size();
		
		boolean remove= m.remove("color1", "black");
		boolean contains = m.containsValue("green");
		int size1 = m.size();
		
		System.out.println("Size of the map is : "+size);
		System.out.println("Remove from map: "+remove);
		System.out.println("map: "+m);
		System.out.println("Size of the map is : "+size1);
		System.out.println("Green contains in map: "+contains);
		
		

	}

}
