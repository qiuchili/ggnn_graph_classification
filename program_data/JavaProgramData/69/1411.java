package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s1 = new String(new char[256]);
		String s2 = new String(new char[256]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s1 = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			s2 = tempVar2.charAt(0);
		}
		int l1 = s1.length();
		int l2 = s2.length();
		int a;
		int b;
		int[] c = new int[256];
		int l = 0;
		while (l1 > 0 || l2 > 0)
		{
			a = (l1 > 0)?(s1.charAt(l1 - 1) - '0'):0;
			b = (l2 > 0)?(s2.charAt(l2 - 1) - '0'):0;
			c[l] += a + b;
			c[l + 1] = c[l] / 10;
			c[l] %= 10;
			l1--;
			l2--;
			l++;
		}
		while (c[l] == 0 && l > 0)
		{
			l--;
		}
		int i;
		for (i = l;i >= 0;i--)
		{
			System.out.printf("%d",c[i]);
		}
		return 0;
	}
}

