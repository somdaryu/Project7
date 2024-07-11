package arraylist;

import java.util.ArrayList;

public class Quiz3 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();

		list.add("AA");
		list.add("BB");
		list.add("CC");
		list.add("DD");
		list.add("EE");

		for (String st : list) {
			System.out.print(st + " ");
		}
		System.out.println();

		list.remove(4);
		list.remove(3);
		list.remove(2);
		list.remove(1);
		list.remove(0);

		//리스트는 계속 크기가 바껴서 0번인덱스를 계속 삭제하면 된다.
		
		System.out.println("list size는 " + list.size());
	}

}
