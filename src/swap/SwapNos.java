package swap;

public class SwapNos {
	public static void main(String[] args) {
		int x= 10;
		int y= 20;
		int z=x;
		x=y;
		y=z;
		System.out.println("x= " +x);
		System.out.println("y= " +y);
		
		// without declaring third variable

		int a= 5;
		int b= 7;
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("a= " +a);
		System.out.println("b= " +b);
		
				
	}

}

