
public class Employee extends Person implements Comparable{
	private String Office;
	private String Salary;
	private MyDate DateHired=new MyDate();
	private String MyDateHired;
	
	public Employee(){
		super();
		Office="No office yet";
		Salary="null";
		MyDateHired="unkonwn";
		
	}
	
	public Employee(String newName,String newAddress){
		SetName(newName);
		SetAddress(newAddress);
	}

	public void resetPerson(String newName,String newAddress,String newPhoneNumber,String newEmailAddress){
		SetName(newName);
		SetAddress(newAddress);
		SetPhoneNumber(newPhoneNumber);
		SetEmailAddress(newEmailAddress);
	}
	
	public void SetOffice(String newOffice){
		Office=newOffice;
		
	}
	
	public void SetSalary(String newSalary){
		Salary=newSalary;
	}
	
	public void SetDateHired(String newYear,String newMonth,String newDay){
		MyDateHired=DateHired.setMyDateHierd(newYear, newMonth, newDay);
	}
		
	
	public String toString(){
		return
		"Class:Employee"
		+"\n Name:"+ReturnName();
	}
	
	public void EmployeeDisplay(){
		Display();
		System.out.println("Office:"+Office);
		System.out.println("Salary"+Salary);
		System.out.println("Date Hired"+MyDateHired);
	}
	
	public int compareTo(Object o){
		
		if((o !=null)&&(o instanceof Person)){
			Employee otherEmployee=(Employee)o;
			
			return (Salary.compareTo(otherEmployee.Salary));
	   }
		return -1;
	}   //Whose salary is more,who will be back.
	
}
