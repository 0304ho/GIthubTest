package atcoder;

import java.util.*;

public class A_Seismic_magnitude_scales {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		
		int a = Integer.parseInt(str.split(" ")[0]);
		int b = Integer.parseInt(str.split(" ")[1]);
		int result = 0;
		
		result = (int) Math.pow(32, (a-b));
	
		System.out.println(result);
	}

}
