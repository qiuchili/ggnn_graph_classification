package <missing>;

public class GlobalMembers
{
	/*
	 * hw131029_1.cpp
	 *??
	???????N????500???????????????????????????
	????
	?2?
	?1?? N
	?2?? N ?????????????
	????
	????????????????????
	????
	10
	1 3 2 6 5 4 9 8 7 10
	????
	1,3,5,7,9
	 *
	 *  Created on: 2013?10?30?
	 *      Author: KyLin
	 */
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		final int n1 = n;
		int[] z = new int[n1];
		int t;
		int t1;
		for (t = 0;t < n1;++t)
		{
			z[t] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		int numofdel = 0; //numofdel?????????????
		for (t = 0;t < n;++t)
		{
			if (z[t] % 2 == 0)
			{
				for (t1 = t;t1 < n;++t1)
				{
					z[t1] = z[t1 + 1]; //????????????????
				}
				++numofdel;
				--n; //??????????--n --t
				--t;
			}
		}
		final int n2 = n1 - numofdel;
		int[] q = new int[n2]; //?????????????????
		int change;
		for (t = 0;t < n2;++t)
		{
			q[t] = z[t];
		}
		for (t = 0;t < n2;++t)
		{
			for (t1 = t;t1 < n2;++t1)
			{
				if (q[t] > q[t1]) //????
				{
					change = q[t];
					q[t] = q[t1];
					q[t1] = change;
				}
			}
		}
		for (t = 0;t < n2;++t)
		{
			if (t == 0)
			{
				System.out.print(q[t]);
			}
			else //????
			{
				System.out.print(",");
				System.out.print(q[t]);
			}
		}
		return 0;
	}



}

