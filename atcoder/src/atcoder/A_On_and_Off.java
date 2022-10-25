package atcoder;

import java.util.Scanner;

public class A_On_and_Off {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String stx = scan.nextLine();
		int s = Integer.parseInt(stx.split(" ")[0]);
		int t = Integer.parseInt(stx.split(" ")[1]);
		int x = Integer.parseInt(stx.split(" ")[2]);
		
		
		if(s>t) {
			if(s>x&&x>=t) {
				System.out.println("No");
			}else {
				System.out.println("Yes");
			}
			
		}else {
			if(s<=x&&x<t) {
				System.out.println("Yes");
			}else {
				System.out.println("No");
			}
			
		}
		
		
	}

}
