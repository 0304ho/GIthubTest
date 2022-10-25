package atcoder;

import java.util.*;
public class B_Go_Straight_and_Turn_Right {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String row1 = scan.nextLine();
		String row2 = scan.nextLine();
		int x = 0; 
		int y = 0;
		int spin = 0;
		for( int i = 0 ; i<row2.length(); i++) {
			if( spin == 0) {
				if(row2.charAt(i)=='S') x++;
				if(row2.charAt(i)=='R') spin =1;
			}else if( spin == 1) {
				if(row2.charAt(i)=='S') y--;
				if(row2.charAt(i)=='R') spin =2;
			}else if( spin == 2) {
				if(row2.charAt(i)=='S') x--;
				if(row2.charAt(i)=='R') spin =3;
			}else if( spin == 3) {
				if(row2.charAt(i)=='S') y++;
				if(row2.charAt(i)=='R') spin =0;
			}
		}
		
		System.out.println(x + " " + y);
		
		
	}

}
