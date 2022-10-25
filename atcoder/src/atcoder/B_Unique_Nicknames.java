package atcoder;
import java.util.*;

public class B_Unique_Nicknames {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String n = scan.nextLine();
		String[] arr1 = new String[Integer.parseInt(n)];
		String[] arr2 = new String[Integer.parseInt(n)];
		
		for( int i = 0  ; i<=Integer.parseInt(n)-1 ; i++) {
			String row = scan.nextLine();
			String[] name = row.split(" ");
			arr1[i] = name[0];
			arr2[i] = name[1];
		}
		int count = 0;
		int count2 = 0 ;
		for( int i = 0 ; i< arr1.length-1 ; i++) {
			for(int j = i+1 ; j < arr1.length ; j++) {
				if(arr1[i].equals(arr1[j])||arr1[i].equals(arr2[j])) {
					count++;
				}
				if(arr2[i].equals(arr1[j])||arr2[i].equals(arr2[j])) {
					count2++;
				}
			}
		}
		if( count==0 || count2==0) {
			System.out.println("yes");
		}else {
			System.out.println("no");
		}
	}
}
