public class LoopQueue<E> implements Queue<E> {
    private E[] data;
    private int front, tail;
    private int size;

    public LoopQueue(int capacity){
        data = (E[])new Object[capacity + 1];
        front = 0;
        tail = 0;
        size = 0;
    }

    public LoopQueue(){
        this(10);
    }

    @Override
    public boolean isEmpty(){
        return front == size;
    }

    public int getCapcacity(){
        return data.length - 1;
    }

    public int getSize(){
        return size;
    }

    /**
     * 入队
     * @param e
     */
    @Override
    public void enqueue(E e){
        if((tail + 1) % data.length == front)
            resize(data.length * 2);

        data[tail] = e;
        tail = (tail + 1) % data.length;
        size++;
    }

    @Override
    public E dequeue(){
        if(isEmpty())
            throw new IllegalArgumentException("cannot dequeue from an empty queue.");
        E e = data[front];
        data[front] = null;
        front = (front + 1) % data.length;
        size --;
        if(size == getCapcacity() / 4 && getSize() / 2 != 0 )
            resize(getCapcacity() / 2);

        return e;
    }

    @Override
    public E getFront(){
        if(isEmpty())
            throw new IllegalArgumentException("queue is empty!");
        return data[front];
    }

    /**
     * 数组扩/缩容
     * @param capacity
     */
    private void resize(int capacity){
        E[] newData = (E[])new Object[capacity];
        for(int i = 0; i < size - 1; i ++){
            newData[i] = data[(i + front) % data.length];
        }
        data = newData;
        front = 0;
        tail = size;
    }

    @Override
    public String toString(){
        StringBuilder str = new StringBuilder();
        str.append(String.format("queue size is %d, capacity is %d", size, getCapcacity()));
        str.append("front [");
        for(int i = 0; i < size - 1; i ++){
            str.append(data[(i + front) % data.length]);
            str.append(',');
        }
        str.append("] tail");
        return str.toString();
    }

    public static void main(String[] args) {
        LoopQueue<Integer> queue = new LoopQueue<>();

        for(int i = 0; i < 10; i ++){
            queue.enqueue(i);
//            System.out.println(queue.toString());
        }
        System.out.println(queue.toString());
        queue.dequeue();
        System.out.println(queue.toString());
    }
}
