//BOOKS CLASS FOR EX2 ON DEFAULT CONSTRUCTER FOR INTILIZING SAME DATA(STATIC MODE)
public class BOOKS								//USER DEFINED CLASS
{
	private int Sno;							//DECLARING VARIABLES PRIVATELY
	private String Name,Author;
	private double Cost;
	public BOOKS()								//NON-PARAMETERIZED CONSTRUCTER
	{
		Sno=01;
		Name="C PROGRAMMING";
		Author="BALA";
		Cost=399.99;
	}
	public void showInfo()						//METHOD
	{
		System.out.println("BOOK DETAILS");
		System.out.println("SNO    :"+Sno);
		System.out.println("NAME   :"+Name);
		System.out.println("AUTHOR :"+Author);
		System.out.println("COST   :"+Cost);
	}
}