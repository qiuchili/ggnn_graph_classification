package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int x1;
		  int x2;
		  int y1;
		  int y2;
		  int[][] a = new int[100][100];
		  int[][] b = new int[100][100];
		  int[][] c = new int[100][100];
		  int j;
		  int k;
		  int i;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  x1 = Integer.parseInt(tempVar);
		  }
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  y1 = Integer.parseInt(tempVar2);
		  }
		  for (i = 0;i < x1;i++)
		  {
						  for (k = 0;k < y1;k++)
						  {
										   String tempVar3 = ConsoleInput.scanfRead();
										   if (tempVar3 != null)
										   {
											   a[i][k] = Integer.parseInt(tempVar3);
										   }
						  }
		  }


		  String tempVar4 = ConsoleInput.scanfRead();
		  if (tempVar4 != null)
		  {
			  x2 = Integer.parseInt(tempVar4);
		  }
		  String tempVar5 = ConsoleInput.scanfRead();
		  if (tempVar5 != null)
		  {
			  y2 = Integer.parseInt(tempVar5);
		  }
		  for (i = 0;i < x2;i++)
		  {
						  for (k = 0;k < y2;k++)
						  {
										   String tempVar6 = ConsoleInput.scanfRead();
										   if (tempVar6 != null)
										   {
											   b[i][k] = Integer.parseInt(tempVar6);
										   }
						  }
		  }

		  for (i = 0;i < x1;i++)
		  {
						   for (k = 0;k < y2;k++)
						   {
										   for (j = 0;j < y1;j++)
										   {
										   c[i][k] = a[i][j] * b[j][k] + c[i][k];
										   }
										   if (k == 0)
										   {
										   System.out.printf("%d",c[i][k]);
										   }
										   else
										   {
										   System.out.printf(" %d",c[i][k]);
										   }
						   }
						   System.out.print("\n");
		  }
	}

}

