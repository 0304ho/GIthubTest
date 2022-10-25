package atcoder;

import java.util.Scanner;

public class A_Lacked_Number {
	
	public static void main(String[] args) {
		
		//Recursive Function
		//parseint
		//
		//
		Scanner scan = new Scanner(System.in);
		String row1 = scan.nextLine();
		
		//로직처리
		
		int result = 0;
		for(int i = 0 ; i < 10 ; i++) {
			if(row1.contains(String.valueOf(i))) {
			}else {
				result = i;
			}
		}
		
		
		//출력
		System.out.println(result);
		
		
		
	}
	
	
	

}
