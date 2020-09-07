//DATE CLASS FOR HW8 ON PARAMETERIZED CONSTRUCTER FOR INTILIZING DIFFERENT DATA(DYNAMIC MODE)
public class DATE											//USER DEFINED CLASS
{
	private int D,M,Y;										//DECLARING VARIABLES PRIVATELY
	public DATE(int a,int b,int c)							//PARAMETERIZED CONSTRUCTER
	{
		D=a;
		M=b;
		Y=c;
	}
	public void showDate()									//METHOD
	{
		System.out.println("DATE IS :"+D+"-"+M+"-"+Y);
	}
}