package newnew;

import java.util.Scanner;

public class Test1 {
	
	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		//실수 문자열을 입력받아서 실수로 변경하고 ㅇ출력하는 프로그램
		
		System.out.print("실수를 입력하세요 : ");
		String su = scan.nextLine();
		
		try {
			
		//문자열을 실수로 변환
		Double silsu = Double.parseDouble(su);
		
		//실수를 문자열로 변환ㅇㅇ
		String msg = silsu.toString();
		System.out.println(msg);
		}catch (Exception e) {
			System.out.println("실패");
		}
		
		scan.close();
		
	}

}
