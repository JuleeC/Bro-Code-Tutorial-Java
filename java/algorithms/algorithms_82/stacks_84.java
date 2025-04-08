package java.algorithms.algorithms_82;

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

//        stack.pop();
//        stack.pop();
//        stack.pop();
//        stack.pop();
//        stack.pop();
//        stack.pop();

        //exception if stack is empty but the pop method is called

        //String myFavGame = stack.pop();

        //System.out.println(stack.peek());


        System.out.println(stack.search("DOOM"));
        //if youre searching for an item that isnt in the stack, -1 will be the output
        System.out.println(stack.search("asddsa"));

        //exception because the memory is out of heap
//        for(int i = 0; i < i+1; i++) {
//            stack.push("Fallout76");
//        }

        //uses of stacks?
        //1. undo/redo features in text editors
        //2. moving back/forward through browser history
        //3. backtracking algorithms (maze, file directories)
        //4. calling functions (call stack)


    }
}
