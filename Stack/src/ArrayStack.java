public class ArrayStack<E> implements Stack<E> {
    private Array array;

    public ArrayStack(int capcity){
        array = new Array(capcity);
    }

    public ArrayStack(){
        array = new Array();
    }

    @Override
    public void push(E e){
        array.appendLast(e);
    }

    @Override
    public E pop(){
        return (E) array.removeLast();
    }

    @Override
    public E peek(){
        return (E) array.getLast();
    }

    @Override
    public boolean isEmpty(){
        return array.isEmpty();
    }

    @Override
    public int getSize(){
        return array.getSize();
    }

    @Override
    public String toString(){
        StringBuilder str = new StringBuilder();
        str.append("Stack");
        str.append('[');
        for (int i = 0; i < array.getSize(); i++){
            str.append(array.get(i));
            str.append(',');
        }
        str.append(']');
        str.append("top");
        return  str.toString();
    }
}
