package mapTreeMap;

import java.util.*;

public class CardGame {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String symbol;
		int num,count=0,sum=0;
		ArrayList<Card> list=new ArrayList<Card>();
		Map<String,Card> map=new TreeMap<String,Card>();
		
		System.out.println("entre the number");
		int n=s.nextInt();
		Card[] c=new Card[n];
		for(int i=0;i<n;i++)
		{
			System.out.println("card :"+(i+1));
			symbol=s.next();
			num=s.nextInt();
			c[i]=new Card(); //redirected to card
			c[i].setSymbol(symbol);
			c[i].setNum(num);
			list.add(c[i]);
			map.put(c[i].getSymbol(),c[i]);
		}
		System.out.println("Distinct Symbols are :");
		Set <String> keys=map.keySet();
		for(String key:keys)
		{
			System.out.println(key+" ");
			System.out.println();
		}
		for(String key:keys)
		{
			System.out.println("Card in "+key+" Symbol");
			Iterator<Card> itr=list.iterator();
			while(itr.hasNext())
			{
				Card ca=itr.next();
				if(ca.getSymbol().equals(key))
					System.out.println(ca.getSymbol()+" "+ca.getNum());
			}
			Iterator<Card> itr1=list.iterator();
			while(itr1.hasNext())
			{
				Card ca=itr1.next();
				if(ca.getSymbol().equals(key))
				{
					count++;
					sum=ca.getNum()+sum;
				}
			}
			System.out.println("Number of card :"+count);
			System.out.println("sum of number :"+sum);
		}
		
			

	}

}
class Card
{
	String symbol;
	int num;
	public String getSymbol() {
		return symbol;
	}
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}	
}
