//BOOKO CLASS FOR EX4 ON CONSTRUCTER OVERLODING
public class BOOKO											//USER DEFINED CLASS
{
	private int Sno;										//DECLARING VARIABLES PRIVATELY
	private String Name,Author;
	private double Cost;
	public BOOKO()											//NON-PARAMETERIZED CONSTRUCTER
	{
		Sno=101;
		Name="CODING";
		Author="NARESH";
		Cost=10000;
	}
	public BOOKO(int s,String n,String a,double c)			//PARAMETERIZED CONSTRUCTER WITH 4 ARGUMENTS
	{
		Sno=s;
		Name=n;
		Author=a;
		Cost=c;
	}
	public BOOKO(int s,String n,String a)					//PARAMETERIZED CONSTRUCTER WITH 3 ARGUMENTS
	{
		Sno=s;
		Name=n;
		Author=a;
		Cost=0;
	}
	public BOOKO(int s,String n,double c)					//PARAMETERIZED CONSTRUCTER WITH 3 ARGUMENTS
	{
		Sno=s;
		Name=n;
		Author="";
		Cost=c;
	}
	public BOOKO(int s,double c)							//PARAMETERIZED CONSTRUCTER WITH 2 ARGUMENTS
	{
		Sno=s;
		Name="";
		Author="";
		Cost=c;
	}
	public void showBookInfo()								//METHOD
	{
		System.out.println(Sno+"\t"+Name+"\t"+Author+"\t"+Cost);
	}
}