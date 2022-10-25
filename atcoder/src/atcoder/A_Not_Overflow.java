package atcoder;

import java.util.*;
public class A_Not_Overflow {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		long n =  scan.nextLong();
		long max = (long)Math.pow(2, 31)-1;
		long min = (long)Math.pow(2, 31)*-1;
		if( min<=n && n<=max) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		
	}

}
