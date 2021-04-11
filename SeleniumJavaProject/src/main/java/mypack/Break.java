package mypack;

public class Break {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("if condition is true ,it takes break");
		
		for (int i=2;i<=10;i+=2)
		{
			if (i==6) // if condition is true ,it takes break
			{
				break;
			}
			System.out.println(i); // 2 4
		}
		
	System.out.println("if condition is true ,it takes Continue");
		
		for (int i=2;i<=10;i+=2)
		{
			if (i==6) // if condition is true ,it takes break
			{
				continue;
			}
			System.out.println(i); // 2 4 8 10
		}
	}

}
