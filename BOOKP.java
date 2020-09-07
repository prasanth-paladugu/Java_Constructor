//BOOKP CLASS FOR EX5 ON POZO CLASS
public class BOOKP											//USER DEFINED CLASS
{
	private int Sno;										//DECLARING VARIABLES PRIVATELY
	private String Name,Author;
	private double Cost;
	public BOOKP()											//NON-PARAMETERIZED CONSTRUCTER
	{
		Sno=0;
		Name="";
		Author="";
		Cost=0.0;
	}
	public BOOKP(int s,String n,String a,double c)			//PARAMETERIZED CONSTRUCTER WITH 4 ARGUMENTS
	{
		Sno=s;
		Name=n;
		Author=a;
		Cost=c;
	}
	public void setSno(int i)								//METHOD FOR SETTING DATA
	{
		Sno=i;
	}
	public void setName(String n)							//METHOD FOR SETTING DATA
	{
		Name=n;
	}
	public void setAuthor(String a)							//METHOD FOR SETTING DATA
	{
		Author=a;
	}
	public void setCost(double c)							//METHOD FOR SETTING DATA
	{
		Cost=c;
	}
	public int getSno()										//METHOD FOR GETING DATA
	{
		return Sno;
	}
	public String getName()									//METHOD FOR GETING DATA
	{
		return Name;
	}
	public String getAuthor()									//METHOD FOR GETING DATA
	{
		return Author;
	}
	public double getCost()									//METHOD FOR GETING DATA
	{
		return Cost;
	}

}