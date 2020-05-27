import java.util.*;
interface Details
{
	void showDetails();
}
abstract class Device
{
	protected String date_of_mfg;
	abstract String getMfgDate();
}
class Smartphone extends Device implements Details
{
	private String company;
	public String getMfgDate()
	{
		return this.date_of_mfg;
	}
	public Smartphone(String aa)
	{
		this.company=aa;
		this.date_of_mfg="10/1/18";
	}
	public void showDetails()
	{
		System.out.println(this.company + this.date_of_mfg);
	}

}
class Tablet extends Device implements Details
{
	private int cost;
	public Tablet(int a)
	{
		this.cost=a;
	}
	public String getMfgDate()
	{
		return this.date_of_mfg;	
	}
	public void showDetails()
	{
		System.out.println(this.cost);
	}
	
}
class Test1
{
	public static void main(String args[])
	{
		Test1 t=new Test1();
		Smartphone s1=new Smartphone("Apple");
		Tablet t1=new Tablet(37000);
	ArrayList<Object> lst=new ArrayList<Object>();		
		
		lst.add(s1);
		lst.add(t1);
		
	
	
		for(int i=0;i<2;i++)
		{
			System.out.println(lst.get(i));
		}
		
}
}