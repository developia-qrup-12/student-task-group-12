package main;

public class Student implements StudentInterface {
	String studentName;
	String className;
	int price;
	String subject;
	String teacherName;
	
	@Override
	public String classOfStudent(String studentName, String className) {
		return studentName+" "+className;
	}
	
	@Override
	public int priceOfStudent(int price) {
		return price;
	}
	
	@Override
	public String subjectOfStudent(String subject, String teacherName) {
		return subject+" "+teacherName;
	}
}
