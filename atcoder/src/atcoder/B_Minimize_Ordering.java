package atcoder;

import java.util.*;

public class B_Minimize_Ordering {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String s = scan.nextLine();
		char[] ss = s.toCharArray();
		Arrays.sort(ss);
		
		StringBuffer str = new StringBuffer();
		
		for(int i = 0 ; i<ss.length ; i++) {
			str.append(ss[i]);
		}
		System.out.println(str);
	}

}
