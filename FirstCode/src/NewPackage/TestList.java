package NewPackage;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.w3c.dom.NameList;

public class TestList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> nameList = new ArrayList<String>();
		nameList.add("A");
		nameList.add("B");
		nameList.add("C");
		System.out.println(nameList.size());
		System.out.println(nameList.get(1));
		nameList.remove(2);
		System.out.print(nameList.size());
		nameList.get(1);
		for (Iterator iterator = nameList.iterator(); iterator.hasNext();) {
			String string = (String) iterator.next();
			System.out.println(nameList);
			
		}
		

	}

}
