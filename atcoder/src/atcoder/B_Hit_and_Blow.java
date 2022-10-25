package atcoder;

import java.util.*;
public class B_Hit_and_Blow {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String row1 = scan.nextLine();
		String row2 = scan.nextLine();
		String row3 = scan.nextLine();
		String[] arr2 = row2.split(" ");
		String[] arr3 = row3.split(" ");
		
		int count=0; //같은위치
		int count1 = 0; //같은위치다른열
		
		for(int i = 0 ; i < arr2.length ; i++) {
			for(int j = 0; j<arr2.length ; j++) {
				if( arr2[i].equals(arr3[j])) {
					if(i==j) {
						count++;
					}else if(i!=j) {
						count1++;
					}
				}
			}
		}
		System.out.println(count);
		System.out.println(count1);
		
		
	}
}
