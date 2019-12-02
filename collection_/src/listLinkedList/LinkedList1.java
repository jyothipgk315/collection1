package listLinkedList;


import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class LinkedList1 {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in); 
		System.out.println("Enter the size");
		int n=s.nextInt();
		LinkedList list=new LinkedList();
		for(int i=0;i<n;i++)
		{
			System.out.println("enter the Roll No");
			String str=s.next();
			System.out.println("enter the name");
			String name=s.next();
			System.out.println("Mark in LCD :");
			int lcd=s.nextInt();
			System.out.println("Mark in EC :");
			int ec=s.nextInt();
			int tot=lcd+ec;
			list.add(str);
			list.add(name);
			list.add(tot);
			//list.add(ec);
		}
		System.out.println("size of list"+list.size());
		System.out.println("the list is empty :"+list.isEmpty());
		Iterator itr=list.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}
