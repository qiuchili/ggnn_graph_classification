package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double a;
		double b;
		double c;
		double w;
		double x1;
		double x2;
		int n;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{

			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = Double.parseDouble(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b = Double.parseDouble(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				c = Double.parseDouble(tempVar4);
			}
			w = b * b - 4 * a * c;
			if (w > 0)
			{
				w = Math.sqrt(w);
				x1 = (0 - b + w) / (2 * a);
				x2 = (0 - b - w) / (2 * a);
				System.out.printf("x1=%.5f;x2=%.5f\n",x1,x2);
			}
			else if (w < 0)
			{
				w = Math.sqrt(0 - w) / (2 * a);
				System.out.printf("x1=%.5f+%.5fi;x2=%.5f-%.5fi\n",(-b) / (2 * a),w,(-b) / (2 * a),w);
			}
			else if (w == 0)
			{
				x1 = x2 = (0 - b) / (2 * a);
				System.out.printf("x1=x2=%.5f\n",x1);
			}
		}


		return 0;
	}

}

