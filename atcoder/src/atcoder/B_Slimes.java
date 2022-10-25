package atcoder;

import java.util.*;

public class B_Slimes {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String str = scan.nextLine();
		
		long a = Long.parseLong(str.split(" ")[0]);
		long b = Long.parseLong(str.split(" ")[1]);
		long k = Long.parseLong(str.split(" ")[2]);
		int count = 0;
		
		for(long i = a ; i<b ; i*=k) {
				count++;
			
		}
		System.out.println(count);
		
		
	}

}
