import java.util.Scanner;
import java.util.Arrays;
public class FindTheWinner{

     public static void main(String []args){
         
         
    Scanner firstArray = new Scanner(System.in);
    int andInput = firstArray.nextInt(); 
    firstArray.nextLine(); 
    int str[] = new int[andInput];
    for(int i=0;i<andInput;i++)
    {
     str[i]=Integer.parseInt(firstArray.nextLine());
    }
    int mariaInput = firstArray.nextInt(); // read number of element
    firstArray.nextLine(); // consume new line
    int strOne[] = new int[mariaInput];
    for(int j=0;j<mariaInput;j++)
    {
     strOne[j]=Integer.parseInt(firstArray.nextLine());
    }
    String evenOrOdd = firstArray.nextLine();
     String strOne1 = new String(evenOrOdd);
	System.out.println(winner(str,strOne,strOne1));

     }

static String winner(int[] andrea, int[] maria, String s) {
int sum_a = 0;
int sum_m = 0;
int andr = 0;
int mar = 0;
String win = "def";
 if(s.equals("Even")){
	int a=0;
	int m=0;
	while(a<andrea.length && m< maria.length){
		  andr = andrea[a] - maria[m];
		 mar = maria[m] - andrea[a];
		 sum_a  = sum_a + andr;
		 sum_m = sum_m + mar;
	     a = a + 2;
		 m = m + 2;
	}
 }
 else if(s.equals("Odd")){
	int a=1;
	int m=1;
	while(a<andrea.length && m< maria.length){
		 andr = andrea[a]-maria[m];
		 mar = maria[m]-andrea[a];
		 sum_a  = sum_a + andr;
		 sum_m = sum_m + mar;
		 a = a + 2;
		 m = m + 2;
	}
 }
if(sum_a>sum_m)
win =  "Andrea";
else if(sum_a<sum_m)
win =  "Maria";
else if(sum_a == sum_m)
win = "Tie";
return win;
}
}