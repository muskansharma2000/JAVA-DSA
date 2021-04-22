// package ll;
// import java.util.Scanner;

// public class ll4 {
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
//     public static Node<Integer> insert(Node<Integer> head, int data , int position){
//         Node<Integer> newNode = new Node<Integer>(data);
//         if(position==0){
//             newNode.next = head;
//             return newNode;
//         }
//         int i=0;
//         Node<Integer> temp = head;
//         while(i<position-1){
//             temp= temp.next;
//             i++;
//         }
//         newNode.next = temp.next.next;
//         temp.next = newNode;
//         return head;
//     }

//     public static void main(String[] args) {
//         // Node<Integer>node1 = new Node<Integer>(100);
//         // Node<Integer>node2 = new Node<Integer>(200);
//         // Node<Integer>node3 = new Node<Integer>(300);
//         // node1.next = node2;
//         // node2.next = node3;
//       //  Node<Integer> head = node1;
//       Node<Integer> head = takeInput();
//       head = insert (head,80,3);
//         print(head);


         
// }
    
// }
