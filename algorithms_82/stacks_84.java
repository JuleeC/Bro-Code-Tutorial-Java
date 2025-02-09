package algorithms_82;

import java.util.Stack;

public class stacks_84 {
    //stack = LIFO data structure. Last-In First-Out
    //        stores objects into a sort of "vertical tower"
    //        push() to add to the top
    //        pop() to remove from the top

    public static void main(String[] args) {

        Stack<String> stack = new Stack<String>();

        //System.out.println(stack.empty());

        stack.push("Minecraft");
        stack.push("Skyrim");
        stack.push("DOOM");
        stack.push("Borderlands");
        stack.push("FFVII");

        System.out.println(stack);
    }
}
