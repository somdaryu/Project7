package array;

import java.util.Arrays;

public class Quiz7 {

	public static void main(String[] args) {
		char[] arr = {'a', 'b', 'c', 'd', 'e'};
		char[] arr2 = new char[2];
		
		System.arraycopy(arr, 3, arr2, 0, 2);
		//System.arraycopy(배열1,시작위치,새배열,시작,갯수);
		
		System.out.println("원본배열: "+Arrays.toString(arr));
		System.out.println("새로운배열"+Arrays.toString(arr2));
	}

}
