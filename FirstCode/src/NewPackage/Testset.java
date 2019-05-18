package NewPackage;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class Testset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//HashSet<String> myset = new HashSet<String>();//
		HashSet<String> myset = new LinkedHashSet<String>();
		myset.add("Test1");
		myset.add("Test2");
		myset.add("Test3");
		myset.add("Test1");
		myset.remove("Test1");
		myset.size();
		for (Iterator<String> iterator = myset.iterator(); iterator.hasNext();) {
			String string = (String) iterator.next();
			System.out.println(myset);
			
		}

	}

}
