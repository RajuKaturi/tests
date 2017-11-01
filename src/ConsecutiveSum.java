import java.util.Scanner;
public class ConsecutiveSum {
    
    static long num;

     public static void main(String []args){
         
         Scanner sc = new Scanner(System.in);
         num = sc.nextInt();
         int ans = consecutive(num);
        System.out.println(ans);

}

     
    static int consecutive(long num) {
	long sum = 0, i=0, j=0, n=0;
	int sol = 0;
	n = (num+1)/2;
	for(i=1; i<=n; i++)
	{
	  for(j=i; j<=n; j++)
	  {
		sum = sum + j;
		if(sum > num)
			break;
	  if(sum  == num)
	  {
	  sol = sol + 1;
	  break;
	  }
	  }
	  sum = 0;
	}
	
   return sol;
    }
        
  }