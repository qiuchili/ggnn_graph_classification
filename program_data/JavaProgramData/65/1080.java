package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[200];
		int n;
		int i;
		int[] b = new int[200];
		int s = 0;
		int t = 0;
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
		}
		for (i = 0;i < n;i++)
		{
			if (a[i] == 0)
			{
				if (b[i] == 1)
				{
					s++;
				}
				else if (b[i] == 2)
				{
					t++;
				}
			}
			else if (a[i] == 1)
			{
				if (b[i] == 2)
				{
					s++;
				}
				else if (b[i] == 0)
				{
					t++;
				}

			}
			else
			{
				if (b[i] == 0)
				{
					s++;
				}
				else if (b[i] == 1)
				{
					t++;
				}
			}
		}
		if (s > t)
		{
			System.out.print("A");
		}
		else if (s < t)
		{
			System.out.print("B");
		}
		else
		{
			System.out.print("Tie");
		}





		return 0;
	}

}

