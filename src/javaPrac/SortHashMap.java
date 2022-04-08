package javaPrac;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class SortHashMap {

	public static void main(String[] args) {

		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(5, "Aryan");
		map.put(11, "Dhruv ");
		map.put(4, "Balendra");
		map.put(77, "Yagnesh");
		map.put(9, "Chaitanya");
		map.put(66, "Vihaan");
		map.put(0, "Arjun");
		System.out.println("Before Sorting:");
		for (Entry<Integer, String> x : map.entrySet()) {

			System.out.println(x.getKey() + ":" + x.getValue());

		}
		
		System.out.println("After Sorting :");
		
		Map<Integer, String> sortedMap = new TreeMap<Integer, String>(map);

		for (Entry<Integer, String> x : sortedMap.entrySet()) {

			System.out.println(x.getKey() + ":" + x.getValue());

		}

	}

}
