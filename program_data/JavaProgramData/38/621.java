package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		int i;
		int j;
		double[] n = new double[100];
		double[] s = new double[100];
		double[][] x = new double[100][1000];
		double[] aver = new double[100];
		double[] sum1 = new double[100];
		double[] sum2 = new double[100];
		for (i = 0;i < k;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n[i] = Double.parseDouble(tempVar2);
			}
			sum1[i] = 0;
			sum2[i] = 0;
			for (j = 0;j < n[i];j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					x[i][j] = Double.parseDouble(tempVar3);
				}
				sum1[i] += x[i][j];
			}
			aver[i] = sum1[i] / n[i];
			for (j = 0;j < n[i];j++)
			{
				sum2[i] += (x[i][j] - aver[i]) * (x[i][j] - aver[i]);
			}
			s[i] = Math.sqrt(sum2[i] / n[i]);
			System.out.printf("%.5f\n",s[i]);
		}
		return 0;
	}
}

