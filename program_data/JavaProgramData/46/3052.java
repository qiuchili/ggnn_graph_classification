package <missing>;

public class GlobalMembers
{
	///********************************
	//*???????????   **
	//*?????? 1300012745 **
	//*???2013.11.1  **
	//********************************
	public static int Main()
	{
		int[][] a = new int[100][100]; // r,c????????????????
		int row;
		int col;
		int i;
		int j;
		int r;
		int c;
		row = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		col = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i <= row - 1; i++) //??????????????
		{
			for (j = 0; j <= col - 1; j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		r = 0;
		c = -1; //??????????????????????????????????
		while ((row >= 2) && (col >= 2)) //?????????2??????????????????????????????????
		{
			for (i = 1; i <= col; i++) //????col?????????
			{
				c++;
				System.out.print(a[r][c]);
				System.out.print("\n");
			}
			for (i = 1; i <= row - 1; i++) //??row-1????????
			{
				r++;
				System.out.print(a[r][c]);
				System.out.print("\n");
			}
			for (i = 1; i <= col - 1; i++) //???col-1
			{
				c--;
				System.out.print(a[r][c]);
				System.out.print("\n");
			}
			for (i = 1; i <= row - 2; i++) //??row-2?????????????????
			{
				r--;
				System.out.print(a[r][c]);
				System.out.print("\n");
			}
			col -= 2; //???????????????2??2?
			row -= 2;
		}
		if ((row == 1) && (col != 1)) //?????????????????????????????????????????????????????
		{
			for (i = 1; i <= col; i++) //?????????
			{
				c++;
				System.out.print(a[r][c]);
				System.out.print("\n");
			}
		}
		if ((col == 1) && (row != 1)) //???????
		{
			c++;
			for (i = 1; i <= row; i++)
			{
				System.out.print(a[r][c]);
				System.out.print("\n");
				r++;
			}
		}
		if ((row == 1) && (col == 1)) //??????????????row?col???????
		{
			System.out.print(a[r][c + 1]);
		}
		System.in.read();
		System.in.read();
		return 0;
	}








}

