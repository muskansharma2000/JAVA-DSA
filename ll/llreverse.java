package ll;
// import java.util.Scanner;

// public class llreverse {
//     public static Node<Integer> reverseR(Node<Integer>head){
//      if(head==null || head.next==null){
//          return head;
//      }
//      Node<Integer> finalHead =  reverseR(head.next);
//      Node<Integer> temp = finalHead;
//      while(temp.next!=null){
//          temp = temp.next;
//      }
//     temp.next = head;
//     head.next= null;
//     return finalHead;
//     }
//     public static Node<Integer> takeInput(){
//         Node<Integer> head = null; 
//         Scanner sc = new Scanner (System.in);
//         int data = sc.nextInt();

//         while(data!=-1){           
//             Node<Integer> newNode = new Node<Integer>(data); //while ki condition check ki phir new node banaya
//             if(head==null){                    // jisme data ki value 1 hui next null hai head bhi yhi ho jayega aab 
//                 head = newNode;
//             }
//             else{
//                 Node<Integer> temp = head; // ye hum next node se first node ko link krne ke liye kr rhe hai 
//                 while(temp.next !=null){
//                     temp = temp.next;
//                 }
//                 temp.next = newNode;
//             }
//             data = sc.nextInt();
//         }
//         sc.close();
//          return head;
         
        

//     }
//     public static void print (Node<Integer>head){
//         while(head!=null){
//             System.out.println(head.data + " ");
//             head = head.next; //aage bhadne ke liye
//         }
//     }

//     public static void main(String[] args) {
//         Node<Integer> head = takeInput();
//         head = reverseR(head);
//         print(head);
        
//     }
// }
