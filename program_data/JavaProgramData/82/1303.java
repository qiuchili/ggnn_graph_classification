package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int s;
		int max;
		int[] a = new int[100];
		int[] b = new int[100];
		int[] c = new int[100];

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		max = 0;
		s = 0;
		c[0] = 0;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				(a[i]) = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				(b[i]) = Integer.parseInt(tempVar3);
			}
			if (a[i] >= 90 && a[i] <= 140 && b[i] >= 60 && b[i] <= 90)
			{
				c[s]++;
			}
			else
			{
				if (c[s] > max)
				{
					max = c[s];
				}
				s++;
				c[s] = 0;
			}
			if (c[s] > max)
			{
					max = c[s];
			}
		}
		System.out.printf("%d\n",max);
		return 0;
	}
}

