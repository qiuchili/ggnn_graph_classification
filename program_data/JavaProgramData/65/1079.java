package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[200];
		int[] b = new int[200];
		int i;
		int k;
		int t;
		int p;
		k = 0;
		t = 0;
		p = 0;
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
				a[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b[i] = Integer.parseInt(tempVar3);
			}
			if ((a[i] == 0 && b[i] == 1) || (a[i] == 1 && b[i] == 2) || (a[i] == 2 && b[i] == 0))
			{
				k++;
			}
			else if (a[i] == b[i])
			{
				t++;
			}
			else
			{
				p++;
			}
		}
		if (k > p)
		{
			System.out.print("A");
		}
		else if (k == p)
		{
			System.out.print("Tie");
		}
		else
		{
			System.out.print("B");
		}
		return 0;
	}


}

