import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[100]);
		str = new Scanner(System.in).nextLine();
		String p = str;
		int i;
		int j;
		int count = 0;
		for (i = 0; * (p.Substring(i)) != '\0'; i++)
		{

			if (*(p.Substring(i)) == ' ')
			{
				count++;
			}
			if (count == 1 && *(p.Substring(i)) != ' ')
			{
			 count = 0;
			}
			if (count >= 2 && *(str.Substring(i)) != ' ')
			{
				for (j = i - count + 1; * (p.Substring(j)) != '\0'; j++)
				{
				 *(p.Substring(j)) = *(p.Substring(j) + count - 1);
				}
				i -= count;
				count = 0;
			}

		}
		for (p = str; p < str + str.length(); p++)
		{
		System.out.print(p);
		}
		System.out.print("\n");
		return 0;
	}
}
