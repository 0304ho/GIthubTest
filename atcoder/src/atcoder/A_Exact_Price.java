package atcoder;

import java.util.*;

public class A_Exact_Price {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		
		if(x>=100&& x%100==0) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		
	}

}
