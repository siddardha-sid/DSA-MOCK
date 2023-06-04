package Problems;

import java.util.HashMap;
import java.util.Map;

public class NonRepeating {
	public static void main(String[] args) {
		String s="aabb";
		System.out.println(nonRepeatingElement(s));
	}
	public static int nonRepeatingElement(String s) {
		Map<Character,Integer> m=new HashMap<>();
		for(int i=0;i<s.length();i++) {
			m.put(s.charAt(i), m.getOrDefault(s.charAt(i), 0)+1);
		}
		for(int i=0;i<s.length();i++) {
			if(m.get(s.charAt(i))==1) {
				return i;
			}
		}
		return -1;
	}
}
