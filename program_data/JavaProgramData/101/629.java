package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int A = 0; //??????A,B,C,????????????????0?
		int B = 0;
		int C = 0;
		char[] rank = {0, '\0', '\0'}; //??????rank????????
		for (A = 0;A < 3;A++) //?????????????????
		{
			for (B = 0;B < 3;B++)
			{
				if (B == A)
				{
					continue;
				}
				C = 3 - A - B;
				if (((B < A) + (C == A) == A) && ((A < B) + (A < C) == B) && ((C < B) + (B < A) == C)) //??????????
				{
					rank[A] = 'A';
					rank[B] = 'B';
					rank[C] = 'C'; //?????
					System.out.print(rank[2]);
					System.out.print(rank[1]);
					System.out.print(rank[0]);
					System.out.print("\n");
				}
			}
		}
		return 0;
	}

}
