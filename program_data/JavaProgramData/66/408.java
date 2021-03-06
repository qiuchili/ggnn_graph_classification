package <missing>;

public class GlobalMembers
{
	public static int isRunNian(int year)
	{
		int result;
		if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))
		{
			result = 1;
		}
		else
		{
			result = 0;
		}
		  return result;
	}
	public static int DiJiTian(int year, int month, int day)
	{
		int result = 0;
		int i;
		for (i = 1; i < month; i++)
		{
			if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12)
			{
				result += 31;
			}
			else if (i == 4 || i == 6 || i == 9 || i == 11)
			{
				result += 30;
			}
			else if (i == 2)
			{
				if (isRunNian(year) != 0)
				{
					result += 29;
				}
				else
				{
					result += 28;
				}
			}
		}
		result += day;
		return result;
	}
	public static int Main()
	{
		int year;
		int month;
		int day;
		int days;
		int weekday;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			year = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			month = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			day = Integer.parseInt(tempVar3);
		}
		days = (year - 1) * (365 % 7) + (year - 1) / 400 + (year - 1) / 4 - (year - 1) / 100;
		days += DiJiTian(year, month, day);
		weekday = days % 7;
		switch (weekday)
		{
					   case 0:
							 System.out.print("Sun.");
							 break;
					   case 1:
							 System.out.print("Mon.");
							 break;
					   case 2:
							 System.out.print("Tue.");
							 break;
					   case 3:
							 System.out.print("Wed.");
							 break;
					   case 4:
							 System.out.print("Thu.");
							 break;
					   case 5:
							 System.out.print("Fri.");
							 break;
					   case 6:
							 System.out.print("Sat.");
							 break;
		}
		return 0;
	}

}

