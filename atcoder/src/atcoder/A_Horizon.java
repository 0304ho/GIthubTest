package atcoder;

import java.util.*;

public class A_Horizon {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String a = scan.next();
		double result =0;
		
		result = Math.sqrt(Double.parseDouble(a)*(12800000+Double.parseDouble(a)));
	
		System.out.printf("%.9f",result);
		
		
	}

}
