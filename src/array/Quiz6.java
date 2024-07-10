package array;

public class Quiz6 {

	public static void main(String[] args) {
		int[] arr = {5,20,100,30,77};
		
		for(int i=0; i < arr.length; i++) {
			if(arr[i] == 20) {
				System.out.println("20을 가지는 요소의 인덱스는 "+i+"입니다.");
				break;
			}
		}

	}

}
