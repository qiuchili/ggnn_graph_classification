package <missing>;

public class GlobalMembers
{
	/*
	?? - 1017 ????   
	
	?? ????05  
	?? 
	?????????????????????GPA????????????????????????????????? 
	?????????? 
	???? ?? 
	90-100 4.0 
	85-89  3.7 
	82-84  3.3 
	78-81  3.0 
	75-77  2.7 
	72-74  2.3 
	68-71  2.0 
	64-67  1.5 
	60-63  1.0 
	60?? 0 
	1??????????=????*???? 
	2?????=????????/???????? 
	????????????A??????GPA?? 
	
	 
	???? 
	??? ?????n?n<10?? 
	??? ???????????????????? 
	??? ?????????? 
	?????????????? 
	 
	???? 
	??????????????????2?????printf("%.2f",GPA);? 
	*/

	public static int Main()
	{
		int n;
		int[] xuefen = new int[10];
		int[] defen = new int[10];
		int i = 0;
		float GPA = 0F;
		float gpa = 0F;
		float fen = 0F;
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
				xuefen[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				defen[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < n;i++)
		{
			fen += xuefen[i];
			if (defen[i] >= 90)
			{
				gpa += 4.0 * xuefen[i];
			}
			else if (defen[i] >= 85 && defen[i] <= 89)
			{
				gpa += 3.7 * xuefen[i];
			}
			else if (defen[i] >= 82 && defen[i] <= 84)
			{
				gpa += 3.3 * xuefen[i];
			}
			else if (defen[i] >= 78 && defen[i] <= 81)
			{
				gpa += 3.0 * xuefen[i];
			}
			else if (defen[i] >= 75 && defen[i] <= 77)
			{
				gpa += 2.7 * xuefen[i];
			}
			else if (defen[i] >= 72 && defen[i] <= 74)
			{
				gpa += 2.3 * xuefen[i];
			}
			else if (defen[i] >= 68 && defen[i] <= 71)
			{
				gpa += 2.0 * xuefen[i];
			}
			else if (defen[i] >= 64 && defen[i] <= 67)
			{
				gpa += 1.5 * xuefen[i];
			}
			else if (defen[i] >= 60 && defen[i] <= 63)
			{
				gpa += 1.0 * xuefen[i];
			}

		}
		GPA = gpa / fen;
		System.out.printf("%.2f",GPA);
	}

}

