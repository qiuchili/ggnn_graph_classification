package <missing>;

public class GlobalMembers
{
	///********************************
	//*?????(11-5) ????   **
	//*?????? 1300012745 **
	//*???2013.11.2  **
	//********************************
	public static int Main()
	{
		int[][] a = new int[5][5]; //i,j??????max,min???????????????
		int[] b = {5, 0, 0, 0, 0};
		int[] c = {5, 0, 0, 0, 0};
		int i;
		int j;
		int max;
		int min;
		int jm = 0;
		int im = 0;
		int k = 0;
		for (i = 0; i <= 4; i++)
		{
			for (j = 0; j <= 4; j++) //????
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (i = 0; i <= 4; i++)
		{
			max = a[i][0]; //??????????????
			for (j = 0; j <= 4; j++)
			{
				if (a[i][j] >= max) //???????????????????????????jm?????????
				{
					max = a[i][j];
					jm = j;
				}
			}
			b[i] = jm; //b[i]????????????????????jm?
		}
		for (j = 0; j <= 4; j++)
		{
			min = a[0][j]; //?????????????????
			for (i = 0; i <= 4; i++)
			{
				if (a[i][j] <= min) //???????????????????????????jm?????????
				{
					min = a[i][j];
					im = i;
				}
			}
			c[j] = im; //c[j]????????????????????im?
		}
		for (i = 0; i <= 4; i++)
		{
			if (c[b[i]] == i) //?????????????????????????????????c[b[i]]==i
			{
				System.out.print(i + 1);
				System.out.print(" ");
				System.out.print(b[i] + 1);
				System.out.print(" ");
				System.out.print(a[i][b[i]]);
				k++;
			}
		}
		if (k == 0) //??k??0????????????
		{
			System.out.print("not found");
		}
		return 0;
	}







}

