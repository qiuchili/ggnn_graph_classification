import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str1 = new String(new char[80]); //??????????????????
		String str2 = new String(new char[80]);
		int i; //i?j?????
		int j;
		int length;
		/*??str1??????????
		???????????????????????????????
		?????????????????????????????\0?ASCII???????????????*/
		str1 = new Scanner(System.in).nextLine(); //???????????
		str2 = new Scanner(System.in).nextLine();
		length = str1.length();
		for (i = 0;i < length;i++) //?????
		{
			str1 = tangible.StringFunctions.changeCharacter(str1, i, (char)Character.toUpperCase(str1.charAt(i)));
		}
		for (i = 0;i < length;i++)
		{
			str2 = tangible.StringFunctions.changeCharacter(str2, i, (char)Character.toUpperCase(str2.charAt(i)));
		}
		for (i = 0;i <= length;i++)
		{
			if (str1.charAt(i) > str2.charAt(i)) //??????????????????
			{
				System.out.print('>');
				System.out.print("\n");
				break;
			}
			else if (str1.charAt(i) < str2.charAt(i))
			{
				System.out.print('<');
				System.out.print("\n");
				break;
			}
			else if (i == length) //??????????????????
			{
				System.out.print('=');
				System.out.print("\n");
			}
		}
		return 0;
	}
}

