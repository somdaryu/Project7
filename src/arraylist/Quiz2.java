package arraylist;

import java.util.ArrayList;

public class Quiz2 {

	public static void main(String[] args) {
		ArrayList<Boolean> list = new ArrayList<Boolean>();
		
		list.add(true);
		list.add(true);
		list.add(false);
		list.add(true);
		
		for(int i=0; i< list.size(); i++) {
			boolean boo = list.get(i); //wrapper 기초타입 서로 호환됨
			System.out.print(boo + " ");
		}
		
		//람다식
		for(boolean bool:list) {
			System.out.print(bool+" ");
		}
		System.out.println();
		
		int lastIndex = list.size() -1;
		boolean boo1 =list.get(0);
		boolean boo2 =list.get(lastIndex);
		System.out.print(boo1+" "+boo2);
	}

}
