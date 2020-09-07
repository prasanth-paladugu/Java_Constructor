//EXAMPLE ON PARAMETERIZED CONSTRUCTER FOR INTILIZING DIFFERENT DATA(DYNAMIC MODE)
import java.util.Scanner;
public class HW8												//MAIN METHOD
{
	public static void main(String[]args)
	{
		DATE d1=new DATE(30,04,1996);							//CREATING AN OBJECT AND ASSIGNING A REFERENCE TO OBJECT
		d1.showDate();											//CALLING A METHOD FROM ANOTHER CLASS
		Scanner in=new Scanner(System.in);
		int a=in.nextInt();
		int b=in.nextInt();
		int c=in.nextInt();
		DATE d2=new DATE(a,b,c);								//CREATING AN OBJECT AND ASSIGNING A REFERENCE TO OBJECT
		d2.showDate();											//CALLING A METHOD FROM ANOTHER CLASS
	}
}