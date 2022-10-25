package atcoder;

import java.util.Scanner;

public class A_Shampoo {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String row = scan.nextLine();
		int v = Integer.parseInt(row.split(" ")[0]);
		int f = Integer.parseInt(row.split(" ")[1]);
		int m = Integer.parseInt(row.split(" ")[2]);
		int t = Integer.parseInt(row.split(" ")[3]);
		
		while(v>=0) {
			v-=f;
			if(v<0) {
				System.out.println("F");
				break;
			}
			v-=m;
			if(v<0) {
				System.out.println("M");
				break;
			}
			v-=t;
			if(v<0) {
				System.out.println("T");
				break;
			}
			
		}
			
			
		
		
		
		
		
	}

}
