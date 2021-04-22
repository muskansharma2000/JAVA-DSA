// package ll;
// import java.util.Scanner;
// public class ll3 {

//     public static Node<Integer>takeInput(){
//         Node<Integer> head =null , tail= null;
//         Scanner sc = new Scanner (  System.in);
//         int data = sc.nextInt();
//         sc.close();
//         while(data!=-1){
//             Node<Integer> newNode = new Node<Integer>(data); // ye hum lete hai newnode bana rhe hai jisme data ka input lenge
//             if(head==null){
//                 head = newNode;
//                 tail = newNode;
//             }
//             else{
//                 tail.next = newNode;
//                 tail = tail.next; // tail = newNode;
//             }
//             data = sc.nextInt();
//         }
//         return head;
//     }
//     public static void print(Node<Integer> head){
//         while(head !=null){
//             System.out.println(head.data + " "); // ek ek krke data print krwana hai isliye 
//             head = head.next;
//         }
//         System.out.println();
//     }
//     public static void main(String[] args) {
        
//         Node<Integer> head = takeInput();
//         print(head);
//     }
// }
