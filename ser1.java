
import java.util.*;

class ser
{
	public static int stop(int p, int n)
	{
		int nu = 1, d = 1, s = p;
		while (p != 1)
		{
			d*= p;
			p--;
		}

		int t = n - s + 1;
		while (t != (n - 2 * s + 1))
		{
			nu *= t;
			t--;
		}

		if ((n - s + 1) >= s)
			System.out.print(nu/ d);

		else
			System.out.print("not possible");

		return 0;
	}

	public static void main (String[] args)
	{
        Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
        int s=sc.nextInt();
		stop(4, 12);
	}
}

