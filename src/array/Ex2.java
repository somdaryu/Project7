package array;

public class Ex2 {

	public static void main(String[] args) {
		// 3개 크기의 정수형 배열 생성
		int[] arr = new int[3];
		arr[0] = 10; // 배열의 첫번째 요소에 10 저장
		arr[1] = 20;
		arr[2] = 30;

		int value = arr[2]; // 배열의 두번째 요소값을 가져와서 value에 저장
		System.out.println(value);
	}

}
