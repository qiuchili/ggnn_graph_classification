package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		String zs1 = new String(new char[260]);
		String zs2 = new String(new char[260]);
		int[] a1 = new int[260];
		int[] a2 = new int[260];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			zs1 = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			zs2 = tempVar2.charAt(0);
		}
		if (strcmp(zs1,zs2) == 0 && zs1.charAt(0) == '0')
		{
			System.out.print("0");
			return 0;
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(a1,0,(Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(a2,0,(Integer.SIZE / Byte.SIZE));
		int len1 = zs1.length();
		int j = 0;
		for (i = len1 - 1;i >= 0;i--)
		{
			a1[j] = zs1.charAt(i) - '0';
			j++;
		}
		int len2 = zs2.length();
		j = 0;
		for (i = len2 - 1;i >= 0;i--)
		{
			a2[j] = zs2.charAt(i) - '0';
			j++;
		}
		for (i = 0;i < 250;i++)
		{
			a1[i] += a2[i];
			if (a1[i] >= 10)
			{
				a1[i] -= 10;
				a1[i + 1]++;
			}
		}
		int q0 = 0;
		for (i = 251;i >= 0;i--)
		{
			if (q0 != 0)
			{
				System.out.printf("%d",a1[i]);
			}
			else if (a1[i])
			{
				System.out.printf("%d",a1[i]);
				q0 = 1;
			}
		}
		return 0;
	}

}

