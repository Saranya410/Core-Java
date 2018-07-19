package Pack1;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
MySchool s1=new MySchool();
s1.city="cbe";
s1.schlname="sjsv";
s1.noofstudnt=100;
Trainer t1=new Trainer();
t1.age=48;
t1.name="xxx";
t1.salary=45239.23;
System.out.println("School :"+s1.schlname);
System.out.println("City :"+s1.city);
System.out.println("Students :"+s1.noofstudnt);
Trainer t2=new Trainer();
t2.name="YYY";
System.out.println("Trainer Name :"+t2.name);
	}

}
