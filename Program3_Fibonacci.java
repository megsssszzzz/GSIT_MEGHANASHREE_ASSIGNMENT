package weekly_assignment1;

public class Program3_Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 0;
		int num2 = 1;
		int count = 1;
		int maxnum = 10;
		while (count<=maxnum)
		{
			System.out.print(num1 + ",");
			int sum = num1+num2;
			num1=num2;
			num2=sum;
			if (sum>=maxnum)
				break;
			count++;
		}

	}

}
