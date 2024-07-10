package array;

import java.util.Arrays;

public class Ex5 {

	public static void main(String[] args) {
		char[] srcArr = {'a','b','c','d','e'};//원본
		char[] newArr = new char[3];
		
		System.arraycopy(srcArr, 0, newArr, 0, 3);
		
		System.out.println("원본배열: "+Arrays.toString(srcArr));
		System.out.println("새로운배열"+Arrays.toString(newArr));
 	}

}
