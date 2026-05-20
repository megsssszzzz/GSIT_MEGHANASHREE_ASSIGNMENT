package weekly_assignment1;

public class Program4_Primefactors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 60;
		int factors = 2;
		while (factors<=num)
		{
			if(factors>num/2 && factors!=num)
			{
				break;
			}
			if (num%factors==0)
			{
				boolean isprime = true;
				int j = 2;
				while(j<=factors/2)
				{
					if (factors%j==0)
					{
						isprime = false;
						break;
					}
					j++;
						
				}
				if (isprime)
				{
					System.out.println(factors + " ");
				}
			}
			factors++;
		}
		

	}

}
