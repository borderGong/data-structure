public class LinkedListStack<E> implements Stack<E> {
    private LinkedList<E> list;

    public LinkedListStack(){
        list = new LinkedList<>();
    }

    @Override
    public int getSize(){
        return list.getSize();
    }

    @Override
    public boolean isEmpty(){
        return list.isEmpty();
    }

    @Override
    public void push(E e){
        list.addFirst(e);
    }

    @Override
    public E pop(){
        return list.removeFirst();
    }

    @Override
    public E peek(){
        return list.getFirst();
    }

    @Override
    public String toString(){
        StringBuilder str = new StringBuilder();
        str.append("Stack top");
        str.append(list);
        return str.toString();
    }

    public static void main(String[] args) {
        // write your code here
        LinkedListStack<Integer> stack = new LinkedListStack<>();
        for(int i = 0; i < 10; i++){
            stack.push(i);
            System.out.println(stack.toString());
        }
        stack.pop();
        System.out.println(stack.toString());

        System.out.println(stack.peek());
    }
}
