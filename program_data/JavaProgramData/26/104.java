package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[100]); //???????100?????
		int n; //??????n,i ?????a[100]
		int i;
		int[] a = new int[100];
		cin.get(str,100); //?????
		n = str.length(); //?????
		for (i = 1;i < n;i++)
		{
			if (str.charAt(i) == ' ' && str.charAt(i - 1) == ' ')
			{
				a[i] = 1; //???? ????????  ????????????1
			}
		}
		for (i = 0;i < n;i++)
		{
			if (a[i] == 0)
			{
				System.out.print(str.charAt(i));
			}
		} //???????0???
		return 0; //??0
	}
}
