package ll;


/**
 * detectcyclell
 */

class Node
{
    int data;
    Node next;
 
    Node(int data, Node next)
    {
        this.data = data;
        this.next = next;
    }

 


    public static boolean hasCycle(Node head){
        if(head==null || head.next ==null)
        return false;
        Node fast = head;
        Node slow = head;

        while(fast !=null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast== slow){
                return true;
            }
            
        }
        return false;
    }
    public static void removeCycle(Node head){
        Node fast = head;
        Node slow = head;
        do{
            slow=slow.next;
            fast=fast.next.next;
        }
        while(slow!=fast);
        fast =head;
        while(slow.next!=fast.next){
            slow=slow.next;
            fast = fast.next;
        }
        slow.next=null;
    }
    public static Node removeDuplicates(Node head){
        if(head==null){
            return null;
        }
        Node current = head;
        while(current.next!=null){
            if(current.data == current.next.data){
               Node nextNext = current.next.next;
               current.next = nextNext;
            }
            else{
                current=current.next;
            }
        }
        return head;
    }
     void Movelasttofront(Node head){
        if(head==null || head.next==null)
        return ;
        Node last= head;
        //Node SecondLast = null;
        while(last.next!=null){
         //   SecondLast = last;
            last= last.next;
        }
      //  SecondLast = null;
        last.next = head;
        head=last;
    }
    public static void main(String[] args) {
        int []keys = {1,2,3,4,5,6,7};
        Node head=null;
        for (int i = keys.length - 1; i >= 0; i--) {
            head = new Node(keys[i], head);
        }
        head.next.next.next.next.next = head.next.next;
        if (hasCycle(head)){
            System.out.println("cycle Found");
        }
        else{
            System.out.println("No cycle found");
        }
        removeCycle(head);
        
    }
}