package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] k = new int[1000];
		int n;
		int i;
		for (n = 0;n <= 1000;n++)
		{
			int a = 0;
			int b = 0;
			int c = 0;
			int d = 0;
			int e = 0;
			int f = 0;
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				b = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				c = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				d = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead();
			if (tempVar5 != null)
			{
				e = Integer.parseInt(tempVar5);
			}
			String tempVar6 = ConsoleInput.scanfRead();
			if (tempVar6 != null)
			{
				f = Integer.parseInt(tempVar6);
			}
			if (a != 0 || b != 0 || c != 0 || d != 0 || e != 0 || f != 0)
			{
				k[n] = 3600 * (d - a + 11) + 3600 - 60 * b - c + 60 * e + f;
			}
			else
			{
				break;
			}
		}
		for (i = 0;i < n;i++)
		{
			System.out.printf("%d\n",k[i]);
		}
		return 0;
	}
}

