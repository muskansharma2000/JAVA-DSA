package Stack;
//import java.util.Scanner;
import java.util.Stack;

public class stackreverse {
    public static void insertElement(Stack<Integer>s, int Element){
        if(s.isEmpty()){
            s.push(Element);
            return;
        }
        int top = s.pop();
        insertElement(s, Element);

        s.push(top);
    }
    public static void reverseStack(Stack<Integer>s){
        if(s.empty()){
            return;
        }
        int Element =s.pop();
        reverseStack(s);
        insertElement(s, Element);

    }
    public static void main(String[] args) {
        Stack <Integer>s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        System.out.println("originl Stack");
        System.out.println(s);
        reverseStack(s);
        System.out.println("Reversed Stack");
        System.out.println(s);
    }
    }