package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		char[] s = {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
		while (scanf("%s",s) != EOF)
		{
			int i;
			int j;
			int l;
			int t1;
			int t2;
			System.out.printf("%s\n",s);
			l = s.length();
			for (i = 0;i < l;i++)
			{
				if (s[i] == '(')
				{
					t1 = 1;
					t2 = 0;
					for (j = i + 1;j < l;j++)
					{
						if (s[j] == '(')
						{
							t1++;
						}
						if (s[j] == ')')
						{
							t2++;
						}
						if (t1 == t2)
						{
							s[i] = s[j] = ' ';
							break;
						}
					}
				}
			}

			for (i = 0;i < l;i++)
			{
				if (s[i] == '(')
				{
					s[i] = '$';
				}
				else if (s[i] == ')')
				{
					s[i] = '?';
				}
				else
				{
					s[i] = ' ';
				}
			}

				System.out.printf("%s\n",s);
		}

	}
}
