package atcoder;

import java.util.*;

public class A_Distinct_Strings {

	public static void main(String[] args) {
		
		Scanner scan  = new Scanner(System.in);
		
		String s = scan.nextLine();
		String[] s1 = s.split("");
		int result =0;
		int count = 0 ;
		for( int i = 0 ; i<s1.length-1 ; i++) {
			for( int j = i+1 ; j<s1.length ; j++) {
				if(s1[i].equals(s1[j])) {
					count++;
				}
			}
		}
		if( count == 3 ) {
			result=1;
		}else if(count==1) {
			result=3;
		}else if(count==0) {
			result=6;
		}
		
		System.out.println(result);
	}
}
