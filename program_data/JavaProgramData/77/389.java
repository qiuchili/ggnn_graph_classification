package <missing>;

public class GlobalMembers
{
	//**********************************************
	//**???????******************************
	//**?????? 1000012741*********************
	//**???2010?12?31?************************
	//**********************************************
	//??search?????????????len???????t????????p?q?????????????
	public static void search(String str, int len, int t, char p, char q)
	{
		int i; //m??????????????????????????
		int j;
		int m = 0;
		if (str[len - 1].equals('0')) //??????????????
		{
			return;
		}
		for (j = t; j < len && m == 0; j++) //?t???????????????
		{
			if (str[j].equals(q))
			{
				for (i = j - 1; i >= 0 && m == 0; i--) //????????????????????
				{
					if (str[i].equals(p)) //??????????
					{
							str[i] = '0';
							str[j] = '0';
							System.out.print(i);
							System.out.print(" ");
							System.out.print(j);
							System.out.print("\n");
							m = 1; //?m????????????????????????
					}
				}
			}
		}
		search(str, len, j, p, q); //??????????
	}
	public static int Main()
	{
		String str = new String(new char[502]); //str????????p?????????q????????
		char p;
		char q;
		str = ConsoleInput.readToWhiteSpace(true).charAt(0);
		int len = str.length(); //???????
		p = str.charAt(0); //??????????????
		for (int i = 1; str.charAt(i) != '\0'; i++) //????????????q
		{
			if (str.charAt(i) != p)
			{
				q = str.charAt(i);
				break;
			}
		}
		search(str, len, 1, p, q); //??search??
		return 0;
	}
	//**********************************************

}

