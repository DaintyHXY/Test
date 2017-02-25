
public class StudentTest {
    public static void main(String arg[]){
    	Student s=new Student();
    	s.resetPerson("huangxinyi", "xjtu", "18292886035", "371577121@qq.com");
    	s.SetClassStatus("freshman");
    	s.StudentDisplay();
    	
    	Student s1=new Student();
    	s1.resetPerson("baohan", "xjtu", "18292886035", "371577121@qq.com");
    	s1.SetClassStatus("freshman");
    	s1.StudentDisplay();
    	
    }
}
