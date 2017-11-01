import java.util.Scanner;

public class PsychometricTesting {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int[] nAry = new int[n];
        for (int i = 0; i < n; i++) {
            nAry[i] = Integer.parseInt(sc.nextLine());
        }

        int q = sc.nextInt();
        sc.nextLine();
        int[] qAry = new int[q];
        for (int i = 0; i < q; i++) {
            qAry[i] = Integer.parseInt(sc.nextLine());
        }

        int r = sc.nextInt();
        sc.nextLine();
        int[] rAry = new int[r];
        for (int i = 0; i < q; i++) {
            rAry[i] = Integer.parseInt(sc.nextLine());
        }


        int[] ans = jobOffers(nAry, qAry, rAry);
        for (int i = 0; i < q; i++)
            System.out.println(ans[i]);

    }

    static int[] jobOffers(int[] scores, int[] lowerLimits, int[] upperLimits) {
        {
            int i = 0, j = 0, count = 0, solIndx = 0;
            int q = lowerLimits.length, n = scores.length;
            int[] sol = new int[q];

            for (j = 0; j < q; j++) {
                for (i = 0; i < n; i++) {
                    if (scores[i] >= lowerLimits[j] && scores[i] <= upperLimits[j]) {
                        count++;
                    }
                }

                if (count > 0)
                    sol[solIndx++] = count;
                count = 0;


            }

            return sol;
        }
    }
}
