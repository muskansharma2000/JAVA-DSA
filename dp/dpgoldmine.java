package dp;
import java.util.Scanner;

/**
 * dpgoldmine
 */
public class dpgoldmine {
  
        public static void main(String[] args)
        {
          Scanner sc = new Scanner(System.in);
          int n = sc.nextInt();// grid size n*m
            int m = sc.nextInt();
            int a[][] = new int[n][m]; // grid storing the number of gold coins in each cell
            // taking input of the grid storing the number of gold coins
            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++)
                    a[i][j] = sc.nextInt();
            }
            sc.close();
            /*
            
            ^  ^  ^
             \
            ^- &  ^
             /
            ^  ^  ^
            Consider this represents a grid and we are currently at a cell having & stored in it.
            So only there are three cells from which miner could have reached current cell
            So we take maximum of all the options and thus at the end in the last corner
            We receive the largest amount of gold coins.
            */
            for(int j=1;j<m;j++){
                for(int i=0;i<n;i++){
                  int topLeft = ((i>0) ? a[i-1][j-1] : 0);
                  int justLeft = a[i][j-1];
                  int bottomLeft = ((i+1<n) ? a[i+1][j-1] : 0);
                    int maxOfAll = Math.max(topLeft, bottomLeft);
                    maxOfAll = Math.max(maxOfAll, justLeft);
                    a[i][j] += maxOfAll;
                }
            }
            int ans = 0;
            for(int i=0;i<n;i++){
                ans = Math.max(ans, a[i][m-1]);
            }
          System.out.println(ans);
        }
      }