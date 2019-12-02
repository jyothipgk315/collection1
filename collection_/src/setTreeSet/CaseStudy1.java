package setTreeSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class CaseStudy1 {

	public static void main(String[] args) {
		String symbol;
		int number,count=0;
		
		Scanner s= new Scanner (System.in);
		Set<NewCard> st=new TreeSet<NewCard>(new Symbol());
		NewCard[] c=new NewCard[40];
		int n=s.nextInt();
		while(st.size()<n)
		{
			symbol=s.next();
			number =s.nextInt();
			c[count]=new NewCard();
			c[count].setSymbol(symbol);
			c[count].setNumber(number);
			st.add(c[count]);
			count++;
		}
		System.out.println(n+" symbols gaterd in"+count+" cards.");
		System.out.println("cards are");
		Iterator<NewCard> itr=st.iterator();
		while(itr.hasNext())
		{
			NewCard ca=(NewCard)itr.next();
			System.out.println(ca.getSymbol()+" "+ca.getNumber());
		}
		
		
	}

}
