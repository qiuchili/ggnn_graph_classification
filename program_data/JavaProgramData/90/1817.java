package <missing>;

public class GlobalMembers
{
	public static int f(int m,int n)
	{
		int a;
		if (n == 1)
		{
			a = 1;
		}
		else if (m < n)
		{
			a = f(m, n - 1);
		}
			else if (m > n)
			{
				a = f(m, n - 1) + f(m - n, n);
			}
				 else
				 {
					 a = 1 + f(m, n - 1);
				 }
		return (a);
	}

	public static int Main()
	{
		int f = new int(int m,int n);
		int i;
		int m;
		int n;
		int c;
		int t;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			t = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= t;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				n = Integer.parseInt(tempVar3);
			}
		c = f(m, n);
		System.out.printf("%d\n",c);
		}
	   return 0;
	}
}

