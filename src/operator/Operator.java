package operator;

public class Operator {
	public static void main(String[] args) {
		// Arithmetic operators (+,-,*,/,%)
		
	//	float c= (float)a/(float)b;
	//	System.out.println("c= " +c);
		
	//	int m=a+b*a-b;
	//	System.out.println("m= " +m);
		
		// increment and decrement operator 
		// pre-increment/decrement = ++a and --a (first execute then assign)
		// post-increment/decrement = a++ and a-- (first assign then execute)
		
		//int d=a++;
	//	System.out.println("d= " +d);
	//	int d= a++ + ++a + a++ + a++;
	//	System.out.println("a= " +a);
	//	System.out.println("d= " +d);
		
		//comparison operators (<,>,<=,>=,=,!=) gives true or false(boolean)

		int a= 10;
		int b= 3;
		System.out.println("Comparison operator");
		System.out.println(a<b);
		System.out.println(a>b);
		System.out.println(a==b);
		System.out.println(a<=b);
		System.out.println(a>=b);
		System.out.println(a!=b);
		
		// Bitwise operator
		System.out.println("Bitwise & Operator");
		System.out.println(true & true);
		System.out.println(true & false);
		System.out.println(false & true);
		System.out.println(false & false);
		System.out.println("Bitwise | Operator");
		System.out.println(true | true);
		System.out.println(true | false);
		System.out.println(false | true);
		System.out.println(false | false);
		
		//Logical bitwise
		System.out.println("Logical Bitwise && Operator");
		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println(false && true);
		System.out.println(false && false);
		System.out.println("Logical Bitwise || Operator");
		System.out.println(true || true);
		System.out.println(true || false);
		System.out.println(false || true);
		System.out.println(false || false);
		
		//Assignment operator
		a=+2;
		System.out.println("a= " +a);
		
		//ternary operator (?:)
		int age=17;
		age+=2;
		System.out.println(age);
		String agegroup= age<18?"child":"adult";
		System.out.println(agegroup);
		
		
	}
	
	

}
