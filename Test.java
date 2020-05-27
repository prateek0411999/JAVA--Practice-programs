/*write a program to create class Shape having abstract method;double area()

make another class Square having private attribute: side and this class inherits the shape class
now make a class Test having main method in which you have to create an object of square class and print its area*/

import java.util.Scanner;
class Shape
{
	abstract double area();
}
class Square extends Shape
{
	private int side;
	Scanner sc=new Scanner(System.in);
	side=sc.nextInt();
	
	double area()
	{
	 	return side*side;	
	}
	
}
class Test
{
	public static void main(String args[])
	{
		Square s=new Square();
		s.area();				
	}
}