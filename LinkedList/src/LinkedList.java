public class LinkedList<E> {

    private class Node {
        public E e;
        public Node next;

        public Node(E e, Node next){
            this.e = e;
            this.next = next;
        }

        public Node(E e){
            this(e, null);
        }

        public Node(){
            this(null, null);
        }

        @Override
        public String toString(){
            return e.toString();
        }
    }

    private Node dummyHead;
    private int size;

    public LinkedList(){
        dummyHead = new Node(null, null);
        size = 0;
    }

    /**
     * 获取容量
     * @return
     */
    public int getSize(){
        return size;
    }

    /**
     * 是否为空
     * @return
     */
    public boolean isEmpty(){
        return size == 0;
    }

    /**
     * 添加元素
     * @param index
     * @param e
     */
    public void add(int index, E e){
        if(index < 0 || index > size)
            throw new IllegalArgumentException("Add failed, Illegal Index.");

        Node prev = dummyHead;
        for (int i = 0; i < index; i++)
            prev = prev.next;

        Node node = new Node(e);
        node.next = prev.next;
        prev.next = node;
        size ++;
    }

    /**
     * 添加第一个元素
     * @param e
     */
    public void addFirst(E e){
        add(0, e);
    }

    /**
     * 添加最后一个元素
     * @param e
     */
    public void addLast(E e){
        add(size, e);
    }

    /**
     * 获取索引位置的元素
     * @param index
     * @return
     */
    public E get(int index){
        if(index < 0 || index >= size)
            throw new IllegalArgumentException("index out of bound!");

        Node cur = dummyHead.next;
        for(int i = 0; i < index; i ++){
            cur = cur.next;
        }
        return cur.e;
    }

    /**
     * 获取第一个元素
     * @return
     */
    public E getFirst(){
        return get(0);
    }

    /**
     * 获取最后一个元素
     * @return
     */
    public E getLast(){
        return get(size - 1);
    }

    /**
     * 更新一个元素
     * @param index
     * @param e
     */
    public void set(int index, E e){
        if(index < 0 || index >= size)
            throw new IllegalArgumentException("index out of bound!");

        Node cur = dummyHead.next;
        for(int i = 0; i < index; i ++){
            cur = cur.next;
        }
        cur.e = e;
    }

    /**
     * 是否包含某个元素
     * @param e
     * @return
     */
    public boolean contains(E e){
        Node cur = dummyHead.next;
        while (cur != null){
            if(cur.e.equals(e))
                return true;
            cur = cur.next;
        }
        return false;
    }

    /**
     * 删除元素
     * @param index
     * @return
     */
    public E remove(int index){
        if(index < 0 || index >= size)
            throw new IllegalArgumentException("index out of bound!");

        Node prev = dummyHead;
        for(int i = 0; i < index; i ++)
            prev = prev.next;
        Node ret = prev.next;
        prev.next = ret.next;

        ret.next = null;
        size --;
        return ret.e;
    }

    public E removeFirst(){
        return remove(0);
    }

    public E removeLast(){
        return remove(size - 1);
    }

    @Override
    public String toString(){
        StringBuilder str = new StringBuilder();
        Node cur = dummyHead.next;
        while (cur != null) {
            str.append(cur.e + "->");
            cur = cur.next;
        }
        str.append("NULL");

        return str.toString();
    }
}
