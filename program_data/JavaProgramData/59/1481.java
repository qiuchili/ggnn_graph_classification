package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] a = new char[100][100];
		int i;
		int j;
		int k;
		int l;
		int n;
		int n2;
		int m;
		int num = 0;

		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n2 = n * n;
		for (i = 0; i < n; i++)
		{
			for (j = 0; j < n; j++)
			{
				a[i][j] = ConsoleInput.readToWhiteSpace(true).charAt(0);
				if (a[i][j] == '@')
				{
					num++;
				}
			}
		}
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (k = 1; k < m; k++)
		{
			 if (num >= n2)
			 {
				 break;
			 }
			 for (i = 0; i < n; i++)
			 {
				 for (j = 0; j < n; j++)
				 {
					 if (a[i][j] == '@')
					 {
						 if (i > 0 && a[i - 1][j] == '.')
						 {
							 a[i - 1][j] = '*';
							 num++;
						 }
						 if (j > 0 && a[i][j - 1] == '.')
						 {
							 a[i][j - 1] = '*';
							 num++;
						 }
						 if (i < n - 1 && a[i + 1][j] == '.')
						 {
							 a[i + 1][j] = '*';
							 num++;
						 }
						 if (j < n - 1 && a[i][j + 1] == '.')
						 {
							 a[i][j + 1] = '*';
							 num++;
						 }
					 }
				 }
			 }
			 for (i = 0; i < n; i++)
			 {
				 for (j = 0; j < n; j++)
				 {
					 if (a[i][j] == '*')
					 {
						 a[i][j] = '@';
					 }
				 }
			 }

		}

		System.out.print(num);
		System.out.print("\n");
			return 0;
	}
}

