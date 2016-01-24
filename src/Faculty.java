
public class Faculty extends Employee implements Comparable{
	private String OfficeHour;
	private String Rank;
	
   public Faculty(){
	   super();
	   OfficeHour="No office hour yet";
	   Rank="No rank yet";
   }
   
   public void resetEmployee(String newName,String newAddress,String newPhoneNumber,String newEmailAddress,String newOffice,String newSalary,String newYear,String newMonth,String newDay){
	   resetPerson(newName,newAddress,newPhoneNumber,newEmailAddress);
	   SetOffice(newOffice);
	   SetSalary(newSalary);
	   SetDateHired(newYear, newMonth, newDay);
	   
   }
   
   public void SetOfficeHour(String newOfficeHour){
	   OfficeHour=newOfficeHour;
   }
   
   public void SetRank(String newRank){
	   Rank=newRank;
   }
   
   public String toString(){
	   return
			   "Class:Faculty"
			   +"Name:"+ReturnName();
   }
   
   public void FacultyDisplay(){
	  EmployeeDisplay();
	  System.out.println("Rank:"+Rank);
	  System.out.println("Office Hour:"+OfficeHour);
   }
   
   public int compareTo(Object o){
		
		if((o !=null)&&(o instanceof Person)){
			Faculty otherFaculty=(Faculty)o;
			
			return (OfficeHour.compareTo(otherFaculty.OfficeHour));
	   }
		return -1;
	}
}
