package weekly_assignment1;

public class Program5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 57243;
        int result = 0;
        int multiplier = 1;
        int pos = 1;

        while (n > 0)
        {
            int digit = n % 10;
            if (pos % 2 != 0 && digit <= 4) 
            {
                digit = digit * 2;
            } 
            else if (pos % 2 == 0)
            {
                digit = 1;
            }
            result = result + (digit * multiplier);
            n = n / 10;
            pos++;
            multiplier = multiplier * 10;
        }
        System.out.println("Output: " + result);

	}

}
