package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int n;
	  int i;
	  int j;
	  int a;
	  int b;
	  int x;

	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  for (i = 1;i <= n;i++)
	  {
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  a = Integer.parseInt(tempVar2);
		  }
		  String tempVar3 = ConsoleInput.scanfRead(" ");
		  if (tempVar3 != null)
		  {
			  b = Integer.parseInt(tempVar3);
		  }
		  x = apple(a, b);
		  System.out.printf("%d\n",x);
	  }
	  return 0;
	}

	public static int apple(int a,int b)
	{
		int plan;
		int x;
		if (a == 0 || b == 1)
		{
		   plan = 1;
		}
		else
		{
			if (a >= b)
			{
				x = apple(a - b, b);
			}
			else
			{
				x = 0;
			}
			plan = apple(a, b - 1) + x;
		}
		return plan;
	}

}

