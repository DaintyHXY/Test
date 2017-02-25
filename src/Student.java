
public class Student extends Person implements Comparable{
	private String ClassStatus;
	
	public Student(){
		super();
		ClassStatus="No status yet";
	}
	
	
	public void resetPerson(String newName,String newAddress,String newPhoneNumber,String newEmailAddress){
		SetName(newName);
		SetAddress(newAddress);
		SetPhoneNumber(newPhoneNumber);
		SetEmailAddress(newEmailAddress);
	}

	public void SetClassStatus(String newClassStatus){
		ClassStatus=newClassStatus;
	}
	
	public String toString(){
		return
				"Class:Student"
				+"\n Name:"+ReturnName();
	}
	
	public void StudentDisplay(){
		Display();
		System.out.println("Class Status:"+ClassStatus);
	}

public int compareTo(Object o){
		
		if((o !=null)&&(o instanceof Person)){
			Student otherStudent=(Student)o;
			
			return (ReturnName().compareTo(otherStudent.ReturnName()));
	   }
		return -1;
	}//When name is back,return>0
}
