//EXAMPLE ON CONSTRUCTER OVERLOADING
public class EX4													//MAIN METHOD
{
	public static void main(String[]args)
	{
		System.out.println("Sno"+"\t"+"Name"+"\t"+"Author"+"\t"+"Cost");
		BOOKO b1=new BOOKO();									//CREATING AN OBJECT AND ASSIGNING A REFERENCE TO OBJECT
		b1.showBookInfo();
		BOOKO b2=new BOOKO(102,"C","BALA",449.89);				//CREATING AN OBJECT AND ASSIGNING A REFERENCE TO OBJECT
		b2.showBookInfo();
		BOOKO b3=new BOOKO(103,"JAVA","BALA");					//CREATING AN OBJECT AND ASSIGNING A REFERENCE TO OBJECT
		b3.showBookInfo();
		BOOKO b4=new BOOKO(104,"C+",449.89);					//CREATING AN OBJECT AND ASSIGNING A REFERENCE TO OBJECT
		b4.showBookInfo();
		BOOKO b5=new BOOKO(105,449.89);							//CREATING AN OBJECT AND ASSIGNING A REFERENCE TO OBJECT
		b5.showBookInfo();
	}
}