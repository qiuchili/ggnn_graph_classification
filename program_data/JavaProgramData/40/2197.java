package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double a;
		double b;
		double c;
		double d;
		double e;
		double s;
		double l;
		double k;
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
		 e = Double.parseDouble(tempVar5);
	 }

	s = (a + b + c + d) / 2;
	k = e / 180 * 3.1415926;
	if ((s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * Math.cos(k / 2) * Math.cos(k / 2) < 0.getValue() != 0)
	{
	System.out.print("Invalid input");
	}
	if ((s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * Math.cos(k / 2) * Math.cos(k / 2) > 0.getValue() != 0)
	{
		l = Math.sqrt((s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * Math.cos(k / 2) * Math.cos(k / 2));
	System.out.printf("%.4lf",l);
	}
	return 0;
	}
}

