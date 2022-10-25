package atcoder;

import java.util.Scanner;

public class A_Good_Morning {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String row = scan.nextLine();
		
		int da = Integer.parseInt(row.split(" ")[0]);
		int db = Integer.parseInt(row.split(" ")[1]);
		int aa = Integer.parseInt(row.split(" ")[2]);
		int ab = Integer.parseInt(row.split(" ")[3]);
		
		if(da<=aa && db<=ab) {
			System.out.println("Takahashi");
		}else {
			System.out.println("Aoki");
		}
	}

}
