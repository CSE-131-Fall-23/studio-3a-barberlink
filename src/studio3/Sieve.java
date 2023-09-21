package studio3;
import java.util.Scanner;

public class Sieve 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Give an integer n to find all primes up to n");
		int n = in.nextInt();
		int index = 0;
		int [] values = new int[n-1];
		boolean [] booleans = new boolean[n-1];
		//populating value array
		for(int i=2; i<=n; i++)
		{
			values[index]=i;
			index++;
		}
		for(int i=0; i<n-1; i++)
		{
			//testing for prime
			if(!booleans[i])
			{
				System.out.println(values[i]);
				
				for(int a=2; a<n; a++)
				{
					if((values[i]*a)>n)
					{
						continue;
					}
					else
					{
						booleans[(values[i]*a)-2] = true;
					}
				}
			}
		}
		
		

	}

}
