package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int y;
		int m;
		int d;
		int sum = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			y = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			d = Integer.parseInt(tempVar3);
		}
		y = y % 2800;
		for (i = 1;i < y;i++)
		{
			if (i % 4 == 0 && i % 100 != 0 || i % 400 == 0)
			{
				sum += 2;
			}
			else
			{
				sum += 1;
			}
		}

		for (i = 1;i < m;i++)
		{
			switch (i)
			{
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				sum += 3;
				break;
			case 2:
			if (y % 4 == 0 && y % 100 != 0 || y % 400 == 0)
			{
				   sum += 1;
			}
			else
			{
				sum += 0;
			}
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				sum += 2;
				break;
			}
		}
		sum += d;
		n = sum % 7;
		switch (n)
		{
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
		case 0:
			System.out.print("Sun.");
			break;
		}

		return 0;
	}

}

