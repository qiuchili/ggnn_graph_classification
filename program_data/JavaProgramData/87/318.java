package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int a;
	int b;
	int c;
	int d;
	int e;
	int f;
	int a1;
	int a2;
	int a3;
	int a4;
	int a5;
	int a6;
	int x = 0;
	while (true)
	{
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		a = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead(" ");
	if (tempVar2 != null)
	{
		b = Integer.parseInt(tempVar2);
	}
	String tempVar3 = ConsoleInput.scanfRead(" ");
	if (tempVar3 != null)
	{
		c = Integer.parseInt(tempVar3);
	}
	String tempVar4 = ConsoleInput.scanfRead(" ");
	if (tempVar4 != null)
	{
		d = Integer.parseInt(tempVar4);
	}
	String tempVar5 = ConsoleInput.scanfRead(" ");
	if (tempVar5 != null)
	{
		e = Integer.parseInt(tempVar5);
	}
	String tempVar6 = ConsoleInput.scanfRead(" ");
	if (tempVar6 != null)
	{
		f = Integer.parseInt(tempVar6);
	}
	if (a == 0)
	{
		break;
	}
	if (f >= c)
	{
		x = x + f - c;
	}
	else
	{
	x = x + 60 + f - c;
	e--;
	}
	if (e >= b)
	{
		x = x + (e - b) * 60;
	}
	else
	{
	x = x + (60 + e - b) * 60;
	d--;
	}
	x = x + (d - a + 12) * 3600;
	System.out.printf("%d\n",x);
	x = 0;
	}
	return 0;
	}

}

