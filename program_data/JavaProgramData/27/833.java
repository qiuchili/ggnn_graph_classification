package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		double a;
		double b;
		double c;
		double x1;
		double x2;
		double dert;
		double d;
		double e;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = Double.parseDouble(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				b = Double.parseDouble(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				c = Double.parseDouble(tempVar4);
			}
			dert = b * b - 4 * a * c;
			if (dert > 0)
			{
			   x1 = (-b + Math.sqrt(dert)) / (2 * a);
			   x2 = (-b - Math.sqrt(dert)) / (2 * a);
			   System.out.printf("x1=%.5f;x2=%.5f\n",x1,x2);
			}
			if (dert == 0)
			{
				x1 = (-b + Math.sqrt(dert)) / (2 * a);
				System.out.printf("x1=x2=%.5f\n",x1);
			}
			if (dert < 0)
			{
				dert = -dert;
				d = (-b) / (2 * a);
							   d = (d == -0)?(0):(d);
				e = Math.sqrt(dert) / (2 * a);
				e = (e >= 0)?(e):(-e);
				System.out.printf("x1=%.5f+%.5fi;x2=%.5f-%.5fi\n",d,e,d,e);
			}
		}
		return 0;
	}
}

