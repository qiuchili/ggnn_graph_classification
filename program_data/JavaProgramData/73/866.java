package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[5][5];
		int i;
		int j;
		int[] max = new int[5];
		int[] min = new int[5];
		int count = 0;
		for (i = 0;i < 5;i++)
		{
		for (j = 0;j < 5;j++)
		{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a[i][j] = Integer.parseInt(tempVar);
		}
		}
		}
		for (i = 0;i < 5;i++)
		{
			min[i] = a[0][i];
			 max[i] = a[i][0];
			 for (j = 0;j < 5;j++)
			 {
						 if (a[i][j] > max[i])
						 {
							 max[i] = a[i][j];
						 }
						 if (a[j][i] < min[i])
						 {
							 min[i] = a[j][i];
						 }
			 }
		}
		for (i = 0;i < 5;i++)
		{
		for (j = 0;j < 5;j++)
		{
			if (max[i] == min[j])
			{
				System.out.printf("%d %d %d",i + 1,j + 1,max[i]);
				count++;
			} //??????????????0??
		}
		}
		if (count == 0)
		{
		System.out.print("not found");
		}


	return 0;
	}
}

