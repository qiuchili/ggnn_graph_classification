package <missing>;

public class GlobalMembers
{
//C++ TO JAVA CONVERTER TODO TASK: The implementation of the following method could not be found:
	//int Runnian(int year);
	public static int Main()
	{
		int year;
		int month;
		int day;
		int total = 0;
		int i;
		int k;
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
		for (i = 1;i < month;i++)
		{
			if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12)
			{
				total += 31;
			}
			else if (i == 4 || i == 6 || i == 9 || i == 11)
			{
				total += 30;
			}
			else if (i == 2)
			{
				if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))
				{
					total += 29;
				}
				else
				{
					total += 28;
				}
			}
		}
		if (year > 2000)
		{
			year %= 2000;
		}
		for (k = 1;k < year;k++)
		{
			if (k % 400 == 0 || (k % 4 == 0 && k % 100 != 0))
			{
				total += 2;
			}
				else
				{
				total += 1;
				}
		}
		total += day;
		if (total % 7 == 1)
		{
			System.out.print("Mon.");
		}
		else if (total % 7 == 2)
		{
			System.out.print("Tue.");
		}
		else if (total % 7 == 3)
		{
			System.out.print("Wed.");
		}
		else if (total % 7 == 4)
		{
			System.out.print("Thu.");
		}
		else if (total % 7 == 5)
		{
			System.out.print("Fri.");
		}
		else if (total % 7 == 6)
		{
			System.out.print("Sat.");
		}
		else if (total % 7 == 0)
		{
			System.out.print("Sun.");
		}
		return 0;
	}

}

