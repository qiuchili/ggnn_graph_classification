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
		if (n == 1)
		{
			System.out.print("End");
		}
		else
		{
			do
			{
			if (n % 2 == 0)
			{
				System.out.printf("%d/2", n);
				n = n / 2;
				System.out.printf("=%d\n", n);
			}
			else
			{
				System.out.printf("%d*3+1", n);
				n = n * 3 + 1;
				System.out.printf("=%d\n", n);
			}
			}while (n != 1);
			System.out.print("End");
		}

		return 0;
	}
}

