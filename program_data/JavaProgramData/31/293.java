public class student
{
	   public String num = new String(new char[30]);
	   public String name = new String(new char[30]);
	   public String s = new String(new char[2]);
	   public int age;
	   public float score;
	   public String add = new String(new char[30]);
	   public student next;
}

package <missing>;

public class GlobalMembers
{
	public static student creat()
	{
		   int n = 0;
		   student head;
		   student p1;
		   student p2;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		   p1 = p2 = (student)malloc(LEN);
		   String tempVar = ConsoleInput.scanfRead();
		   if (tempVar != null)
		   {
			   p1.num = tempVar.charAt(0);
		   }
		   String tempVar2 = ConsoleInput.scanfRead();
		   if (tempVar2 != null)
		   {
			   p1.name = tempVar2.charAt(0);
		   }
		   String tempVar3 = ConsoleInput.scanfRead();
		   if (tempVar3 != null)
		   {
			   p1.s = tempVar3.charAt(0);
		   }
		   String tempVar4 = ConsoleInput.scanfRead();
		   if (tempVar4 != null)
		   {
			   p1.age = Integer.parseInt(tempVar4);
		   }
		   String tempVar5 = ConsoleInput.scanfRead();
		   if (tempVar5 != null)
		   {
			   p1.score = Float.parseFloat(tempVar5);
		   }
		   String tempVar6 = ConsoleInput.scanfRead();
		   if (tempVar6 != null)
		   {
			   p1.add = tempVar6.charAt(0);
		   }
		   p2.next = null;
		   while (p1.num.charAt(0) != 'e')
		   {
			   n = n + 1;
			   if (n > 1)
			   {
			   p1.next = p2;
			   }
			   p2 = p1;
			   head = p1;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			   p1 = (student)malloc(LEN);
			   String tempVar7 = ConsoleInput.scanfRead();
			   if (tempVar7 != null)
			   {
				   p1.num = tempVar7.charAt(0);
			   }
			   String tempVar8 = ConsoleInput.scanfRead();
			   if (tempVar8 != null)
			   {
				   p1.name = tempVar8.charAt(0);
			   }
			   String tempVar9 = ConsoleInput.scanfRead();
			   if (tempVar9 != null)
			   {
				   p1.s = tempVar9.charAt(0);
			   }
			   String tempVar10 = ConsoleInput.scanfRead();
			   if (tempVar10 != null)
			   {
				   p1.age = Integer.parseInt(tempVar10);
			   }
			   String tempVar11 = ConsoleInput.scanfRead();
			   if (tempVar11 != null)
			   {
				   p1.score = Float.parseFloat(tempVar11);
			   }
			   String tempVar12 = ConsoleInput.scanfRead();
			   if (tempVar12 != null)
			   {
				   p1.add = tempVar12.charAt(0);
			   }
		   }
		   return (head);
	}
	public static int Main()
	{
		student p = creat();
		 for (;;)
		 {
		   System.out.printf("%s %s %s %d %g %s\n",p.num,p.name,p.s,p.age,p.score,p.add);
		   p = p.next;
		   if (p == 0)
		   {
			   break;
		   }
		 }
	}







}

