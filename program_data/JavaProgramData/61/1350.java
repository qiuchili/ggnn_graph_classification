package <missing>;

public class GlobalMembers
{
	/*
	 * Fibonacci.cpp
	 *
	 *  Created on: 2012-10-22
	 *  Author: ??
	 *  ????????????????: ?????????????1????????????2?????
	???????a???????????a??????
	 */


	public static int Main()
	{
		int n = 0; //???????????
		int a = 0;
		int b = 1;
		int x1 = 1;
		int x2 = 1;
		int x3 = 1;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0 ; i < n ; i++)
		{
			a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (a == 1 || a == 2)
			{
			System.out.print("1");
			System.out.print("\n");
			}
			else
			{
				for (int k = 1 ; k <= a - 2 ; k++)
				{
					x3 = x1 + x2;
					x1 = x2;
					x2 = x3; //??b??
				}
				b = x3; //?b??
				System.out.print(b);
				System.out.print("\n");
				x1 = 1, x2 = 1, x3 = 1; //????
			}
		}
		return 0; //??

	}

}

