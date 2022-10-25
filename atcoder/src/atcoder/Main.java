package atcoder;

import java.util.*;
public class Main {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int row1 = scan.nextInt();
		String row3 = scan.nextLine();
		char[] row2  = row3.toCharArray();
		int x = 0; 
		int y = 0;
		int spin = 0;
		for( int i = 0 ; i<row1; i++) {
			if( spin == 0) {
				if(row2[i]=='S') x++;
				if(row2[i]=='R') spin =1;
			}else if( spin == 1) {
				if(row2[i]=='S') y--;
				if(row2[i]=='R') spin =2;
			}else if( spin == 2) {
				if(row2[i]=='S') x--;
				if(row2[i]=='R') spin =3;
			}else if( spin == 3) {
				if(row2[i]=='S') y++;
				if(row2[i]=='R') spin =0;
			}
		}
		
		System.out.println(x + " " + y);
		
		
	}

}
