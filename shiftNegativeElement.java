import java.util.Scanner;
public class shiftNegativeElement {
    public static void moveNegativeElements(int arr[],int left,int right){
         while(left<=right){
             if(arr[left]<0 && arr[right]<0){   //  array liya ek pointer right ko ek left ko point kr rha hai                                // 
                 left++;                        // left or right dono element chote hai zero se toh left ko aage bhadayenge
                                                 
             }
             else if(arr[left]>0 && arr[right]<0){   //agar left +ve hai or right -ve hai 
                 int temp = arr[left];                // toh swap kr denge left right ko 
                 arr[left]=arr[right];                 // left ko aage bhadayaenge or right ko wahi rehne denge
                 arr[right]= temp;
                 left++;
                 right--;
             }
             else{
                 left++;                            // ye jab tk krna hai jb tk left right ek he jagah pr na aa jaye 
                 right--; 
             }
         }
    }
    public static void display(int arr[],int right){
    for(int i=0;i<=right;i++)
        System.out.println(arr[i]+"");
    
        System.out.println();
    
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner (System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        sc.close();
        moveNegativeElements(arr, 0, n-1);
        display(arr, n-1);
      
    }
}
