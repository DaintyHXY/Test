
public class Person implements Comparable {
	private String Name;
	private String Address;
	private String PhoneNumber;
	private String EmailAddress;
	
	public Person(){
		Name= "";
		Address="No address yet";
		PhoneNumber="No phone number yet";
		EmailAddress="No email address yet";
		
	}
	
	
	public Person(String newName,String newAddress,String newPhoneNumber,String newEmailAddress){
		Name=newName;
		Address=newAddress;
		PhoneNumber=newPhoneNumber;
		EmailAddress=newEmailAddress;
	}
	
	public void SetName(String newName){
		Name=newName;
	}
	
	public void SetAddress(String newAddress){
		Address=newAddress;
	}

	public void SetPhoneNumber(String newPhoneNumber){
		PhoneNumber=newPhoneNumber;
	}
	
	public void SetEmailAddress(String newEmailAddress){
		EmailAddress=newEmailAddress;
	}
	
	public String ReturnName(){
		return Name;
	}
	
	public String toString(){
		return
		"Class:Person"+"\n Name:"+Name;
	}
	
	public int compareTo(Object o){
		if((o !=null)&&(o instanceof Person)){
			Person otherPerson=(Person)o;
			if(Name.length()>otherPerson.Name.length())
				return 1;
			else if(Name.length()<otherPerson.Name.length())
				return -1;
			else
				return 0;
			
		}
		return -1;
	}
	
		
	public void Display(){
		System.out.println("Name:"+Name);
		System.out.println("Address:"+Address);
		System.out.println("Phone Number:"+PhoneNumber);
		System.out.println("Email Address:"+EmailAddress);
	}
	
	
}


