package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{

		double p;
		double a;
		double b;
		double c;
		double d;
		double s;
		double v;
		double x;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Double.parseDouble(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			b = Double.parseDouble(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			c = Double.parseDouble(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			d = Double.parseDouble(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead();
		if (tempVar5 != null)
		{
			x = Double.parseDouble(tempVar5);
		}
		x = x * 3.1415926 / 360;
		s = (a + b + c + d) / 2;
		p = Math.cos(x);
		v = Math.sqrt((s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * p * p);
		if (v >= 0)
		{
		System.out.printf("%6.4f\n", v);
		}
		else
		{
			System.out.print("Invalid input");
		}

	}
}

