import java.util.*;
public class BalancedOrNot {
    

     public static void main(String []args){
         
        Scanner firstArray = new Scanner(System.in);
    int strSize = firstArray.nextInt();
    firstArray.nextLine();
    String strAry[] = new String[strSize];
    for(int j= 0;j< strSize; j++)
        strAry[j] = firstArray.nextLine();
    
    int max = firstArray.nextInt(); 
    firstArray.nextLine(); 
    int maxRep[] = new int[max];
    for(int i=0;i<max;i++)
    {
     maxRep[i]=Integer.parseInt(firstArray.nextLine());
    }
         int[] ans = balancedOrNot(strAry, maxRep);
         
        for(int i=0;i<ans.length;i++)
        System.out.println(ans[i]);

}
    static int[] balancedOrNot(String[] expressions, int[] maxReplacements) {
	
Stack stk = new Stack();
int n = expressions.length;
char[][] expAry = new char[n][];
for(int i=0;i<n;i++)
    expAry[i] =expressions[i].toCharArray();



int strLen;
int count = 0;
int sz = 0;

int[] sol = new int[n]; 

for(int i = 0; i < n; i++)
{
    strLen  = expAry[i].length;
	for(int j=0; j<strLen; j++)
	{
		if (expAry[i][j] == '<')
		stk.push(new Integer(expAry[i][j]));
		
		else if (expAry[i][j] == '>' && (!stk.empty()))
		 stk.pop();
		
		else if (expAry[i][j] == '>'&& (stk.empty()) )
		count++;
		
		
	}
	
	    sz = stk.size();
	if (sz>0)
		sol[i] = 0;
	else
		{
		if (count <= maxReplacements[i])
			sol[i] = 1;
		else 
			sol[i] = 0;
		}
	count = 0;
	for (int p = 0; i<sz;i++)
	    stk.pop();
	
}
return sol;
}
}