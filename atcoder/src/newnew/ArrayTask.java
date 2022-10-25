package newnew;

import java.util.Arrays;

public class ArrayTask {
	
	public static void main(String[] args) {
		//문자열 배열 생성
		String[] ar = {"카리나", "아이린", "윈터", "조이", "슬기"};
		
		//배열의 순회
//		for(String singer : ar) {
//			System.out.println(singer);
//		}
		
		//문자열의 크기비교하는 메서드. : compareTo // compareToIgnorecase
//		System.out.println(ar[1].compareTo(ar[0]));

		//선택 정렬
		//1. 배열의 복제
		String[] copyAr = Arrays.copyOf(ar, ar.length);
		
		//선택정렬
		//첫번째부터 n-1번째 데이터 까지
		for(int i  = 0 ; i < copyAr.length-1 ; i++) {
			//자신의 뒤에 있는 모든 데이터와 비교해서
			for(int j = i+1 ; j<copyAr.length ; j++) {
				//뒤에있는 데이터가 더 크다면 교환함
				if(copyAr[i].compareTo(copyAr[j])<0) {
					String temp = copyAr[i];
					copyAr[i] = copyAr[j];
					copyAr[j] = temp;
				}
			}
		}
		
		
		
	}

}
