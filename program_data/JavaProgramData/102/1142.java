package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j = 0;
		int k = 0;
		int x;
		int y;
		int[] q = new int[40];
		double[] c = new double[40];
		double[] d = new double[40];
		double[] e = new double[40];
		double z;
		String b = new String(new char[40]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				b = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				c[i] = Double.parseDouble(tempVar3);
			}
			if (strcmp(b,"male") == 0)
			{
				q[i] = 1;
			}
			else
			{
				q[i] = 0;
			}
		}
		for (i = 0;i < n;i++)
		{
			if (q[i] == 1)
			{
				d[j] = c[i];
				j++;
			}
			if (q[i] == 0)
			{
				e[k] = c[i];
				k++;
			}
		}
		for (i = 0;i < j;i++)
		{
			for (x = i + 1;x < j;x++)
			{
				if (d[x] < d[i])
				{
					z = d[i];
					d[i] = d[x];
					d[x] = z;
				}
			}
		}
		for (i = 0;i < k;i++)
		{
			for (x = i + 1;x < k;x++)
			{
				if (e[x] > e[i])
				{
					z = e[i];
					e[i] = e[x];
					e[x] = z;
				}
			}
		}
		for (i = 0;i < j;i++)
		{
			System.out.printf("%.2lf ",d[i]);
		}
		for (i = 0;i < k - 1;i++)
		{
			System.out.printf("%.2lf ",e[i]);
		}
		System.out.printf("%.2lf",e[k - 1]);


		return 0;
	}

}

