//EXAMPLE ON POZO CLASS
public class EX5													//MAIN METHOD
{
	public static void main(String[]args)
	{
		BOOKP book=new BOOKP(101,"C PROGRAMMING","BALA",449.89);	//CREATING AN OBJECT AND ASSIGNING A REFERENCE TO OBJECT
		System.out.println("Sno"+"\t\t"+"Name"+"\t\t\t"+"Author"+"\t\t"+"Cost");
		System.out.println(book.getSno()+"\t\t"+book.getName()+"\t\t"+book.getAuthor()+"\t\t"+book.getCost());
		book.setCost(549.49);
		System.out.println(book.getSno()+"\t\t"+book.getName()+"\t\t"+book.getAuthor()+"\t\t"+book.getCost());
	}
}