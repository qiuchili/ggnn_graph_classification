package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int[] a = new int[100];
	int[] b = new int[100];
	int[] c = new int[100];
	int[] d = new int[100];
	int[] e = new int[100];
	int[] f = new int[100];
	int[] s = new int[100];
	int i;
	int p = 0;
	for (i = 0;i < 100;i++)
	{
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		a[i] = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		b[i] = Integer.parseInt(tempVar2);
	}
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		c[i] = Integer.parseInt(tempVar3);
	}
	String tempVar4 = ConsoleInput.scanfRead();
	if (tempVar4 != null)
	{
		d[i] = Integer.parseInt(tempVar4);
	}
	String tempVar5 = ConsoleInput.scanfRead();
	if (tempVar5 != null)
	{
		e[i] = Integer.parseInt(tempVar5);
	}
	String tempVar6 = ConsoleInput.scanfRead();
	if (tempVar6 != null)
	{
		f[i] = Integer.parseInt(tempVar6);
	}
	System.out.print("\n");
	if (a[i] == 0 && b[i] == 0 && c[i] == 0 && d[i] == 0 && e[i] == 0 && f[i] == 0)
	{
	break;
	}
	p++;
	}
	for (i = 0;i < p;i++)
	{
	s[i] = (3600 * (d[i] + 12) + e[i] * 60 + f[i]) - (3600 * a[i] + 60 * b[i] + c[i]);
	System.out.printf("%d\n",s[i]);
	}
	return 0;
	}
}

