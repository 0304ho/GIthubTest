package atcoder;

import java.util.Scanner;

public class A_WeirdFunction {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		System.out.println(f(f(f(t)+t)+f(f(t))));
		
	}
	
	public static int f(int x) {
		int func = (x*x)+(2*x)+3;
		
		return func;
	}
}
