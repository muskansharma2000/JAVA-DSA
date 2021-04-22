/**
 * stringPalindrome
 */
//import java.util.Scanner;
 public class stringPalindrome {
     public static boolean palindrome( String str){
         int i=0;                          //Take two pointers i pointing to the start of the string and 
                //j pointing to the end of the string. Keep incrementing i and decrementing j while i < j and 
                  //at every step check whether the characters at these pointers
                   // are same or not. If not then the string is not a palindrome else it is.
         int j= str.length()-1;
         while(i<j){
             if(str.charAt(i)!=str.charAt(j))
             return false;
             i++;
             j--;
         }
        return true;
     }

    public static void main(String[]args){
       // Scanner sc = new Scanner(System.in);
        String str = "Muskan";
        if(palindrome(str)){
            System.out.println("Yes Plindrome");
        }
        else{
            System.out.println("Not palindrome");
        }
    }
}