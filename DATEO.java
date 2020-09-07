//DATEO CLASS FOR HW9 ON CONSTRUCTER OVERLODING
public class DATEO											//USER DEFINED CLASS
{
	private int Y,M,D,H,Mi,S;								//DECLARING VARIABLES PRIVATELY
	public DATEO(int a,int b,int c,int d,int e,int f)		//PARAMETERIZED CONSTRUCTER WITH 6 ARGUMENTS
	{
		Y=a;
		M=b;
		D=c;
		H=d;
		Mi=e;
		S=f;
	}
	public DATEO(int a,int b,int c,int d,int e)				//PARAMETERIZED CONSTRUCTER WITH 5 ARGUMENTS
	{
		Y=a;
		M=b;
		D=c;
		H=d;
		Mi=e;
	}
	public DATEO(int a,int b,int c,int d)					//PARAMETERIZED CONSTRUCTER WITH 4 ARGUMENTS
	{
		Y=a;
		M=b;
		D=c;
		H=d;
	}
	public DATEO(int a,int b,int c)							//PARAMETERIZED CONSTRUCTER WITH 3 ARGUMENTS
	{
		Y=a;
		M=b;
		D=c;
	}
	public DATEO(int a,int b)								//PARAMETERIZED CONSTRUCTER WITH 2 ARGUMENTS
	{
		Y=a;
		M=b;
	}
	public DATEO(int a)										//PARAMETERIZED CONSTRUCTER WITH 1 ARGUMENTS
	{
		Y=a;
	}
	public void showDate()									//METHOD FOR GETTING DATA
	{
		System.out.println("\nDATE IS");
		System.out.println(D+"-"+M+"-"+Y+" "+H+":"+Mi+":"+S);
	}
}