package setHashSet;

import java.util.HashSet;
import java.util.Scanner;

import java.util.Iterator;

public class SET {

	public static void main(String[] args) {
		Scanner s= new Scanner (System.in);
		HashSet<String> set=new HashSet<String>();
		set.add("Jyothi");
		set.add("Jyothi");
		set.add("dali");
		set.add("asin");
		set.add("Jyothi");
		
		
Iterator<String> itr=set.iterator();
while(itr.hasNext())
{
	System.out.println(itr.next());
}
	}

}
