package <missing>;

public class GlobalMembers
{
	public static int[] a = {1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}; //???????????2?????????????2???
									//??????????a[2]?a[3]?????????
									//??a[2]?????a???????4??????????????????????????????
									//???????????????????????????????????????wrong answer?
									//???????????????????????????????????????????????
									//????????????�???a(1 <= a <= 20)�???????int a[20]={1,1};
	public static int n;
	public static int i;
	public static int k;
	public static int j;
	public static int Main()
	{
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++) //???
		{
			k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

			if (k > 2)
			{

			for (j = 2;j <= k - 1;j++)
			{
				a[j] = a[j - 1] + a[j - 2]; //????
			}

			}
		System.out.print(a[k - 1]);
		System.out.print("\n");
		}
	return 0;
	}

}

