package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int n;
		  int i;
		  double a;
		  double b;
		  double c;
		  double d;
		  double e;
		  double f;
		  double x1;
		  double x2;
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
			 d = b * b - 4 * a * c;
			 if (d > 0)
			 {
					 x1 = (0 - b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
					 x2 = (0 - b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);
					 System.out.printf("x1=%.5lf;x2=%.5lf\n",x1,x2);
			 }
			 if (d == 0)
			 {
					 x1 = (0 - b) / (2 * a);
					 System.out.printf("x1=x2=%.5f\n",x1);
			 }
			 if (d < 0)
			 {
					e = (0 - b) / (2 * a);
					f = Math.sqrt(-d) / (2 * a);
					System.out.printf("x1=%.5f+%.5fi;x2=%.5f-%.5fi\n",e,f,e,f);
			 }
		  }
	}

}

