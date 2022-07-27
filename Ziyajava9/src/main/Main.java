package main;

public class Main {
	
	public static void main(String[] args) {
		Student student = new Student();
		student.studentName = "Ziya";
		student.className = "7ç";
		student.price = 3;
		student.subject = "Fizika";
	    student.teacherName = "Nuriyye";
	    
	    System.out.println("Telebenin adi "+student.studentName+", sinif adi "+student.className+", qiymeti "+student.price+", fennin adi "+student.subject+", muellimenin adi "+student.teacherName);
	    System.out.println("Telebenin adi "+student.studentName+", sinif adi "+student.className);
	    System.out.println("Qiymeti "+student.price);
	    System.out.println("Fennin adi "+student.subject+", Muellimenin adi "+student.teacherName);
	}

}