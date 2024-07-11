package arraylist;

import java.util.ArrayList;

public class Quiz1 {

	public static void main(String[] args) {
		ArrayList<Character> list = new  ArrayList<Character>();
		
		list.add('A');
		list.add('B');
		list.add('C');
		
		for(int i=0; i< list.size(); i++) {
			char ch = list.get(i); //wrapper 기초타입 서로 호환됨
			System.out.print(ch + " ");
		}
	}

}
