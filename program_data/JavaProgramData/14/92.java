package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int k;
		int max;
		int m;
		int c;
		int[] a = new int[100000];
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct student
	//	{
	//		int num;
	//	int math;
	//	int b;
	//	}
	//	stu1;



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
				stu1.num = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				stu1.math = tempVar3;
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				stu1.b = tempVar4;
			}
			a[i] = stu1.math + stu1.b;
		}

		max = a[0];
		for (i = 1;i < n;i++)
		{
			if (a[i] > max)
			{
				max = a[i];
			k = i;
			}
		}
		System.out.printf("%d %d\n",k + 1,a[k]);
		a[k] = 0;
		max = a[0];
		for (i = 1;i < n;i++)
		{
			if (a[i] > max)
			{
				max = a[i];
			m = i;
			}
		}
		System.out.printf("%d %d\n",m + 1,a[m]);
		a[m] = 0;
		max = a[0];
		for (i = 1;i < n;i++)
		{
			if (a[i] > max)
			{
				max = a[i];
			c = i;
			}
		}
		System.out.printf("%d %d",c + 1,a[c]);
	}
}

