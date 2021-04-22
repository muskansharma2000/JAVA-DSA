public class InsertionSort {
    public static void insertionSort(int arr[]){
        for(int i=0;i<arr.length;i++){
            int j =i-1;
            int temp = arr[i];
            while(j>=0 && arr[j]>temp){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = temp;
        } 
     
    }
    public static void main(String[] args) {
        int arr[] ={6,3,4,5,2};
        insertionSort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+"");
        }
    }
}
