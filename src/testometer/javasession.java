package testometer;

public class javasession {
String Name;
String ClassSection	;
int age;
University University;
Agriculture Agriculture;	

void tellMeYourSession() {
		System.out.println("Hello I am studying "+ ClassSection);
	
	}
void tellMeYourName()
{
	System.out.println("My name is " + Name);
}
void tellMeYourAge()
{
	System.out.println(Name + "age is " + age);
}
}
class TestJavasession
{
	public static void main(String[] args) {
		University U1= new University();
		U1.UniversityName= "Mumbai";
		U1.City="Thane";
		U1.Branch= "Science";
	
		
		Agriculture A1= new Agriculture();
		A1.SubjectName = "Agronomy";
		A1.Practical= "Field";
		A1.CityName = "Rahuri";
		
		javasession s1= new javasession();
		
		s1.Name="Snehal";
		s1.age=26;
		s1.ClassSection="Selenium";
		s1.University= U1;
		s1.Agriculture= A1;
		
		s1.tellMeYourName();
		s1.tellMeYourAge();
		s1.tellMeYourSession();
		
javasession s2= new javasession();
s2.Name="Amar";
s2.age= 27;
s2.ClassSection= "Selenium";
	
s2.tellMeYourName();
s2.tellMeYourAge();
s2.tellMeYourSession();
s1.University.TellMeYourUniversity();
s1.Agriculture.TellMeYourSubjectName();
	}
	
	
}

	
	