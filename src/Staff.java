
public class Staff extends Employee implements Comparable{
	private String Title;

	public Staff(){
		super();
		Title="No title yet";
		
	}
	
	public void resetEmployee(String newName,String newAddress,String newPhoneNumber,String newEmailAddress,String newOffice,String newSalary,String newYear,String newMonth,String newDay){
		   resetPerson(newName,newAddress,newPhoneNumber,newEmailAddress);
		   SetOffice(newOffice);
		   SetSalary(newSalary);
		   SetDateHired(newYear, newMonth, newDay);
	}
	
	public void SetTitle(String newTitle){
		Title=newTitle;
	}
	
	public String toString(){
		return
				"Class:Staff"
				+"Name:"+ReturnName();
	}
	
	public void StaffDisplay(){
		EmployeeDisplay();
		System.out.println("Title:"+Title);
	}
	
public int compareTo(Object o){
		
		if((o !=null)&&(o instanceof Person)){
			Staff otherStaff=(Staff)o;
			
			return (Title.compareTo(otherStaff.Title));
	   }
		return -1;
	}
}

