package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
		String p0;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p0 = p = (String)malloc(100 * (Character.SIZE / Byte.SIZE));
		p = new Scanner(System.in).nextLine();
		for (p = p0; * p != '\0';p++)
		{
			if (*p != ' ')
			{
				System.out.printf("%c",*p);
			}
			else
			{
				for (; * p != '\0';p++)
				{
				if (*p != ' ')
				{
					p--;
					System.out.print(" ");
					break;
				}
				}
			}
		}
	}
}
