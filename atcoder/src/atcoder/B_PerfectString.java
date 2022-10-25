package atcoder;
import java.util.*;

public class B_PerfectString {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		
		char[] arr = s.toCharArray();
		int count1 = 0;
		int count2 = 0;
		int count3 = 0;
		for( int i = 0 ; i< arr.length ; i++) {
			if(arr[i]>=65 && arr[i]<=90) {
				count1++;
			}
			if(arr[i]>=97 && arr[i]<=122)
				count2++;
			}
		
		for(int i = 0 ; i<arr.length-1 ; i++) {
			for( int j = i+1 ; j<arr.length ; j++) {
				if( arr[i] == arr[j])
					count3++;
			}
		}
		
		if(count1==0||count2==0||count3!=0) {
			System.out.println("No");
		}else {
			System.out.println("Yes");
		}
		
	}
		
		
	}

