package listArrayList;

import java.util.ArrayList;
import java.util.Scanner;

import java.util.Iterator;

public class Basic {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in); 
		System.out.println("Enter the size");
		int n=s.nextInt();
		ArrayList list=new ArrayList();
		for(int i=0;i<n;i++)
		{
			System.out.println("enter the name");
			String str=s.next();
			System.out.println("age");
			int age=s.nextInt();
			list.add(str);  //add value to list
			list.add(age);
		}
		
		//crreate duplicate in another list
		
		ArrayList list1=(ArrayList) list.clone();
		System.out.println("colne value\n"+list1.get(0));
		
		 //to remove 0th position
		
		list1.remove(0);
		System.out.println(list1.get(0));
		
		
		//for update the  name
		
		System.out.println("enter the update name");
		String name=s.next();
		list.set(0,name);
		
		//print the values
		
		Iterator itr=list.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	
		//clear the list
		
		list.clear();
		
		//remove the all value in list
		
		list.removeAll(list);
		
		
		
			
				

	}

}
