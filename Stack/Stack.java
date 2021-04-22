package Stack;

/**
 * Stack
 */
class Stack {
private static int arr[];
private int top;
private int capacity;
    

    Stack(int size){
        arr = new int[size];
        capacity=size;
        top=-1;
    }
public void push(int x){
    if(isFull()){
        System.out.println("Overflow");
        System.exit(1);
    }
    System.out.println("Inserting" + x);
    arr[top++]= x;
}
public boolean isFull(){
    return top == capacity-1;
}
public int pop(){
    if(isEmpty()){
        System.out.println("underflow");
        System.exit(1);
    }
    System.out.println("Removing"+ peek());
    return arr[top--];
}
public boolean isEmpty(){
    return top == -1;
}
public int peek(){
    if(!isEmpty()){
        return arr[top];
    }
    else{
        System.exit(1);
    }
    return -1;
}
public static void main(String[] args) {
    Stack stack = new Stack(3);
    stack.push(1);
    stack.push(2);
    stack.pop();
    stack.pop();
    stack.push(3);
    System.out.println(stack.peek());
   // System.out.println(stack.top);
    if(stack.isEmpty()){
    System.out.println("The stack is empty");
}
else{
    System.out.println("The stack is empty");
}
}
}
  