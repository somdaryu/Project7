package array;

public class Quiz8 {

	public static void main(String[] args) {
		Student[] school = new Student[3];
		
		school[0]= new Student(1, "또치");
		school[1]= new Student(2, "둘리");
		school[2]= new Student(3, "도우너");

		for(int i=0; i<school.length; i++) {
			school[i].showInfo();
		}
	}
}

class Student {
	int number;
	String name;
	
	public Student(int number, String name) {
		super();
		this.number = number;
		this.name = name;
	}
	
	public void showInfo() {
		System.out.println("학번: "+number+" 이름: "+name+"입니다.");
	}
	
}