package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int s;
		int a1 = 0;
		int b1 = 0;
		int a2 = 0;
		int b2 = 0;
		int[][] c = new int[1001][1001];

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					c[i][j] = Integer.parseInt(tempVar2);
				}
			}
		}

		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				if (c[i][j] == 0)
				{
					a1 = i;
					b1 = j;
					break;
				}
			}
			if (c[a1][b1] == 0)
			{
				break;
			}
		}

		for (i = n - 1;i >= 0;i--)
		{
			for (j = n - 1;j >= 0;j--)
			{
				if (c[i][j] == 0)
				{
					a2 = i;
					b2 = j;
					break;
				}
			}
			if (c[a2][b2] == 0)
			{
				break;
			}
		}

		s = (a2 - a1 - 1) * (b2 - b1 - 1);
		System.out.printf("%d",s);
		return 0;
	}

}

