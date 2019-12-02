package listArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class UsingGetSet {

	public static void main(String[] args) {
		int n,i;
		String name;
		int age;
		Scanner s=new Scanner(System.in);
		System.out.println("size");
		n=s.nextInt();
		ArrayList lis=new ArrayList();
		Employee[] em=new Employee[n]; 
		for( i=0;i<n;i++)
		{
			System.out.println("enter the name");
			name=s.next();
			System.out.println("enter age");
			age =s.nextInt();
			em[i]=new Employee();
			em[i].setAge(age);
			em[i].setName(name);
			lis.add(em[i]);
		}
		Iterator<Employee> itr=lis.iterator();
		while(itr.hasNext())
		{
			Employee e=itr.next();    //for hiding details
			System.out.println(e.getName()+" "+e.getAge());
		}

	}

}
