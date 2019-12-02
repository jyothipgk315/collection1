package mapHashMap;
import java.util.*;
public class StudentDetailsUsingHashMap 
{
	public static void main(String[] args) 
	{
	Scanner s=new Scanner (System.in);
	String name,collage,addrs;
	  int reg,phn,mark,year;
	System.out.println("entre the number");
	int n=s.nextInt();
	Map<Integer,Student> map=new HashMap<Integer,Student>();
	Student[] stu=new Student[n];
	for(int i=0;i<n;i++)
	{
	  
	  System.out.println("name");
	  name=s.next();
	  System.out.println("reg No.");
	  reg=s.nextInt();
	  System.out.println("phone No.");
	  phn=s.nextInt();
	  System.out.println("collage name");
	  collage=s.next();
	  System.out.println("addres");
	  addrs=s.next();
	  System.out.println("Mark");
	  mark=s.nextInt();
	  System.out.println("year");
	  year=s.nextInt();
	  stu[i]=new Student();
	  stu[i].setName(name);
	  stu[i].setReg(reg);
	  stu[i].setPhn(phn);
	  stu[i].setCollage(collage);
	  stu[i].setAddrs(addrs);
	  stu[i].setMark(mark);
	  stu[i].setYear(year);
	  map.put(reg,stu[i]);
	}
	System.out.println("enter the key");
	int k=s.nextInt();
	for(Map.Entry<Integer,Student> en:map.entrySet())
	{
		int key=en.getKey();
		Student e=en.getValue();
		if(k==key)
		{
		System.out.println("Register no:"+key);
		System.out.println("Name :"+e.getName());
		System.out.println("Phone :"+e.getPhn());
		System.out.println("Collage :"+e.getCollage());
		System.out.println("Address :"+e.getAddrs());
		System.out.println("Mark :"+e.getMark());
		System.out.println("Year :"+e.getYear());
		break;
		}
		else
		{
			System.out.println("no data");
			break;
		}
	}  

}
}
class Student
{
	 String name,collage,addrs;
	  public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCollage() {
		return collage;
	}
	public void setCollage(String collage) {
		this.collage = collage;
	}
	public String getAddrs() {
		return addrs;
	}
	public void setAddrs(String addrs) {
		this.addrs = addrs;
	}
	public int getReg() {
		return reg;
	}
	public void setReg(int reg) {
		this.reg = reg;
	}
	public int getPhn() {
		return phn;
	}
	public void setPhn(int phn) {
		this.phn = phn;
	}
	public int getMark() {
		return mark;
	}
	public void setMark(int mark) {
		this.mark = mark;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	int reg,phn,mark,year;	
}