package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[100][100];
		int[][] b = new int[100][100];
		int[][] c = new int[100][100];
		int i;
		int j;
		int k;
		int n;
		int m;
		int p;
		int q;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < m;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			p = Integer.parseInt(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead(" ");
		if (tempVar5 != null)
		{
			q = Integer.parseInt(tempVar5);
		}
		for (i = 0;i < p;i++)
		{
			for (j = 0;j < q;j++)
			{
				String tempVar6 = ConsoleInput.scanfRead();
				if (tempVar6 != null)
				{
					b[i][j] = Integer.parseInt(tempVar6);
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < q;j++)
			{
				for (k = 0;k < m;k++)
				{
					c[i][j] += a[i][k] * b[k][j];
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < q;j++)
			{
				if (j == 0)
				{
				System.out.printf("%d",c[i][j]);
				}
				else
				{
				System.out.printf(" %d",c[i][j]);
				}
			}
			System.out.print("\n");
		}
	}
}

