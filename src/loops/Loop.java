package loops;

public class Loop {
public static void main(String[] args) {
	int a=3;
	while(a<=10)
	{
		System.out.println("a= " +a);
		a++;
	}
	System.out.println("I am out of the while loop");
	
  int b = 1;
  do {
		  System.out.println("b=" +b);
		  b++;
  }
		while(b<=10);
  
  for(int m=0;m<10;m++)
  {
  	System.out.println("m= " +m);
  }
}
}
