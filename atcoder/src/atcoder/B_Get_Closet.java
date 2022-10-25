package atcoder;

import java.util.*;

public class B_Get_Closet {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String ab = scan.nextLine();
		int a = Integer.parseInt(ab.split(" ")[0]);
		int b = Integer.parseInt(ab.split(" ")[1]);
		
		double result1 = 0;
		double result2 = 0;
		
		
		result1= a/ Math.sqrt(Math.pow(a, 2)+Math.pow(b, 2));
		result2= b/ Math.sqrt(Math.pow(a, 2)+Math.pow(b, 2));
		
		System.out.println(result1 + " " + result2);
	}

}
