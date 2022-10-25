package atcoder;

import java.util.*;

public class A_10yenStamp {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String str = scan.nextLine();
		int x = Integer.parseInt(str.split(" ")[0]);
		int y = Integer.parseInt(str.split(" ")[1]);
		int count = 0;
		
		for(int i = x ; i<y ; i+=10) {
				count++;
		}
		
		System.out.println(count);
		
	}

}
