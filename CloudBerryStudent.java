package day8;

public class CloudBerryStudent {
	
		  int sid;
		  String sname;
		  char grade;
		  
		  void printStuData()
		  {
			  System.out.println(sid+" "+sname+ " "+grade);
		  }
		  
		  //user defined method
		  void setStuData(int id, String name, char g)
		  {
			  sid=id;
			  sname=name;
			  grade=g;
			  
		  }
		  
		  CloudBerryStudent(int id, String name, char g)
		  {
			  sid=id;
			  sname=name;
			  grade=g; 
		  }
		  
		  CloudBerryStudent(int id)
		  {
			  sid=id;
			 
		  }
		  
		
		  
		  
	}


