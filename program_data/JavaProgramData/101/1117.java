package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int c;
		int A;
		int B;
		int C;
		for (a = 1 ; a <= 3 ; a++)
		{
			for (b = 1 ; b <= 3 ; b++)

			{
				for (c = 1 ; c <= 3 ; c++)
				{
				   if (a == b || a == c || b == c)
				   {
					   continue;
				   }
				   A = (b > a) + (c == a);
				   B = (a > b) + (a > c);
				   C = (c > b) + (b > a);
				   if (A == (3 - a) && B == (3 - b) && C == (3 - c))

				   {
					   if (a == 1)
					   {
						  System.out.print("A");
					   }
					  if (b == 1)
					  {
						  System.out.print("B");
					  }
					  if (c == 1)
					  {
						  System.out.print("C");
					  }
					  if (a == 2)
					  {
						  System.out.print("A");
					  }
					  if (b == 2)
					  {
							  System.out.print("B");
					  }
					  if (c == 2)
					  {
							  System.out.print("C");
					  }
					  if (a == 3)
					  {
							  System.out.print("A");
					  }
					  if (b == 3)
					  {
							  System.out.print("B");
					  }
					  if (c == 3)
					  {
							  System.out.print("C");
					  }
				   }


				}


			}


		}

	return 0;
	}

}
