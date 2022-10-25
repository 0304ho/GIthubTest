package atcoder;

import java.util.*;
public class A_chukodai {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		String ab = scan.nextLine();
		int a = Integer.parseInt(ab.split(" ")[0])-1;
		int b = Integer.parseInt(ab.split(" ")[1])-1;
		String temp = "";
		
		String[] str = s.split("");
		temp = str[a];
		str[a] = str[b];
		str[b] = temp;
		String result="";
		for(String arr : str) {
			result+=arr;
		}
		System.out.println(result); 
	}
}
