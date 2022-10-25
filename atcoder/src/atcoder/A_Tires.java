package atcoder;

import java.util.*;

public class A_Tires {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		if(str.length()>=3 ) {
			String last1 = str.substring(str.length()-3, str.length());
			if(last1.equals("ist")) {
				System.out.println("ist");
			}else if(last1.substring(1, 3).equals("er")) {
				System.out.println("er");
			}
		}else if(str.length()<=2) {
			
			String last1 = str.substring(str.length()-2, str.length());
		if(last1.equals("er")) {
			System.out.println("er");
		}
		}

	}

}
