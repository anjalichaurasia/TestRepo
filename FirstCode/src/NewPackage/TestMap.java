package NewPackage;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TestMap {

public static void main(String[] args) {
		// TODO Auto-generated method stub
	Map<Integer, String> m = new HashMap<Integer, String>();
		//TreeMap<Integer,String> m =new TreeMap<Integer, String>();
		m.put(402, "AB");
		m.put(402, "AB");
		m.put(311, "CD");
		m.put(269, "EF");
		m.put(579, "GH");
		System.out.println(m.get(311));
		System.out.println(m);
		//m.remove(269);
		System.out.println(m);
		Set<Integer> keySet = m.keySet();
		for (Iterator iterator = keySet.iterator(); iterator.hasNext();) {
			Integer key = (Integer) iterator.next(); // Key is variable
			System.out.println(m.get(key)); // Key is variable
			
			
		}
		

	}

}
