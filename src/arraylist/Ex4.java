package arraylist;

import java.util.ArrayList;

public class Ex4 {

	public static void main(String[] args) {
		Student stu1 = new Student("둘리");
		stu1.subjectList.add(new Subject("국어", 100));
		stu1.subjectList.add(new Subject("수학", 50));
		stu1.showInfo();
		
		Student stu2 = new Student("도우너");
		stu2.subjectList.add(new Subject("국어", 70));
		stu2.subjectList.add(new Subject("영어", 85));
		stu2.subjectList.add(new Subject("과학", 70));
		stu2.subjectList.add(new Subject("사회", 85));
		stu2.showInfo();
	}

}

class Subject {
	String name;
	int score;
	
	public Subject(String name, int score) {
		super();
		this.name = name;
		this.score = score;
	}
}

//학생의 총 점수를 출력하는 메소드
class Student {
	String studentName;
	ArrayList<Subject> subjectList;
	
	public Student(String studentName) {
		super();
		this.studentName = studentName;
		subjectList = new ArrayList<Subject>();
	}
	
	public void showInfo() {
		int total = 0;
		for(Subject s : subjectList) {
			total = total + s.score;
		}
		System.out.println(studentName + "학생의 총점은 "+total+"입니다.");
	}
}
