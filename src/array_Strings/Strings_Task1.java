package array_Strings;

import java.util.HashSet;

public class Strings_Task1 {

	public static void duplicateChar(String str) {
		String s = str.toLowerCase();
		char[] c = s.toCharArray();
		int count=1;
		HashSet<Character> list = new HashSet<Character>();
		
		for(int i=0;i<s.length();i++) {
			char ch = c[i];
			for(int j=i+1;j<s.length();j++) {
				if(ch==c[j]) {
					count++;
				}
			}
			if(count>1) {
				list.add(ch);
			}
			count=1;
		}
		System.out.println(list);
	}
	public static void main(String[] args) {
		duplicateChar("Hello");
	}
}
