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
	int k = 0;
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
	max[i] = a[i][0];
	}
	for (j = 0;j < 5;j++)
	{
	min[j] = a[0][j];
	}
	for (i = 0;i < 5;i++)
	{
	  for (j = 0;j < 5;j++)
	  {
				if (a[i][j] > max[i])
				{
					 max[i] = a[i][j];
				}
				if (a[i][j] < min[j])
				{
				min[j] = a[i][j];
				}
	  }
	}
	for (i = 0;i < 5;i++)
	{
	   for (j = 0;j < 5;j++)
	   {
				if (max[i] == min[j])
				{
				if (max[i] == a[i][j])
				{
				System.out.printf("%d %d %d",i + 1,j + 1,a[i][j]);
				 k++;
				}
				}
	   }
	}
	 if (k == 0)
	 {
			System.out.print("not found");
	 }
	 return 0;
	}




}

