package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	int i;
	int k;
	double[] x = new double[100];
	double[] y = new double[100];
	double m = 0;
	 for (i = 0;i < n;i++)
	 {
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			x[i] = Double.parseDouble(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			y[i] = Double.parseDouble(tempVar3);
		}
	 }
		for (i = 0;i < n;i++)
		{
			for (k = i + 1;k < n;k++)
			{
			 if (m < Math.sqrt((x[i] - x[k]) * (x[i] - x[k]) + (y[i] - y[k]) * (y[i] - y[k])))
			 {
				 m = Math.sqrt((x[i] - x[k]) * (x[i] - x[k]) + (y[i] - y[k]) * (y[i] - y[k]));
			 }
			}
		}

	  System.out.printf("%.4lf\n",m);
	  return 0;
	}

}

