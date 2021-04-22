/**
 * subarraysum
 */
public class subarraywithgivensum {
    public static int subarraysum(int arr[],int n,int sum){
        int currentSum =0;
        int i;
        int start =0;
        for(i=1;i<=n;i++){
            //if current sum exceeds the sum then remove the starting elements
          while(currentSum>sum && start < i-1){
              currentSum = currentSum + arr[start];
              start++;
          }
          // if current sum is equal to sum then return true
          if(currentSum==sum){
              int p =i-1;
              System.out.println("Sum is found between indexes " + start + " and " + p);
              return 1;
          }
          if(i<n)
              currentSum=currentSum+arr[i];
          
        }
        System.out.println("No subarray sum found");
        return 0;
    }
    // public static void main(String[] args) {
    //     subarraywithgivensum arraysum = new subarraywithgivensum(); 
    //     int arr[] = { 15, 2, 4, 8, 9, 5, 10, 23 }; 
    //     int n = arr.length; 
    //     int sum = 23; 
    // //    arraysum.subarraysum(arr, n, sum);
        
    // }
 
    
}