import java.util.Scanner;
public class kadan {
        public static void main(String[]args){
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int [] arr= new int[n];
           for(int i=0;i<n;i++){
             arr[i] = sc.nextInt();
        }
        sc.close();
            System.out.println(kadanes(arr));
        }
        public static int kadanes(int []arr){
             int maxSum= Integer.MIN_VALUE;
             int presentSum=0;
             for(int i=0;i<arr.length;i++){
                 presentSum = presentSum + arr[i];
                 if(maxSum<presentSum){
                     maxSum=presentSum;
                 }
                 if(presentSum<0){
                     presentSum=0;
                 }
             }
              return maxSum;
        }
    } 
