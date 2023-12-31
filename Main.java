public class Flowers
{
	public static void main(String[] args)
	{
	
		
		for(int i=1;i<50;i++)
		{
		   
		    if(i%3==0 && i%7==0 )
		    {
		        System.out.println("TULIPS");
		    }
		    else if(i%3==0)
		    {
		        System.out.println("ROSES");
		    }
		    else if(i%7==0)
		    {
		        System.out.println("VIOLETS");
		    }
		    else{
		        System.out.println(i); 
		    }
		}
	}
}

		
