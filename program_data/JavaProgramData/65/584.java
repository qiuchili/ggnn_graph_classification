package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int A = 0;
		int B = 0;
		int[] a = new int[200];
		int[] b = new int[200];
		int i;
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
			if (a[i] == b[i])
			{
				A += 0;
				B += 0;
			}
			else if ((a[i] == 0 && b[i] == 1) || (a[i] == 1 && b[i] == 2) || (a[i] == 2 && b[i] == 0))
			{
				A += 1;
			}
			else if ((a[i] == 0 && b[i] == 2) || (a[i] == 1 && b[i] == 0) || (a[i] == 2 && b[i] == 1))
			{
				B += 1;
			}
		}

		if (A > B)
		{
			System.out.print("A");
		}
		else if (A < B)
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

