package <missing>;

public class GlobalMembers
{
	/* ????main.cpp
	 * ??????
	 * ?????2012-10-29
	 * ?????????????????????????????????????? 
	 * ????????????????????????????? 
	 */

	public static int Main()
	{
		int n; //????n,k???a?????i?j
		int[] a = new int[100000];
		int k;
		int i;
		int j;
		j = 0; //???j?0
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < n; i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < n; i++)
		{
			if (a[i] != k) //?a[i]???k????????????a????a?????
			{
				a[j] = a[i];
				j = j + 1;
			}
		}
		System.out.print(a[0]);
		if (j > 1)
		{
			for (i = 1; i <= j - 1; i++)
			{
				System.out.print(" ");
				System.out.print(a[i]);
			}
		}
		System.out.print("\n");
		return 0;
	}

}

