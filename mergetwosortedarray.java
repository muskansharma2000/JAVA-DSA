public class mergetwosortedarray{
     public static int[] merge(int[]arr1, int[] arr2){
        int i=0;                  //  we take  3 array arr1 arr2 and answer answer me hum arr1 and 2 ko sort krke dalenge 
        int j=0;                  // arr1 me i iterate krega arr2 me j or answer wale array me k 
        int k=0;

        int ans[] = new int[arr1.length + arr2.length];
        while(i<arr1.length && j<arr2.length){   //sorted hai array toh i or j ke index zero wale elements small honge 
            if(arr1[i] < arr2[j]){
                ans[k] = arr1[i];
                k++;
                i++;
            }
            else{
                ans[k] = arr2[j];
                j++;
                k++;
            }

            }
            while(i<arr1.length){ // ye hum iss liye rhe hai jab hum compare kr rhe hai elments se toh ek time pr ek ke pass
                                   // jyada or ek ke pass kamm ho jayega toh directly hum usko k me store krwa denge 
            ans[k]=arr1[i];        // 
                k++;
                i++;
            }
            while(j<arr2.length){
                ans[k]=arr2[j];
                j++; 
                k++;

            }
            return ans;
        }
     
    public static void main (String[]args){
     int arr1[]={1,3,5,7};
     int arr2[]={2,4,6};
     int ans[] = merge(arr1,arr2);
     for(int i=0;i<ans.length;i++){
         System.out.print(ans[i]+" ");
     }
     System.out.println();
}
}
