package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int i;
		int j;
		int[][] a = new int[100][100];
		int b;
		int c;
		int d;
		int e;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < m + 2;i++)
		{
			a[i][0] = 0;
			a[i][n + 1] = 0;

		}
		for (j = 0;j < n + 2;j++)
		{
			a[0][j] = 0;
			a[m + 1][j] = 0;
		}
		for (i = 1;i < m + 1;i++)
		{
			for (j = 1;j < n + 1;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}


		for (i = 1;i < m + 1;i++)
		{
			for (j = 1;j < n + 1;j++)
			{
				b = a[i + 1][j] - a[i][j];
				c = a[i - 1][j] - a[i][j];
				d = a[i][j + 1] - a[i][j];
				e = a[i][j - 1] - a[i][j];
				if (b <= 0 && c <= 0 && d <= 0 && e <= 0)
				{
					System.out.printf("%d %d\n",i - 1,j - 1);
				}
			}
		}
		return 0;
	}
}

