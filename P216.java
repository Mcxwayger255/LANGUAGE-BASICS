import java.util.*;
class Demop216
{
public static void main (String [] args)
 { 
   
   double d= Double.parseDouble(args[0]);
   
   if(args.length==0)
   {
	   System.out.println("Please enter valid integer");
   }
    else
	{
		for(int i=1;i<=d;i++)
		{
			int j=1;
			while(j<=i)
			{
				System.out.println("*");
				j++;
			}
		}
	}
 }	
}
