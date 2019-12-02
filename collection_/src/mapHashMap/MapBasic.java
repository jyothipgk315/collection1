package mapHashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapBasic {

	public static void main(String[] args) {
		int age;
		String name;
		Scanner s=new Scanner(System.in);
		System.out.println("entre the number");
		int n=s.nextInt();
		Map<Integer,Employ> map=new HashMap<Integer,Employ>();
		Employ[] emp=new Employ[n];
		for(int i=0;i<n;i++)
		{
			System.out.print("Enter the Name :");
			name= s.next();
			System.out.print("Enter the Age :");
			age=s.nextInt();
			emp[i]=new Employ();
			emp[i].setAge(age);
			emp[i].setName(name);
			map.put(i,emp[i]);
		}
		for(Map.Entry<Integer, Employ> en:map.entrySet())
		{
			int key =en.getKey();
			Employ e=en.getValue();
			System.out.println(key+"-"+e.getName()+" "+e.getAge());
		}
	}

}


class Employ
{
int age;
String name;
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
}
