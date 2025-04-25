package day8;

public class CloudBerryStudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub{
		//CloudBerryStudent student = new CloudBerryStudent();
		
		//1. Assign data using object reference
		
		
		// student.sid = 101; student.sname = "John"; student.grade = 'A';
		 
		 //student.printStuData();
		
		
		//2. Assign data using user defined method
		
		//student.setStuData(101, "John", 'A');
		//student.printStuData();
		
		// 3. assign value using constructor
		
		CloudBerryStudent stu= new CloudBerryStudent(101, "John", 'A');
        stu.printStuData();
        
        //CloudBerryStudent stu1 = new CloudBerryStudent(102);
        //stu1.printStuData();
	}

}


