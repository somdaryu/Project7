package arraylist;

import java.util.ArrayList;

public class Ex1 {

	public static void main(String[] args) {
		
		//리스트 생성
		//int -> Integer 리스트는 기초타입을 쓸 수 없음 클래스 타입만 쓸 수 있음
		ArrayList<Integer> list = new ArrayList<>();
		
		
		//새로운 요소 추가
		list.add(10);
		list.add(20);
		list.add(30);
		System.out.println(list);
		
		//2번째 위치에 요소 추가
		list.add(1, 40);
		System.out.println(list);
		
		//3번째 요소 삭제
		list.remove(2);
		System.out.println(list);
		
		//리스트에 저장된 요소 꺼내기
		int num1 = list.get(0);
		int num2 = list.get(1);
		int num3 = list.get(2);
		
	}

}
