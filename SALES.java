//SALES CLASS FOR HW7 ON DEFAULT CONSTRUCTER FOR INTILIZING SAME DATA(STATIC MODE)
public class SALES								//USER DEFINED CLASS
{
	private int id,itemsSold;					//DECLARING VARIABLES PRIVATELY
	private String item;
	private double amount;
	public SALES()								//NON-PARAMETERIZED CONSTRUCTER
	{
		id=1001;
		itemsSold=13;
		item="SHIRTS";
		amount=1399.99;
	}
	public void showInfo()						//METHOD
	{
		System.out.println("SALES DETAILS");
		System.out.println("ID        :"+id);
		System.out.println("ITEM   	  :"+item);
		System.out.println("ITEMSSOLD :"+itemsSold);
		System.out.println("AMOUNT    :"+amount);
	}
}