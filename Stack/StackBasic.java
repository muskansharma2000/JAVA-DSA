package Stack;
import java.util.Stack;


public class StackBasic {
    public static void main(String[] args) {
    Stack <Integer> stack = new Stack<>();
    for(int i=0;i<5;i++){
        stack.push(i);
    }
    System.out.println("                  pop                  ");
     for(int i=0;i<5;i++){
      System.out.println(stack.pop());
     }
    }
}
