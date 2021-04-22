import java.util.Scanner;
public class arraytwod {
    public static int [][] takeInput(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no of rows");
        int rows= sc.nextInt();
        System.out.println("enter no of columns");
        int columns = sc.nextInt();
        int input [][]= new int[rows][columns];
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                System.out.println("enter element at" + i+ "row"+ j+"columns");
                input[i][j]= sc.nextInt();
            }
        }
        sc.close();
       return input;
    }
    public static int largestColSum(int input[][]){
        int largest = Integer.MIN_VALUE;
        int rows = input.length;
        int columns = input[0].length;
        for(int j=0;j<columns;j++){
            int sum =0;
            for(int i=0;i<rows;i++){
                sum = sum + input[i][j];
            }
            if(sum>largest){
                largest =sum;
            }
        }
        return largest;

    }
    public static void print(int [][]input){
        int rows = input.length;
        int columns = input [0].length;
        for(int i=0;i<rows;i++){
            for(int j=0;i<columns;j++){
                System.out.println(input[i][j] + " ");
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        int input[][]=takeInput();
        print(input);
        System.out.println("largest column sum " + largestColSum(input));
    }
}
