package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int c;
		int d;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		d = Integer.parseInt(tempVar);
	}
	a = d % 3;
	b = d % 5;
	c = d % 7;
	if (a == 0)
	{
		if (b == 0)
		{
		if (c == 0)
		{
			 System.out.print("3 5 7");
		}
		  else
		  {
			  System.out.print("3 5");
		  }
		}
	   else
	   {
		   if (c == 0)
		   {
		  System.out.print("3 7");
		   }
	   else
	   {
		   System.out.print("3");
	   }
	   }
	}
	else
	{
		if (b == 0)
		{
		   if (c == 0)
		   {
			System.out.print("5 7");
		   }
		   else
		   {
			   System.out.print("5");
		   }
		}
	   else
	   {
		   if (c == 0)
		   {
			System.out.print("7");
		   }
		   else
		   {
			   System.out.print("n");
		   }
	   }
	}
	return 0;
	}
}

