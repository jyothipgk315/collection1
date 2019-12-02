package listArrayList;

import java.util.*;

public class CaseStudy {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		
		System.out.println("size");
		int n=s.nextInt();
		ArrayList lis=new ArrayList();
		Empo[] e=new Empo[n];
		for(int i=0;i<n;i++)
		{
			System.out.println("name");
			String name1=s.next();
			System.out.println("addrs");
			String addr=s.next();
			System.out.println("contact");
			int con=s.nextInt();
			
			System.out.println("email");
			String email=s.next();
			
			System.out.println("proof Type");
			String pro1=s.next();
			System.out.println("proof ID");
			String pro2=s.next();
			e[i]=new Empo();
			e[i].setName1(name1);
			e[i].setAddr(addr);
			e[i].setCon(con);
			e[i].setEmail(email);
			e[i].setPro1(pro1);
			e[i].setPro2(pro2);
			
			System.out.println(" Do you Want to update(yes/no)");
				 String up=s.next();
		String c=up.toLowerCase();
		if(c.contentEquals("yes"))
		{
			System.out.println("new mail");
			String m1=s.next();
			
			e[i].setEmail(m1);
			
			
		}
		
		lis.add(e[i]);	     //add the all value into list	
		}
		System.out.println("enter the id of customer");
		int id=s.nextInt();
		lis.remove(id-1);
		Iterator<Empo> itr=lis.iterator();
		int j=1;
		
		while(itr.hasNext())
		{
			Empo em=itr.next();          //create a object to print the details
			System.out.println(j+" employee details\n###############\n");
			System.out.println("name :"+em.getName1());
			System.out.println("addrs :"+em.getAddr());
			System.out.println("contact :"+em.getCon());
			System.out.println("email :"+em.getEmail());
			System.out.println("proof Type :"+em.getPro1());
			System.out.println("proof ID:"+em.getPro2());
			j++;
		}
		
		
		
		
		
		
	
	}

}
