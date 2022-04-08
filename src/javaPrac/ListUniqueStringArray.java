package javaPrac;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class ListUniqueStringArray {

	public static void main(String[] args) {

		String[] a = { "apple", "banana", "mango", "grapes" };
		String[] b = { "apple", "banana", "jackfruit", "pineapple" };

		if (Arrays.equals(a, b)) {
			System.out.println("Same");
		}
		else {
			System.out.println("Not same");
	}
		
		List<String> list = new ArrayList<>(Arrays.asList(a)); 
		
		list.addAll(Arrays.asList(b)); 
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		for(int i=0;i<list.size();i++) {

			if(map.containsKey(list.get(i))) {
				
				Integer value = map.get(list.get(i));

				map.put(list.get(i), value + 1);
			}

			else {

				map.put(list.get(i), 1);
			}
		}

		for (Entry<String, Integer> m : map.entrySet()) {

			if(m.getValue()==1) {
				
			System.out.println("unique string value is "+ m.getKey());
		}
		}
		
}	
		
}


