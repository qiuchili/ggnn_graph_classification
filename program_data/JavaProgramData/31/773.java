public class student
{
	public String num = new String(new char[20]);
	public String name = new String(new char[20]);
	public char sex;
	public int age;
	public float grade;
	public String addr = new String(new char[100]);
	public student next;
}

package <missing>;

public class GlobalMembers
{
	public static student creat()
	{
		student pt;
		student pn;
		pn = new student();
		pt = null;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			pn.num = tempVar.charAt(0);
		}
		pn.next = null;
		while (pn.num.charAt(0) != 'e')
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				pn.name = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar3 != null)
			{
				pn.sex = tempVar3.charAt(0);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				pn.age = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ");
			if (tempVar5 != null)
			{
				pn.grade = Float.parseFloat(tempVar5);
			}
			String tempVar6 = ConsoleInput.scanfRead(" ");
			if (tempVar6 != null)
			{
				pn.addr = tempVar6.charAt(0);
			}
			pt = pn;
			pn = new student();
			pn.next = pt;
			String tempVar7 = ConsoleInput.scanfRead();
			if (tempVar7 != null)
			{
				pn.num = tempVar7.charAt(0);
			}
		}
		return (pt);
	}
	public static int Main()
	{
		student head;
		student p;
		head = creat();
		p = head;
		while (p != 0)
		{
			System.out.printf("%s %s %c %d %g %s\n",p.num,p.name,p.sex,p.age,p.grade,p.addr);
			p = p.next;
		}
		return 0;
	}
}

