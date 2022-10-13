package objects;

class Student {
 String Name;
 String ClassSection;
 int Age;
 University university;
 
 void studySubject()
 {
	 System.out.println("Hi I am studying in " + ClassSection);
 }
 void tellMeYourName()
 {
	 System.out.println("My name is " +Name);
 }
 void tellmeyourage()
 {
	 System.out.println(Name + " age is " + Age);
 }
 void tellMeYourAgeGroup()
 {
	 if(Age<18)
	 {
		 System.out.println(Name + " is a kid");
	 }
	 else {
		 System.out.println(Name + " is an adult");
	 }
 }
}
public class TestStudent
{
	public static void main(String[] args) {
		University u1= new University();
		u1.universityName = "Mumbai";
		u1.address= "Mumbai";
		u1.batch="Thane";
		
		
		Student s1= new Student();
		s1.Name= "Sarika";
		s1.Age= 28;
		s1.ClassSection= "testing";
		s1.university= u1;
		s1.tellMeYourName();
		
		Student s2= new Student();
		s2.Name= "Snehal";
		s2.Age= 17;
		s2.ClassSection= "testing";
		s2.university= u1;
		s2.tellMeYourName();
		
		s1.tellMeYourAgeGroup();
		s2.tellMeYourAgeGroup();
		s1.university.printuniversityName();
	}
}