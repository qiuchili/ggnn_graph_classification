//============================================================================
// Name        : POJtest.cpp
// Author      : 
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

void shuchu(int,int, int, int);
int main()
{
	int z; //zqsl??????
	int q;
	int s;
	int l;
	for (z = 10; z <= 50; z += 10)
	{
		for (q = 10; q <= 50; q += 10)
		{
			for (s = 10; s <= 50; s += 10)
			{
				for (l = 10; l <= 50; l += 10)
				{ //??????????
					if (z == q || z == s || z == l || q == s || q == l || s == l) //????,???????????????????????????if???????
					{
						continue;
					}
					if (z + q != s + l) //???????????????
					{
						continue;
					}
					if (z + l <= s + q) //???????????????
					{
						continue;
					}
					if (z + s >= q) //????????????
					{
						continue;
					}
					shuchu(z,q,s,l); //????????????????????????????

				}
			}
		}
	}
return 0;
}
void shuchu(int z,int q,int s,int l)
{
	for (int i = 50;i >= 10;i -= 10) //?????????????????????????
	{
		if (i == z) //i???????????????
		{
			System.out.print("z ");
			System.out.print(z);
			System.out.print("\n");
		}
		else if (i == q)
		{
			System.out.print("q ");
			System.out.print(q);
			System.out.print("\n");
		}
		else if (i == s)
		{
			System.out.print("s ");
			System.out.print(s);
			System.out.print("\n");
		}
		else if (i == l)
		{
			System.out.print("l ");
			System.out.print(l);
			System.out.print("\n");
		}
	}
}
