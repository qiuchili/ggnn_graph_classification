package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int k;
		int j = 0;
		int[] a = new int[1000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			k = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i] = Integer.parseInt(tempVar3);
			}
		}
		for (j = 0;j < n;j++)
		{
			 for (i = j + 1;i < n;i++)
			 {
			if ((a[j] + a[i]) == k)
			{
				System.out.print("yes");
				j = n;
			}
			if (j == n)
			{
				break;
			}
			if (j == n - 2)
			{
				System.out.print("no");
			}
			 }
		}
		return 0;
	}

}

