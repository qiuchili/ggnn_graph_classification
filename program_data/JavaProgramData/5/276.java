package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int len1;
	int len2;
	int sum = 0;
	int i;
	int k = 0;
	float n;
	String a = new String(new char[1000]);
	String b = new String(new char[1000]);
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Float.parseFloat(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		a = tempVar2.charAt(0);
	}
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		b = tempVar3.charAt(0);
	}
	len1 = a.length();
	len2 = b.length();
	if (len1 != len2)
	{
	System.out.print("error");
	k = 1;
	}
	else
	{
	for (i = 0;i < len1;i++)
	{
	if ((a.charAt(i) != 'A' && a.charAt(i) != 'T' && a.charAt(i) != 'C' && a.charAt(i) != 'G') || (b.charAt(i) != 'A' && b.charAt(i) != 'T' && b.charAt(i) != 'C' && b.charAt(i) != 'G'))
	{
	System.out.print("error");
	k = 1;
	break;
	}

	else if (a.charAt(i) == b.charAt(i))
	{
	sum++;
	}
	}
	if (k == 0)
	{
	if (1.0 * sum / len1 > n)
	{
	System.out.print("yes");
	}
	else
	{
	System.out.print("no");
	}
	}
	}
	return 0;
	}
}

