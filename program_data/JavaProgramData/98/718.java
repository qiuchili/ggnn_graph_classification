import java.util.*;

package <missing>;

public class GlobalMembers
{
	/*
	 * 73.cpp
	 * ??????
	 *  Created on: 2011-12-3
	 * ?????????????????????????????????????????????80?????????????????????????????????????????????????????
	 */


	public static int Main()
	{
		String n = new String(new char[10]);
		n = new Scanner(System.in).nextLine();
		String word = new String(new char[10000]);
		word = new Scanner(System.in).nextLine();
		int i;
		int j;
		int t = 1;
		while (t == 1)
		{
			for (i = 0;i < 10000;i++) //??????
			{
				if (word.charAt(i) == '\0')
				{
					break;
				}
			}
			if (i < 80) //???80????????????
			{
				System.out.print(word);
				System.out.print("\n");
				t = 0;
				break;
			}
			else
			{
				for (i = 80;i > 40;i--) //??81??????
				{
					if (word.charAt(i) == ' ')
					{
						break;
					}
				}
				for (j = 0;j < i;j++) //???????
				{
					System.out.print(word.charAt(j));
				}
				System.out.print("\n");
				for (j = i + 1;j < 10000;j++) //??????
				{
					word = tangible.StringFunctions.changeCharacter(word, j - i - 1, word.charAt(j));
				}
			}
		}
		return 0;
	}

}

