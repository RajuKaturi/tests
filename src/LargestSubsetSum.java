import java.util.Scanner;
public class LargestSubsetSum
{
	static long[] LargestSubset(int[] n)
	{
	       long max_sum=0; 
	       long[] ans = new long[n.length];
	
	for(int j=0; j<n.length;j++)
	{
		for (int i=1; i*i<=n[j]; i++)
		{
			if (n[j]%i == 0)
			{
				max_sum += i;
				if (n[j]/i != i)
					max_sum += (n[j]/i);
			}
		}
		ans[j] = max_sum;
		max_sum=0;
		
	
	}
	return ans;
	
	}

	public static void main (String[] args) 
	{
        Scanner in = new Scanner(System.in);
    int[] input = new int[in.nextInt()];
    in.nextLine(); 

    for (int i = 0; i < input.length; i++) {
        input[i] = in.nextInt();
    }
    long ans[] =LargestSubset(input);
    for(int row = 0;row<ans.length;row++)
    System.out.println(ans[row]);
	
	}
}
