//package arraylist;
//
//import java.util.ArrayList;
//
//public class Quiz4 {
//
//	public static void main(String[] args) {
//		ArrayList<Student> list = new ArrayList<Student>();
//
//		list.add(new Student(1, "또치"));
//		list.add(new Student(2, "둘리"));
//		list.add(new Student(3, "도우너"));
//
//		
//		for(int i=0; i<list.size(); i++) {
//			Student stu = list.get(i);
//			stu.showStudent();
//		}
//		
//		for (Student info : list) {
//			info.showStudent();
//		}
//
//	}
//
//}
//
//class Student {
//	int num;
//	String name;
//
//	public Student(int num, String name) {
//		super();
//		this.num = num;
//		this.name = name;
//	}
//
//	public void showStudent() {
//		System.out.println("학번: " + num + ", 이름: " + name);
//	}
//}