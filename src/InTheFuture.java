import java.util.Scanner;
public class InTheFuture{

     public static void main(String []args){
         
         Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        sc.nextLine();
        int K = sc.nextInt();
        sc.nextLine();
        int P = sc.nextInt();        
         int ans = minNum(A,K,P);
        System.out.println(ans);

        
     }

static int minNum(int A, int K, int P) 
{

 int i= 0,a=P,k=0;
 int ret = -1;
 
 if (K <= A)
 return ret;
 
else
{	
 for (;;)
 {
	i++;
	a = a + A;
	k = k + K;
	if (k > a)
	{
		return i;
	}
 }

}

}

}