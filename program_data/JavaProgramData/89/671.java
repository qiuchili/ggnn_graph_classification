package <missing>;

public class GlobalMembers
{
	/*???1000012904_5.cpp
	  ????????????
	  ?????
	  ???2010?12?10?
	 */
	public static int Main()
	{
		//???????????????count,?????????beasked,?????????answer?????i,??n,????sum
		int[] count = new int[100000];
		int[] beasked = new int[100000];
		int[] answer = new int[100000];
		int i;
		int n;
		int sum = 0;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(count, 0, (Integer.SIZE / Byte.SIZE));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < n * (n - 1); i++)
		{
			beasked[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			answer[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			//??0 0 ?????
			if (beasked[i] == 0 && answer[i] == 0)
			{
				break;
			}
			else
			{
				count[answer[i]]++; //answer[i]???????????
			}
			sum++; //?????1
		}
		int flag = 0;
		for (i = 0; i < n; i++)
		{
			int know = 0; //?????????????
			if (count[i] == n - 1) //???????????
			{
				for (int j = 0; j < sum; j++)
				{
					if (beasked[j] == i) //????????????
					{
						know++; //????????1
					}
				}
				if (know == 0) //??????????
				{
					System.out.print(i);
					System.out.print("\n");
					flag = 1; //??????
				}
			}
		}
		if (flag == 0)
		{
			System.out.print("NOT FOUND");
			System.out.print("\n");
		}
		return 0;
	}



}

