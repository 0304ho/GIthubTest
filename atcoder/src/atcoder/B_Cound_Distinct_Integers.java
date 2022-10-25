package atcoder;

import java.util.*;
public class B_Cound_Distinct_Integers {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
			String row1 = scan.nextLine();
			String row2 = scan.nextLine();
			int n = Integer.parseInt(row1);
			String[] arr = row2.split(" ");
			int count =0;
			
			for( int i = 0 ; i<arr.length ; i++) {
				for( int j = i+1 ; j < arr.length ; j++) {
					if(arr[i].equals(arr[j])) {
						arr[i] = "";
						count++;
						System.out.println(Arrays.toString(arr));
					}
				}
				
			}
			System.out.println(n-count);
		
	}
}
