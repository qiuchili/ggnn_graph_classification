package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		char[] sz = {' ', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'}; //???????30?????????????????????????????????
		int i = 0; //?????????????j?
		int j = 0;
		sz = new Scanner(System.in).nextLine(); //????
		for (i = 0;i < 30;i++) //??
		{
			if (((sz[i] == '1') || (sz[i] == '2') || (sz[i] == '3') || (sz[i] == '4') || (sz[i] == '5') || (sz[i] == '6') || (sz[i] == '7') || (sz[i] == '8') || (sz[i] == '9') || (sz[i] == '0')) && ((sz[i + 1] == '1') || (sz[i + 1] == '2') || (sz[i + 1] == '3') || (sz[i + 1] == '4') || (sz[i + 1] == '5') || (sz[i + 1] == '6') || (sz[i + 1] == '7') || (sz[i + 1] == '8') || (sz[i + 1] == '9') || (sz[i + 1] == '0')))
			{
				System.out.printf("%c",sz[i]); //??sz[i]??????sz[i+1]?????????sz[i]
			}
			if (((sz[i] == '1') || (sz[i] == '2') || (sz[i] == '3') || (sz[i] == '4') || (sz[i] == '5') || (sz[i] == '6') || (sz[i] == '7') || (sz[i] == '8') || (sz[i] == '9') || (sz[i] == '0')) && (!((sz[i + 1] == '1') || (sz[i + 1] == '2') || (sz[i + 1] == '3') || (sz[i + 1] == '4') || (sz[i + 1] == '5') || (sz[i + 1] == '6') || (sz[i + 1] == '7') || (sz[i + 1] == '8') || (sz[i + 1] == '9') || (sz[i + 1] == '0'))))
			{
				System.out.printf("%c\n",sz[i]); //??sz[i]??????sz[i+1]?????????sz[i]?????????????
			}
		}
	}
}
