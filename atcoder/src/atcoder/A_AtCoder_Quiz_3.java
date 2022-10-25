package atcoder;

import java.util.*;

public class A_AtCoder_Quiz_3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String agc = "";
		int a = scan.nextInt();
		if(a>=42&&a>=10) {
			a++;
			agc = "AGC0";
			agc+=a;
			
		}else if(a<10) {
			agc = "AGC00";
			agc+=a;
			
		}else {
			agc = "AGC0";
			agc+=a;
		}
		System.out.println(agc);
		
	}

}
