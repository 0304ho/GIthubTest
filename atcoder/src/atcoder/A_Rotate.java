package atcoder;

import java.util.Arrays;
import java.util.Scanner;

public class A_Rotate {
	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		String xyz = scan.nextLine();
		int[] arr = {Integer.parseInt(xyz.split("")[0]),
					Integer.parseInt(xyz.split("")[1]),
					Integer.parseInt(xyz.split("")[2])};
		
		int result = 0;
		
		for( int i = 0 ; i < arr.length ; i ++) {
			for( int j = 1 ; j<=100 ; j*=10) {
				result += arr[i]*j;
			}
			
		}
		System.out.println(result);
		
		
	}

}
