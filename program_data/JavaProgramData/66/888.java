package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int year;
		int month;
		int day;
		int sumday = 0;
		int xingqiji;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			year = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			month = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			day = Integer.parseInt(tempVar3);
		}
		sumday = (year - 1) * (365 % 7) + (year - 1) / 4 - (year - 1) / 100 + (year - 1) / 400;
		for (i = 1;i < month;i++)
		{
			if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10)
			{
				sumday += 3;
			}
			else if (i == 4 || i == 6 || i == 9 || i == 11)
			{
				sumday += 2;
			}
			else if (i == 2)
			{
				if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
				{
					sumday += 1;
				}
				else
				{
					sumday += 0;
				}
			}
		}
		sumday += day;
		xingqiji = sumday % 7;
		if (xingqiji == 0)
		{
			System.out.print("Sun.");
		}
		else if (xingqiji == 1)
		{
			System.out.print("Mon.");
		}
		else if (xingqiji == 2)
		{
			System.out.print("Tue.");
		}
		else if (xingqiji == 3)
		{
			System.out.print("Wed.");
		}
		else if (xingqiji == 4)
		{
			System.out.print("Thu.");
		}
		else if (xingqiji == 5)
		{
			System.out.print("Fri.");
		}
		else
		{
			System.out.print("Sat.");
		}
		return 0;
	}
}

