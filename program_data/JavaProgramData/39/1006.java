package <missing>;

public class GlobalMembers
{
	/*????????????????????????????????????????????
	1) ????????8000??????????80??>80???????????1??1?????????????
	2) ????????4000??????????85??>85????????????80??>80?????????
	3) ????????2000??????????90??>90?????????
	4) ????????1000??????????85??>85?????????????
	5) ????????850??????????80??>80???????????
	????????????????????????????????????????????????????????87??
	??????82????????????????????????????????????????4850??
	??????????????????????????????????????????????????
	????
	???????????N?1 ? N ? 100??????????????N????????????????????????????
	??????????????????????????????????????????????????????20???????????
	???????????????0?100????????0?100?????????????????????????????Y????N?????
	???????0?10??????0?10????????????????????
	????
	?????????????????????????????????????????????????????????????
	????????????????????????????N?????????????
	????
	4
	YaoLin 87 82 Y N 0
	ChenRuiyi 88 78 N Y 1
	LiXin 92 88 N N 0
	ZhangQin 83 87 Y N 1
	????
	ChenRuiyi
	9000
	28700*/
	public static int Main()
	{
		int n;
		int i;
		int[] sum = new int[100];
		int[] b = new int[100];
		int[] c = new int[100];
		int[] f = new int[100];
		int total = 0;
		int max = 0;
		int x = 0;
		char[][] a = new char[100][20];
		String d = new String(new char[100]);
		String e = new String(new char[100]);
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			a[i] = ConsoleInput.readToWhiteSpace(true).charAt(0);
			b[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			c[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			d = tangible.StringFunctions.changeCharacter(d, i, ConsoleInput.readToWhiteSpace(true));
			e = tangible.StringFunctions.changeCharacter(e, i, ConsoleInput.readToWhiteSpace(true));
			f[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 0;i < n;i++)
		{
			sum[i] = 0;
			if (b[i] > 90)
			{
				sum[i] = sum[i] + 2000;
			}
			if ((c[i] > 80) && (d.charAt(i) == 'Y'))
			{
				sum[i] = sum[i] + 850;
			}
			if ((b[i] > 85) && (e.charAt(i) == 'Y'))
			{
				sum[i] = sum[i] + 1000;
			}
			if ((b[i] > 85) && (c[i] > 80))
			{
				sum[i] = sum[i] + 4000;
			}
			if ((b[i] > 80) && (f[i] >= 1))
			{
				sum[i] = sum[i] + 8000;
			}
			total = total + sum[i];
			if (sum[i] > max)
			{
				max = sum[i];
				x = i;
			}
		}
		System.out.print(a[x]);
		System.out.print("\n");
		System.out.print(max);
		System.out.print("\n");
		System.out.print(total);
		System.out.print("\n");
		return 0;
	}



}

