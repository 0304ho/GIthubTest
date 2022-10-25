package atcoder;
import java.util.*;

public class A_Last_Card {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String nka = scan.nextLine();
		int n = Integer.parseInt(nka.split(" ")[0]);
		int k = Integer.parseInt(nka.split(" ")[1]);
		int a = Integer.parseInt(nka.split(" ")[2]);
		int result = -1;
		
		for( int i = 0;i<k;i++) {
			if(a>n) {
				a-=n;
			}
			a++;
		}
		
		result += a;
		
		
	
		System.out.println(result);
		
		
		
	}

}
