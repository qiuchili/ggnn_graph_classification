package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n; //????n,i,sum,k,??sum?????0
	int i;
	int sum = 0;
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	for (i = 1;i <= n;i++)
	{
	//???????k????????7????k==0,??7???
	 ;
	if (((i % 7 == 0) + (69 < i && i < 80) + (i - (i / 10) * 10 == 7)) == 0)
	{
	sum = sum + i * i; //??7??????????
	}
	}
	System.out.print(sum);
	System.out.print("\n");
	return 0;
	}
}

