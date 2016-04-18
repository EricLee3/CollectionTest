package jason.in.ajin;

import java.util.*;

public class SetExample {
	public static void main(String args[])  {
		Set<String> set = new HashSet<String>();
		set.add("psyche");
		set.add("jason");
		set.add("Branda");
		
		System.out.println(set);
		Set<String> sortedSet = new TreeSet<String>(set);
		System.out.println(sortedSet);
		
		
		
		List A = new ArrayList();
		
		A.add("hangang");
		A.add("Namsan");
		String han = (String)A.get(1);
		
	}
}
