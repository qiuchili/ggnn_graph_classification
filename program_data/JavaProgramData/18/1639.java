package <missing>;

public class GlobalMembers
{
	/*
	 * ???2.cpp
	 * Created on: 2012-11-13
	 * Author: ???
	 * ??:?????????
	 */
	public static int[][] a = new int[100][100]; //??????
	public static int sum; //??????
	public static int f(int n) //????
	{
		if (n == 1)
		{
			return 0; //?n?1???0
		}
		  int i; //????
		  int j;
		  int min = 0;
		  int sum = 0;
		  for (i = 0;i < n;i++) //?????
		  {
			  min = a[i][0]; //?????????
			  for (j = 0;j < n;j++) //?????
			  {
				if (a[i][j] < min)
				{
					min = a[i][j]; //???????
				}
			  }
			  for (j = 0;j < n;j++) //?????
			  {
				  a[i][j] = a[i][j] - min; //?????????
			  }
		  }
		  for (i = 0;i < n;i++) //?????
		  {
				  min = a[0][i]; //???????
					for (j = 0;j < n;j++) //?????
					{
					  if (a[j][i] < min)
					  {
						  min = a[j][i]; //?????
					  }
					}
					for (j = 0;j < n;j++) //?????
					{
						a[j][i] = a[j][i] - min; //????????
					}
		  }
		  sum = sum + a[1][1]; //????????????
		   for (i = 0;i < n;i++) //?????
		   {
				   for (j = 2;j < n;j++) //?????
				   {
					   a[i][j - 1] = a[i][j]; //????????
				   }
		   }
		   for (i = 2;i < n;i++) //?????
		   {
			   for (j = 0;j < n - 1;j++) //?????
			   {
				a[i - 1][j] = a[i][j]; //??????
			   }
		   }
		   return sum + f(n - 1); //???????
	}
	public static int Main()
	{
		int i; //????
		int n;
		int j;
		int k;
		int x;
		int sum;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++) //????
		{
			x = 0; //?X?0
			sum = 0; //?sum???0
			for (j = 0;j < n;j++) //?????
			{
				for (k = 0;k < n;k++) //?? ???
				{
					a[j][k] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
			}
					 x = f(n); //?????
				 System.out.print(x);
				 System.out.print("\n");
		}
	return 0; //????
	}
}

