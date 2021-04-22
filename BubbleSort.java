/**
 * BubbleSort
 */
public class BubbleSort {

    public static void bubbleSort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){// j humne liya hai taki vo har ek lement pr jakr next element se comparision kre
                if(arr[j]>arr[j+1]){ //element j pr jo present hai vo bada hai next wale se toh swap krlo
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1]= temp;
                }
            }
        }
    }
    public static void main(String[]args){
        int arr[] = {8,2,6,1,5};
        bubbleSort(arr);
        for(int i=0;i<arr.length;i++){
        System.out.println(arr[i] + " ");
        }
    }
}