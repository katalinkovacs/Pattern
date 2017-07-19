package tutorialspoint2.datastructure.vectorandstack;

import java.util.EmptyStackException;
import java.util.Stack;

public class StackDemo {

    public static void main(String args[]) {
        Stack stack = new Stack();
        System.out.println("Stack: " + stack);

        showpush(stack, 42);
        System.out.println("Stack: " + stack);

        showpush(stack, 66);
        System.out.println("Stack: " + stack);

        showpush(stack, 99);
        System.out.println("Stack: " + stack);

        showpop(stack);
        System.out.println("Stack: " + stack);

        showpop(stack);
        System.out.println("Stack: " + stack);

        showpop(stack);
        System.out.println("Stack: " + stack);

        try {
            showpop(stack);
        }catch (EmptyStackException e) {
            System.out.println("empty stack");
        }
    }



    static void showpush(Stack st, int a) {
        st.push(new Integer(a));
        //System.out.println("push(" + a + ")");
        //System.out.println("stack: " + st);
    }

    static void showpop(Stack st) {
        System.out.print("pop -> ");
        Integer a = (Integer) st.pop();
        System.out.println(a);
        //System.out.println("stack: " + st);
    }
}
