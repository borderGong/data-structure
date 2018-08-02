public class ArrayQueue<E> implements Queue<E> {
    private Array<E> queue;

    public ArrayQueue(int capcity){
        queue = new Array<>(capcity);
    }

    public ArrayQueue(){
        queue = new Array<>();
    }

    @Override
    public void enqueue(E e){
        queue.appendLast(e);
    }

    @Override
    public E dequeue(){
        return queue.removeFirst();
    }

    @Override
    public E getFront(){
        return queue.getFirst();
    }

    @Override
    public int getSize() {
        return queue.getSize();
    }

    @Override
    public boolean isEmpty(){
        return queue.isEmpty();
    }

    @Override
    public String toString(){
        StringBuilder str = new StringBuilder();
        str.append("queue: front");
        str.append('[');
        for(int i = 0; i < queue.getSize(); i ++){
            str.append(queue.get(i));
            str.append(',');
        }
        str.append(']');
        str.append("tail");
        return str.toString();
    }
}
