package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int t = 0;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	if (n % 3 == 0)
	{
	t = t + 3;
	}
	if (n % 5 == 0)
	{
	t = t + 5;
	}
	if (n % 7 == 0)
	{
	t = t + 7;
	}
	if (t == 0)
	{
	System.out.print("n");
	}
	if (t == 3)
	{
		System.out.print("3");
	}
	if (t == 5)
	{
		System.out.print("5");
	}
	if (t == 7)
	{
		System.out.print("7");
	}
	if (t == 8)
	{
		System.out.print("3 5");
	}
	if (t == 10)
	{
		System.out.print("3 7");
	}
	if (t == 12)
	{
		System.out.print("5 7");
	}
	if (t == 15)
	{
		System.out.print("3 5 7");
	}

	return 0;
	}
}

