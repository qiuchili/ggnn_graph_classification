package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] count = new int[26]; //???26?????????????????
		String s = new String(new char[100000]);
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		while (n > 0)
		{
			int i;
			for (i = 0; i < 26; i++) //??????????????count??
			{
				count[i] = 0;
			}

			s = new Scanner(System.in).nextLine();
			i = 0;
			while (s.charAt(i) != '\0') //?????????????????
			{
				count[s.charAt(i) - 'a']++; //??????????????????????
				i++;
			}

			int flag = 0;

			i = 0;
			while (s.charAt(i) != '\0')
			{
				if (count[s.charAt(i) - 'a'] == 1)
				{
					System.out.printf("%c\n", s.charAt(i));
					flag = 1; //??????????????
					break;
				}

				i++;
			}

			if (flag == 0) //???????????????????
			{
				System.out.print("no\n");
			}

			n--;
		}
		return 0;
	}




}

