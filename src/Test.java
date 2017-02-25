
public class Test {
	public static void main(String arg[]){
 
		Student s=new Student();
		Student s1=new Student();
		
    	s.resetPerson("zhansan", "xjtu", "18292886035", "371577121@qq.com");
    	s.SetClassStatus("freshman");
    	
    	
    	s1.resetPerson("lisi", "xjtu", "18292886036", "540977121@qq.com");
    	s1.SetClassStatus("freshman");
    	
    	if(s.compareTo(s1)>0){
    		s1.StudentDisplay();
    		s.StudentDisplay();
    		
    	}
    	
    	else if(s.compareTo(s1)<=0){
    		s.StudentDisplay();
    		s1.StudentDisplay();
    	}
    	

    	Person per=new Person();
    	per.SetName("zhangsan");
    	per.SetEmailAddress("371577121@qq.com");
    	per.SetPhoneNumber("18292886035");
    	per.SetAddress("xjtu");
    	per.Display();
    	System.out.println(per.toString());
    	
    	Student stu=new Student();
    	stu.SetName("zhangsan");
    	stu.SetEmailAddress("371577121@qq.com");
    	stu.SetPhoneNumber("18292886035");
    	stu.SetAddress("xjtu");
    	stu.SetClassStatus("freshman");
    	stu.StudentDisplay();
    	System.out.println(stu.toString());
    	
    	Employee emp=new Employee();
    	emp.SetName("zhangsan");
    	emp.SetEmailAddress("371577121@qq.com");
    	emp.SetPhoneNumber("18292886035");
    	emp.SetAddress("xjtu");
    	emp.SetOffice("A305");
    	emp.SetSalary("7500");
    	emp.SetDateHired("2001", "05", "31");
    	emp.EmployeeDisplay();
    	System.out.println(emp.toString());
    	
    	Staff sta=new Staff();
    	sta.SetName("zhangsan");
    	sta.SetEmailAddress("371577121@qq.com");
    	sta.SetPhoneNumber("18292886035");
    	sta.SetAddress("xjtu");
    	sta.SetOffice("A305");
    	sta.SetSalary("7500");
    	sta.SetDateHired("2001", "05", "31");
    	sta.SetTitle("manager");
    	sta.StaffDisplay();
    	System.out.println(sta.toString());
    	
    	Faculty fac=new Faculty();
    	fac.SetName("zhangsan");
    	fac.SetEmailAddress("371577121@qq.com");
    	fac.SetPhoneNumber("18292886035");
    	fac.SetAddress("xjtu");
    	fac.SetOffice("A305");
    	fac.SetSalary("7500");
    	fac.SetDateHired("2001", "05", "31");
    	fac.SetOfficeHour("8");
    	fac.SetRank("manager");
    	fac.FacultyDisplay();
    	System.out.println(fac.toString());
    	
    	
    	}
    	
       
}
