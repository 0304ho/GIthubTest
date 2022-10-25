package atcoder;

import java.util.*;

public class A_First_Grid {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String row1 = scan.nextLine();
		String row2 = scan.nextLine();
		
		String a1 = row1.split("")[0];
		String a2 = row1.split("")[1];
		String b1 = row2.split("")[0];
		String b2 = row2.split("")[1];
		String result = "";
		
		if((a1.equals(".")&&b2.equals("."))||(a2.equals(".")&&b1.equals("."))) {
			result = "No";
		}else {
			result="Yes";
		}

		System.out.println(result);
		
		
		
	}

}
