//EXAMPLE ON PARAMETERIZED CONSTRUCTER FOR INTILIZING DIFFERENT DATA(DYNAMIC MODE)
import java.util.Scanner;
public class EX3												//MAIN METHOD
{
	public static void main(String[]args)
	{
		BOOK b1=new BOOK(101,"C PROGRAMMING","BALA",449.89);	//CREATING AN OBJECT AND ASSIGNING A REFERENCE TO OBJECT
		b1.showBookInfo();										//CALLING A METHOD FROM ANOTHER CLASS
		Scanner in=new Scanner(System.in);
		int a=in.nextInt();
		String b=in.next();
		String c=in.next();
		double d=in.nextDouble();
		BOOK b2=new BOOK(a,b,c,d);								//CREATING AN OBJECT AND ASSIGNING A REFERENCE TO OBJECT
		b2.showBookInfo();										//CALLING A METHOD FROM ANOTHER CLASS
		//BOOK b3=new BOOK();									//DEFAULT CONSTRUCTOR IS NOT AVAILABLE
	}
}