package atcoder;

import java.util.Scanner;

public class A_Tshirt {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		
		int a = Integer.parseInt(str.split(" ")[0]);
		int b = Integer.parseInt(str.split(" ")[1]);
		int c = Integer.parseInt(str.split(" ")[2]);
		int x = Integer.parseInt(str.split(" ")[3]);
		double result = 0;
		
		if( x <= a) {
			result = 1;
		}else if(a<x && x<=b) {
			result = (double)c/(b-a);
		}else {
			result=0;
		}
		System.out.printf("%.12f",result);
	}
}
