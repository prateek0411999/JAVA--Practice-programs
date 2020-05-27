import java.util.*;
class Employee
{
	String name;
	int salary;
	int id;	
	
	Employee(String n,int s,int  i)
	{
		this.name=n;
		this.salary=s;
		this.id=i;
	}
	public void Search(int id)
	{
		System.out.println("Employee name is "+name+"Salary is "+salary);
	}
}
class TestEmployee
{
	public static void main(String args[])
	{
		Employee T1=new Employee("RAm",520000,52);
		Employee T2=new Employee("Rahul",440000,50);
		Employee T3=new Employee("Rashil",780000,51);
	
		ArrayList<Employee> lst=new ArrayList<Employee>();
		lst.add(T1);
		lst.add(T2);
		lst.add(T3);


	
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the id you want to search and print it's detail");		
		int ii=sc.nextInt();
		if(ii==52)
		{
			T1.Search(52);
		}
		else if(ii==50)
		{
			T2.Search(50);
		}
			else
			T3.Search(51);
		
		
	}
}