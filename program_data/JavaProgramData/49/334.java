package <missing>;

public class GlobalMembers
{
	/* ?????????????????*/
	public static int huiwen(tangible.RefObject<String> a)
	{
		int i;
		int j;
		int len;
		len = a.argValue.length();
		/*?????2?????????*/ 
		for (i = len / 2 - 1, j = len / 2;i >= 0 && j < len;i--, j++)
		{
		   if (a.argValue.charAt(i) != a.argValue.charAt(j))
		   {
			   break;
		   }

		}
		 if (i < 0)
		 {
			 return 1;
		 }
		 else
		 {
			 return 0;
		 }

	}
	public static int Main()
	{
		String a = new String(new char[501]);
		String tmp = new String(new char[501]);
		int i;
		int j;
		int k;
		int len;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		len = a.length();
	   /*?????????1*/ 
		if (len <= 1)
		{
			return 0;
		}

		/*?????????????????????2?4?6?8????*/ 
		for (i = 2;i <= len;i += 2)
		{
		  /*??????????????????????????????i???????????????*/ 
		   for (j = 0;j + i <= len;j++)
		   {
			   /*??for?????????? ?i??????tmp??    */              
			  for (k = 0;k < i;k++)
			  {
				 tmp = tangible.StringFunctions.changeCharacter(tmp, k, a.charAt(k + j));
			  }
				  /* ?????????????*/
				 tmp = tangible.StringFunctions.changeCharacter(tmp, k, '\0');

				 /*??????????????????????*/
		  tangible.RefObject<String> tempRef_tmp = new tangible.RefObject<String>(tmp);
			  if (huiwen(tempRef_tmp) == 1)
			  {
				  tmp = tempRef_tmp.argValue;
				  System.out.printf("%s\n",tmp);
			  }
			  else
			  {
				  tmp = tempRef_tmp.argValue;
			  }


		   }

		}

		System.in.read();
		System.in.read();
		return 0;

	}

}

