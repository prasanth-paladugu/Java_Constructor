//EXAMPLE ON CONSTRUCTORS
class DEMO
{
	DEMO()												//COSTRUCTER NON-PARAMETERIZED
	{
		System.out.println("CONSTRUCTOR CALLED");
	}
}
public class EX1
{
	public static void main(String[]args)
	{
		DEMO o1=new DEMO();								//CREATING AN OBJECT AND ASSIGNING A REFERENCE TO OBJECT
		DEMO o2=new DEMO();
		new DEMO();										//CREATING AN OBJECT
		o1=new DEMO();									//CREATING A NEW OBJECT WITH PREVIOUS REFERENCE
	}
}
