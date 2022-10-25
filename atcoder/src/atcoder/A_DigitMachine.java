package atcoder;
import java.util.*;

public class A_DigitMachine {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		int[] arr = {Integer.parseInt(str.split(" ")[0]),
				Integer.parseInt(str.split(" ")[1]),
				Integer.parseInt(str.split(" ")[2]),
				Integer.parseInt(str.split(" ")[3]),
				Integer.parseInt(str.split(" ")[4]),
				Integer.parseInt(str.split(" ")[5]),
				Integer.parseInt(str.split(" ")[6]),
				Integer.parseInt(str.split(" ")[7]),
				Integer.parseInt(str.split(" ")[8]),
				Integer.parseInt(str.split(" ")[9])};
		
		int result = arr[arr[arr[0]]];
		System.out.println(result);
	}

}
