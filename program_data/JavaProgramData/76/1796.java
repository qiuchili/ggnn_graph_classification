package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int[] a = new int[50000];
	int[] b = new int[50000];
	int i;
	int k;
	int c;
	int d;
	int isTrue = 1;
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
	String tempVar3 = ConsoleInput.scanfRead(" ");
	if (tempVar3 != null)
	{
		b[i] = Integer.parseInt(tempVar3);
	}
	}
	for (k = 1;k <= n;k++)
	{
	for (i = 0;i < n - k;i++)
	{
	if (a[i] > a[i + 1])
	{
	c = a[i];
	d = b[i];
	a[i] = a[i + 1];
	b[i] = b[i + 1];
	a[i + 1] = c;
	b[i + 1] = d;
	}
	}
	}
	for (i = 0;i < n - 1;i++)
	{
	if (b[i] < a[i + 1])
	{
	isTrue = 0;
	break;
	}
	else
	{
	if (b[i + 1] < b[i])
	{
	b[i + 1] = b[i];
	isTrue++;
	}
	}
	}
	if (isTrue == 0)
	{
	System.out.print("no");
	}
	else
	{
	System.out.printf("%d %d",a[0],b[n - 1]);
	}
	return 0;
	}


}

