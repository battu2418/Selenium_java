package test;

public class ExceptionHandlingDemo {

	public static void main(String[] args) {

		try{
			System.out.println("Helo World .....!");
			int i = 1/0;
			System.out.println("Helo World .....! Completed");

		}
		catch(Exception e){

			System.out.println("I am inside catch block");
			System.out.println("I am inside catch block an Error message is:" + e.getMessage() );
			System.out.println("caue is :" + e.getCause());
			e.printStackTrace();
		}
		finally{
			System.out.println("I am finally in final block");
		}
	}

}
