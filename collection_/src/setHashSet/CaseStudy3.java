package setHashSet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class CaseStudy3 {

	public static void main(String[] args) {
		Scanner s=new Scanner (System.in);
		
		HashSet list=new HashSet();
		int n;
		int i=1;
		do
		{
		System.out.println("menu\n1.Book\n2.Check Status\n3.Exit");
			 n=s.nextInt(); 
			 if(n==1)
			 {
				 int a=0; 
				 System.out.println("Booking\nPlease Choose The Service Required\nac|non ac");
				 String ac=s.next();
				 if(ac.contentEquals("ac"))
				 {
					 a=a+100;
					 
				 }
				 else
				 {
					 a=a+50;
				 }
				 System.out.println("Cot(s|d)");
				 String cot=s.next();
				 if(cot.contentEquals("s"))
				 {
					 a=a+100;
				 }
				 else
				 {
					 a=a+50;
				 }
				 
				 System.out.println("cable conection(c|nc)");
				 String cable=s.next();
				 if(cable.contentEquals("c"))
				 {
					 a=a+100;
				 }
				 else
				 {
					 a=a+50;
				 }
				 
				 System.out.println("wifi(w|nw)");
				 String wifi=s.next();
				 if(wifi.contentEquals("w"))
				 {
					 a=a+100;
				 }
				 else
				 {
					 a=a+50;
				 }
				 System.out.println("laundry(l|nl)");
				 String laun=s.next();
				 if(laun.contentEquals("l"))
				 {
					 a=a+100;
				 }
				 else
				 {
					 a=a+50;
				 }
				 list.add(i);
				 System.out.println("total charge is "+a);
				 System.out.println("Thank you . "+i+"room is booked");
				 i++;
				 
			 }
			 if(n==2)
			 {
				 System.out.println("check room");
				 int room=s.nextInt();
				 if(list.contains(room))
				 {
					 System.out.println("booked");
				 }
				 else
				 {
					 System.out.println("not booked");
				 }
			 }
		}
		while(n==1||n==2);
	
	
	
	s.close();
	}
}
	
			