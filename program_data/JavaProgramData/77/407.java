package <missing>;

public class GlobalMembers
{
	//********************************************************
	//?????????
	//??????
	//?????2010.12.31
	//????:???????????????????
	//********************************************************
	public static int Main()
	{
		String str = new String(new char[10000]); //?????????????
		char c1; //???????????????????
		char c2;
		int[] a = new int[10000]; //??????????????????
		int i; //??????ij?????
		int j;
		int l;
		str = ConsoleInput.readToWhiteSpace(true).charAt(0);
		l = str.length();
		for (i = 0; i < 10000; i++)
		{
			a[i] = 0;
		} //?????????0??????
		c1 = str.charAt(0); //???????????????????
		for (i = 0; i < l; i++)
		{
			if (str.charAt(i) != c1)
			{
				c2 = str.charAt(i);
				break;
			} //??????????
		}
		for (i = 0; i < l; i++)
		{
			if (str.charAt(i) == c2) //???????????
			{
				for (j = i - 1; j >= 0; j--)
				{
					if (str.charAt(j) == c1 && a[j] == 0) //????????????????????
					{
						System.out.print(j);
						System.out.print(" ");
						System.out.print(i);
						System.out.print("\n");
						a[j] = 1; //???????????1
						break;
					}
				}
			}
		}
		return 0;
	}
}

