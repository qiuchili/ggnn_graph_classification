package <missing>;

public class GlobalMembers
{
	/**
	 * ? ? ??????????????
	 * ?    ?????
	 * ????: 2010?11?19?
	 * ???????t??????????????26?????????????????????????????????????no
	*/
	public static int Main()
	{
		int t; //????t????????????len????????
		int i;
		int len;
		int[] count = new int[26]; //??????????26????????
		String a = new String(new char[100000]); //??????
		t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (t-- != 0)
		{
			i = 0;
			a = ConsoleInput.readToWhiteSpace(true).charAt(0);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(count,0,(Integer.SIZE / Byte.SIZE)); //???count?????0
			len = a.length(); //????????
			for (i = 0; i < len; i++)
			{
				count[a.charAt(i) - 'a']++; //???????????
			}
			for (i = 0; i < len; i++)
			{
				if (count[a.charAt(i) - 'a'] == 1) //??????????????????
				{
					System.out.print(a.charAt(i));
					break;
				}
			}
				if (i == len) //?????????????????no
				{
					System.out.print("no");
				}
				if (t >= 0)
				{
					System.out.print("\n");
				}
		}
		return 0;
	}

}

