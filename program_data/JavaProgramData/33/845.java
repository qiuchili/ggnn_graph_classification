package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		char[][] s = new char[999][256];
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
				s[i] = tempVar2.charAt(0);
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;s[i][j];j++)
			{
				if (s[i][j] == 'A')
				{
					s[i][j] = 'T';
				}
				else if (s[i][j] == 'T')
				{
					s[i][j] = 'A';
				}
				else if (s[i][j] == 'C')
				{
					s[i][j] = 'G';
				}
				else if (s[i][j] == 'G')
				{
					s[i][j] = 'C';
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			System.out.println(s[i]);
		}
		return 0;
	}


}

