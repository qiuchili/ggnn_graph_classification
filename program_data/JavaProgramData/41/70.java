package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int A;
		int B;
		int C;
		int D;
		int E;
		for (A = 1; A <= 5; A++)
		{
			for (B = 1; B <= 5; B++)
			{
			if (B != A)
			{
				for (C = 1; C <= 5; C++)
				{
			if (C != A && C != B)
			{
				for (D = 1; D <= 5; D++)
				{
			if (D != A && D != B && D != C)
			{
				for (E = 1; E <= 5; E++)
				{
			if (E != A && E != B && E != C && E != D && E != 2 && E != 3)
			{
				if ((A == 2 && E == 1) || (E != 1 && A != 1 && A != 2))
				{
					if (B != 1)
					{
						if ((A == 5 && (C == 1 || C == 2)) || ((A != 5) && (C != 1 && C != 2)))
						{
							if ((C != 1 && (D == 1 || D == 2)) || (C == 1 && (D != 1 && D != 2)))
							{
								if (((E != 1 && E != 2) && D != 1) || ((D == 1) && (E == 1 || E == 2)))
								{
								   System.out.print(A);
								   System.out.print(" ");
								   System.out.print(B);
								   System.out.print(" ");
								   System.out.print(C);
								   System.out.print(" ");
								   System.out.print(D);
								   System.out.print(" ");
								   System.out.print(E);
								}
							}
						}
					}
				}
			}
				}
			}
				}
			}
				}
			}
			}
		}
		return 0;
	}
}
