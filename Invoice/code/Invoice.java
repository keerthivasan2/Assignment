import java.util.*;
class Invoice
{
      public static void main(String[]args)
   {
	   int product;
	   float gst,price;
	   Scanner s=new Scanner(System.in);
	   System.out.println("1.BOOKS");
	   System.out.println("2.GROCERY");
	   System.out.println("3.ELECTRONIS");
	   product=s.nextInt();
	   System.out.println("Enter the price:");
	   Scanner in=new Scanner(System.in);
	   price=in.nextFloat();
	   switch(product)
	   {
		   case 1:
		         gst=price*5/100;
				 System.out.println("THE GST IS:"+gst);
				 System.out.println("THE PRICE IS:"+price);
				 System.out.println("TOTAL PRICE="+(price=price+gst));
		         break;
		   case 2:
		         gst=price*10/100;
				 System.out.println("THE GST IS:"+gst);
				 System.out.println("THE PRICE IS:"+price);
				 System.out.println("TOTAL PRICE="+(price=price+gst));
		         break;
		   case 3:
		         gst=price*15/100;
				 System.out.println("THE GST IS:"+gst);
				 System.out.println("THE PRICE IS:"+price);
				 System.out.println("TOTAL PRICE="+(price=price+gst));
		         break;
		   default:
		          System.out.println("Invalid");   
	   }
   }
}

	   
	   
	   
