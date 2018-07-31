public class Main {

    public static void main(String[] args) {
	// write your code here
        ArrayStack stack = new ArrayStack();
        for(int i = 0; i < 10; i++){
            stack.push(i);
            System.out.println(stack.toString());
        }
        stack.pop();
        System.out.println(stack.toString());

        System.out.println(stack.peek());
    }
}
