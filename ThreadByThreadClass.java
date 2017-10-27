//Thread implemenstation by Thread class inheritance
//its main disadvantage is the class extending Thread class cannot inherit other classes

public class ThreadByThreadClass
{
	public static void main(String[] args) 
	{
		A a=new A();
		B b=new B();
		a.start();
		b.start();
	}
}
class A extends Thread
{
	public void run()
	{
		int i;
		for(i=0;i<=10;i++)
		{
			System.out.println("Thread A "+i);
		}
	}
}
class B extends Thread
{
	public void run()
	{
		int i;
		for(i=0;i<=10;i++)
		{
			System.out.println("Thread B "+i);
		}
	}
}