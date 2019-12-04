import java.util.Scanner;
class Demop213
{
public static void main (String [] args)
 { 
	
	for(int i=10;i<=99;i++)
	{
			    int b= i/2;
			double flag=0;
		for(int j=2;j<=b;j++)
		{
		   if(i%j==0)
		   {
		     flag=1;
		   }	
		}
		if(flag==0)
		   {
		     System.out.println(i);
		   }
	}
		   
 }	
}