package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int a;
		  int b;
		  int i;
		  int j;
		  int length;
		  int result = 0;
		  String c = new String(new char[100]);
		  int[] final = new int[100];
		  int temp;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  a = Integer.parseInt(tempVar);
		  }
		  String tempVar2 = ConsoleInput.scanfRead(" ");
		  if (tempVar2 != null)
		  {
			  c = tempVar2.charAt(0);
		  }
		  String tempVar3 = ConsoleInput.scanfRead(" ");
		  if (tempVar3 != null)
		  {
			  b = Integer.parseInt(tempVar3);
		  }
		  int[] decimal = new int[100];
		  length = c.length();
		  String finalString = new String(new char[1000]);
		  for (i = 0;i < length;i++)
		  {
					 if (c.charAt(i) >= 'A' && c.charAt(i) <= 'Z')
					 {
						  decimal[i] = c.charAt(i) - 'A' + 10;
					 }
					 else if (c.charAt(i) >= 'a' && c.charAt(i) <= 'z')
					 {
						  decimal[i] = c.charAt(i) - 'a' + 10;
					 }
					else if (c.charAt(i) >= '0' && c.charAt(i) <= '9')
					{
						  decimal[i] = c.charAt(i) - '0';
					}
		  }
		  for (i = 0;i < length;i++)
		  {
				result = result + decimal[length - i - 1] * (int)(Math.pow((double)a,i));
		  }
		  if (result == 0)
		  {
			  System.out.print("0");
		  }
	else
	{
		  for (i = 0;result != 0;i++)
		  {
			   final[i] = result % b;
			   result = result / b;
		  }
		  for (j = 0;j < i / 2;j++)
		  {
			  temp = final[j];
			  final[j] = final[i - j - 1];
			  final[i - j - 1] = temp;
		  }
		  for (j = 0;j < i;j++)
		  {
				if (final[j] < 10)
				{
					finalString = tangible.StringFunctions.changeCharacter(finalString, j, final[j] + '0');
				}
				else
				{
					finalString = tangible.StringFunctions.changeCharacter(finalString, j, final[j] + 'A' - 10);
				}
		  }
		  finalString = tangible.StringFunctions.changeCharacter(finalString, i, '\0');
		  System.out.println(finalString);


		 System.out.print("\n");
	}
	}



}

