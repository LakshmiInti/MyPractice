package training;

public class MethodOverRidingMain extends MethodOverRiding {
	void eat()
	{
		System.out.println("eating bread...");
	
	}  
	public static void main(String args[])
	{
		MethodOverRiding e=new MethodOverRidingMain();
		e.eat();
	}

}
