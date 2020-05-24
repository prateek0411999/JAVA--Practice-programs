//wap to create a generic class which contains a method that finds maximum element in array of any type.

class Gen<T>
{
	T a;
	T arr[]={4,10,58,45,80,100};
	int getMax()
	{
		int max=0;
		for(int i=0;i<6;i++)                    // if we use for each loop then  ->    for(T aa: arr){		  }
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
			return max;
		}
	}
}
class Main()
{
	public static void main(String args[])
	{
		Gen<Integer> obj =new Gen<Integer>();
		System.out.println(obj.getMax());
	}
}