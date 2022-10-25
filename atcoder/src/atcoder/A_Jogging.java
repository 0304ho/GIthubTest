package atcoder;

import java.util.Scanner;

public class A_Jogging {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String row = scan.nextLine();
		int a = Integer.parseInt(row.split(" ")[0]);
		int b = Integer.parseInt(row.split(" ")[1]);
		int c  = Integer.parseInt(row.split(" ")[2]);

		int d = Integer.parseInt(row.split(" ")[3]);
		int e = Integer.parseInt(row.split(" ")[4]);
		int f  = Integer.parseInt(row.split(" ")[5]);
		int x = Integer.parseInt(row.split(" ")[6]);
		int ta =0;
		int ao = 0;


		if(a + c >= x) {
			ta = a * b;
		}else {
			ta = a * b *(x /(a + c)) ;
			if(x % (a+c)  <= a) {
				ta += (x % (a+c)) * b;
			}else {
				ta += ((x % (a+c)) -((x % (a+c)) % a)) * b;
			}
		}
		if(d + f >= x ) {
			ao = d * e;
		}else {
			ao = d * e *(x /(d + f));
			if(x % (d + f)  <= d) {
				ao += (x % (d + f)) * e;
			}else {
				ao += ((x % (d + f)) -((x % (d + f)) % d)) * b;
			}



			if(ao==ta) {
				System.out.println("draw");
			}else if(ao>ta) {
				System.out.println("Aoki");
			}else {
				System.out.println("Takahashi");
			}




			// ts* tw = 이동 거리
			// tr = 휴식시간
			//if(x/ts >0){
			//	x= x-tr
			//	x=






		}
	}
}

