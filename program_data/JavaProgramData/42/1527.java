package <missing>;

public class GlobalMembers
{
	/*
	 * 0a.cpp
	 *function:???????????????????????????????????
	 ?????????????????????????????
	 *  Created on: 2012-11-8
	 *      Author: sear
	 */
	public static int Main()
	{
		int n; /*n???????,k??????,
		int k;
		int[] a = new int[100005];
		int i;
		int j;
		int m = 0;
		 a[100005]????????,i,j?????,m?k???*/
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < n; i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < n; i++)
		{
			if (a[i] == k)
			{
				m = m + 1;
			}
		} //????k???
		for (i = 0; i < n - m; i++)
		{
			//????????k????????
			if (a[i] == k)
			{ //??a[i]??k
				for (j = i + 1; j < n; j++)
				{ //?a[i]?????k??
					if (a[j] != k)
					{ //a[j]???k
						a[i] = a[j]; //a[j]????a[i]
						i = i + 1; //i??1?a[i]??????????????
					}
				}
				break; //???????????????????
			}
		}
		for (i = 0; i < n - m - 1; i++)
		{
			System.out.print(a[i]);
			System.out.print(" ");
		}
		System.out.print(a[n - m - 1]);
		return 0; //????
	}

}

