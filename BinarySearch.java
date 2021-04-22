/**
 * BinarySearch
 */
public class BinarySearch {

    public static void main(String[]args){
        int arr[]={1,3,5,7,9,10};
        int index = binarySearch(arr,10);
        System.out.println(index);

    }
    public static int binarySearch(int arr[],int element){
        int start =0;
        int end = arr.length-1;
        while(start<=end){
            int mid = (start+end)/2;
            if(element==arr[mid]){
                return mid;
            }
            else if(element>arr[mid]){
               start = mid+1; 
            }else{
                end=mid-1;
            }
        }
        return -1;
    }
}