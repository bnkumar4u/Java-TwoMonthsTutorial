//Thread implementation using Runnable interface

public class ThreadExample
{
	public static void main(String[] args) 
	{
		Runnable a=new A();
		Runnable b=new B();
		Thread t1=new Thread(a);
		Thread t2= new Thread(b);
		t1.start();
		t2.start();

	}
}
class A implements Runnable
{
	public void run()
	{
		int i;
		for(i=0;i<=10;i++)
		{
			System.out.println("Thread A  "+i);
		}
	}
}
class B implements Runnable
{
	public void run()
	{
		int i;
		for(i=0;i<=10;i++)
		{
			System.out.println("Thread B  "+i);
		}
	}
}