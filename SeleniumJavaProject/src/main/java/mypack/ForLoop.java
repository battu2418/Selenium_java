package mypack;

public class ForLoop {

	public static void main(String[] args) {
		// Initialization, Condition ,Increment
		// for ,while and do while -- Priority
		
		System.out.println("printing ODD NUMBERS");
		for (int i=1;i<=10;i+=2)
		{
		System.out.println(i);  // print ODD Number
		}
		System.out.println("printing EVEN NUMBERS");
		for (int i=2;i<=10;i+=2)
		{
		System.out.println(i);  // print Even numbers
		}
		System.out.println("printing 1 to 10 NUMBERS");
		for (int i=1;i<=10;i++)
		{
		System.out.println(i);  // Print 1 to 10
		}
		System.out.println("printing 10 to 0 NUMBERS");
		for (int i=10;i>=0;i--)
		{
		System.out.println(i);  // print 10 to 0
		}
	}

}
