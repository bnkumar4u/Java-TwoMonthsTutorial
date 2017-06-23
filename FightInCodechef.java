import java.util.Scanner;
public class FightInCodechef
{
	public static void main(String[] args) {
 
		Scanner scan = new Scanner(System.in);
		int i;
 
		int t = scan.nextInt();
 
		Fight fight = new Fight();
 
		int array[] = new int[t];
 
		for(i=1;i<=t;i++)
		{
			int n = scan.nextInt();
 
			if(n>=0&&n<=100000000)
			{
				int k = scan.nextInt();
 
				array[i-1]= fight.remaining(n,k)+1;
			}
		}
 
		for(i=0;i<t;i++)
			System.out.println(array[i]);
 
		
	}
}
 
class Fight
{
	int remaining(int n, int k)
	{
		int r=0;
 
		for(int i =2; i<=n;i++)
			r = (r+k)%i;
 
		return r;
	}
} 