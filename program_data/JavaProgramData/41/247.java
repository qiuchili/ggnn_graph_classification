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
		int senA;
		int senB;
		int senC;
		int senD;
		int senE;


		for (A = 1;A <= 5;A++)
		{
			for (B = 1;B <= 5;B++)
			{

		   if (B == A)
		   {
			   continue;
		   }
			for (C = 1;C <= 5;C++)
			{
			   if (C == B || C == A)
			   {
				   continue;
			   }
			   for (D = 1;D <= 5;D++)
			   {
					if (D == A || D == B || D == C)
					{
						continue;
					}
					for (E = 1;E <= 5;E++)
					{
						 {
							 if (E == A || E == B || E == C || E == D || E == 2 || E == 3)
							 {
								 continue;
							 }
							senA = (E == 1);
							senB = (B == 2);
							senC = (A == 5);
							senD = (C != 1);
							senE = (D == 1);

							if ((A * senA + B * senB + C * senC + D * senD + E * senE) == 3 && (A + B + C + D + E + senA + senB + senC + senD + senE) == 17)
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
								System.out.print("\n");
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
