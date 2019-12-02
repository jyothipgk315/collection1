package listArrayList;
import java.util.*;
public class AddTwoList {

	public static void main(String[] args) {
ArrayList<String> list=new ArrayList<String> (); //create a object for 1st list
list.add("aaa");
list.add("bbb");         //add the value to list 1
list.add("ccc");
ArrayList<String> list1=new ArrayList<String> ();  //object for list2
list1.add("xxx");  //add the value to list 2
list1.add("lll");
	list.addAll(list1);    //combine 2 list
	System.out.println(list); //print without using iterator 
	
	list.clear();  //clear the list
	System.out.println(list);
	}

}

	
	/*
	  using iterator
	  
	  Iterator itr1=list.iterator();      
	while(itr1.hasNext())
	{
		System.out.println(itr1.next());
		
	}*/
	
	
	