import java.util.*;
class Gen<T>
{
	T a;
	void set(T a)
	{
		this.a=a;
	}
	T get()
	{
		return a;
	}
}
class Test3
{
	public static void main(String args[])
	{
		Gen obj = new Gen<Integer>();
		obj.set(10);
		Integer i=(Integer)obj.get();
		System.out.println(i.intValue());
		
		Gen obj2 = new Gen<Integer>();
		obj2.set("HELLO");
		String ss=(String)obj.get();
		System.out.println(ss.stringValue());
	}
}
