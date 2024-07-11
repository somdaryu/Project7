package arraylist;

import java.util.ArrayList;

public class Ex3 {

	public static void main(String[] args) {
		ArrayList<Book> list = new ArrayList<Book>();
		
		Book book = new Book("태백산맥", "조정래");
		list.add(book); //객체를 미리 만들고 추가
		
		//객체를 생성하면서 추가
		list.add(new Book("데미안", "헤르만 헤세"));
		list.add(new Book("어떻게 살 것인가", "유시민"));
		
		System.out.println();
		
		for(int i=0; i<list.size(); i++) {
			Book b = list.get(i);
			b.showBookInfo();
		}
		
		//람다시 for문 변경
		for(Book b : list) {
			b.showBookInfo();
		}
	}

}

class Book {
	String bookName;
	String author;
	
	public Book(String bookName, String author) {
		super();
		this.bookName = bookName;
		this.author = author;
	}
	
	public void showBookInfo() {
		System.out.println(bookName + "," + author);
	}
}
