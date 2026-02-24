public class OperatorsPart2{
	public static void main(String[] args) {
		int num1 = 70;
		int num2 = 50;
		int num3 = 120;
		
		//Logical operators(&&,||,!)
		boolean andResult = (num1 > num2) && (num1 > num3);
		System.out.printf("The result is %b",andResult);
		
		boolean andResults = (num1 > num2) && (num1 != num3);
		System.out.printf("The AND result is %b%n",andResults);
		
		boolean orResults = (num1 > num2) || (num1 != num3);
		System.out.printf("The OR result is %b%n",orResults);
		
		
		boolean notResults = !(num1 > num2) || (num1 == num3);
		System.out.printf("The NOT result is %b%n",notResults);
		
		//Unary orResults(++,--)
		int x = 5;
		int y = ++x;
		
		System.out.println("The value of x is " + x);
		System.out.println("The value of y is "+ y);
		
		x = 5;
		y = x++;
		System.out.println("The value of x is "+ x);
		System.out.println("The value of y is "+ y);
		
		//Unary Decreament operators
		--x;
		--x;
		y = ++x;
		
		System.out.println("The value of decreament x is "+ x);
		System.out.println("The value of decreament y is "+ y);
		
	}
}