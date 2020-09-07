//BOOK CLASS FOR EX3 ON PARAMETERIZED CONSTRUCTER FOR INTILIZING DIFFERENT DATA(DYNAMIC MODE)
public class BOOK											//USER DEFINED CLASS
{
	private int Sno;										//DECLARING VARIABLES PRIVATELY
	private String Name,Author;
	private double Cost;
	public BOOK(int s,String n,String a,double c)			//PARAMETERIZED CONSTRUCTER
	{
		Sno=s;
		Name=n;
		Author=a;
		Cost=c;
	}
	public void showBookInfo()									//METHOD
	{
		System.out.println("\nBOOK DETAILS:");
		System.out.println("SNO    :"+Sno);
		System.out.println("NAME   :"+Name);
		System.out.println("AUTHOR :"+Author);
		System.out.println("COST   :"+Cost);
	}
}