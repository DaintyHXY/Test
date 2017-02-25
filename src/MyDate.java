
public class MyDate{
	private String Year;
	private String Month;
	private String Day;

	
	public MyDate(){
		Year="0";
		Month="0";
		Day="0";
	}
	
	public String MyDateHired(){
		return "0"+"/"+"0"+"/"+"0";
	}
	
	public String setYear(String newYear){
		Year=newYear;
		return Year;
		
	}
	
	public String setMonth(String newMonth){
		Month=newMonth;
		return Month;
	}
	
	public String setDay(String newDay){
		Day=newDay;
		return Day;
	}
   
	public String setMyDateHierd(String newYear,String newMonth,String newDay){
		return newYear+"/"+newMonth+"/"+newDay;
		
	}
}