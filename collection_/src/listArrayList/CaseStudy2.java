package listArrayList;

import java.util.*;

public class CaseStudy2 {

	public static void main(String[] args) {
		Scanner s=new Scanner (System.in);
		ArrayList list=new ArrayList();
		int n;
		do
		{
			System.out.println("1.Display installed applications\n2.Install an application\n3.Uninstall an application\n4.Quit");
			 n=s.nextInt();
			if(n==1)
		     {
				if(list.isEmpty())
				{
					System.out.println(" there is no app installed");
				}
				else
				{
					int j=1;
				Iterator itr=list.iterator();
			        while(itr.hasNext())
			          {
			        	System.out.println(j+")"+itr.next());
			        	j++;
			          }
				}
		    }
		else if(n==2)
		{
			System.out.println("enter the name");
			String name=s.next();
			if(list.contains(name))
				{
				System.out.println("app is alredy installed");
				}
			else
				{
					list.add(name);
					System.out.println("Application installed successfully.");
				}
			}
		else if(n==3)
		{
			if(list.isEmpty())
			{
				System.out.println(" there is no app installed");
			}
			else
			{
			int j=1;
			Iterator itr=list.iterator();
		        while(itr.hasNext())
		          {
		        	System.out.println(j+")"+itr.next());
		        	j++;
		          }
		    System.out.println("enter the app to be deleted");
		    int n1=s.nextInt();
		    list.remove(n1-1);
		    System.out.println("app is uninstalled");
			}
		}
		else if(n==4)
		{
			exit();
		}
		else
		{
			System.out.println("invalid input");
		}
		}
		while(n==1||n==2||n==3);
		
		
	}

	private static void exit() {
		// TODO Auto-generated method stub
		
	}
}
