package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int money;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			money = Integer.parseInt(tempVar);
		}
		int m1 = 0;
		int m2 = 0;
		int m3 = 0;
		int m4 = 0;
		int m5 = 0;
		int m6 = 0;
		m1 = money / 100;
		if (money % 100 != 0)
		{
			m2 = (money % 100) / 50;
		}
		if (money % 100 % 50 != 0)
		{
		m3 = money % 100 % 50 / 20;
		}
		if (money % 100 % 50 % 20 != 0)
		{
			m4 = money % 100 % 50 % 20 / 10;
		}
		if (money % 100 % 50 % 20 % 10 != 0)
		{
			m5 = money % 100 % 50 % 20 % 10 / 5;
		}
		if (money % 100 % 50 % 20 % 10 % 5 != 0)
		{
			m6 = money % 100 % 50 % 20 % 10 % 5;
		}
		System.out.printf("%d\n", m1);
		System.out.printf("%d\n", m2);
		System.out.printf("%d\n", m3);
		System.out.printf("%d\n", m4);
		System.out.printf("%d\n", m5);
		System.out.printf("%d\n", m6);
		return 0;
	}
}

