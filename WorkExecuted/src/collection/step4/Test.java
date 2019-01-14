package collection.step4;

import java.util.TreeSet;

public class Test {
	
	public static void main(String[] args) {
		
		TreeSet<House> myHouseArrayList = new TreeSet<House>();
		
		House firstHouse = new House(100, 120000, "Tokyo", true);
		House secondHouse = new House(40, 70000, "Oxford", true);
		House thirdHouse = new House(70, 180000, "Paris", false);
		
		myHouseArrayList.add(firstHouse);
		myHouseArrayList.add(secondHouse);
		myHouseArrayList.add(thirdHouse);
		
		for (House h: myHouseArrayList) {
			System.out.println(h);
		}
		
		
	}
}

