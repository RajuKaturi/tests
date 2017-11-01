import java.util.*;
public class BuyingShowTickets {
    

     public static void main(String []args){
         
        Scanner firstArray = new Scanner(System.in);
    int andInput = firstArray.nextInt(); 
    firstArray.nextLine(); 
    int str[] = new int[andInput];
    for(int i=0;i<andInput;i++)
    {
     str[i]=Integer.parseInt(firstArray.nextLine());
    }
    
    int p = firstArray.nextInt();
         
        
        
         long ans = waitingTime(str,p);
        System.out.println(ans);

}
    static long waitingTime(int[] tickets, int p) 
	{
		int i = 0;
		long time = 0;
		int n = tickets.length;
		
		if(tickets[p]==0)
		    time = 0;
		else
		{
	    for(i=0;i<n;i++)
		{
			if(tickets[p]==1)
			{
			if(i<=p)
			{
				if(tickets[i]<=tickets[p])
					time += tickets[i];
				else
					time += tickets[p];
			}
			}
			else
			{
			if(i<=p)
			{
				if(tickets[i]<=tickets[p])
					time += tickets[i];
				else
					time += tickets[p];
			}
			else
			{
				if(tickets[i]<=tickets[p])
					time += tickets[i];
				else
					time = time + tickets[p] - 1;
				
			}
			}
		
		    
		}
		}
		
		return time;
		
    }
}