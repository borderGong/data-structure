public class Array<E> {
    private E[] data;
    private int size;

    /**
     * 构造函数
     * @param capacity
     */
    public Array(int capacity){
        data = (E[]) new Object[capacity];
        size = 0;
    }

    /**
     * 构造函数
     */
    public Array(){
        this(10);
    }

    /**
     * 获取数组实际长度
     * @return
     */
    int getSize(){
        return size;
    }
    /**
     * 获取数组的容量
     * @return
     */
    public int getCapacity(){
        return data.length;
    }

    /**
     * 判断数组是否为空
     * @return
     */
    public boolean isEmpty(){
        return data.length == 0;
    }

    /**
     * 向数组中插入元素
     * @param index
     * @param e
     */
    public void append(int index, E e){
        if(index < 0){
            throw new IllegalArgumentException("Array append failed, index should be index < 0 || index >= data.length");
        }
        if(size == data.length){
            resize(data.length * 2);
        }
        for(int i = size - 1; i > index; i --){
            data[i+1] = data[i];
        }
        data[index] = e;
        size ++;
    }

    /**
     * 改编数组容量
     * @param capcity
     */
    private void resize(int capcity){
        E[] newArr = (E[]) new Object[capcity];
        for(int i = 0; i < size; i ++){
            newArr[i] = data[i];
        }
        data = newArr;
    }


    /**
     * 向数组头部插入元素
     * @param e
     */
    public void appendFirst(E e){
        append(0, e);
    }

    /**
     * 向数组尾部插入元素
     * @param e
     */
    public void appendLast(E e){
        append(size, e);
    }

    /**
     * 获取数组元素
     * @param index
     * @return
     */
    public E get(int index){
        if(index < 0 || index >= size){
            throw new IllegalArgumentException("Array append failed, index should be index < 0 || index >= size");
        }
        return data[index];
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
     * 设置数组中的元素
     * @param index
     * @param e
     */
    void set(int index, E e){
        if(index < 0 || index >= size){
            throw new IllegalArgumentException("Array append failed, index should be index < 0 || index >= size");
        }
        data[index] = e;
    }

    /**
     * 查找e元素的索引位置
     * @param e
     * @return
     */
    int find(E e){
        for(int i = 0; i < size; i ++){
            if(e.equals(data[i])){
                return i;
            }
        }
        return  -1;
    }

    /**
     * 判断是否包含某个元素
     * @param e
     * @return
     */
    boolean contain(E e){
        int index = find(e);
        return index >= 0;
    }

    /**
     * 删除索引位置的元素
     * @param index
     * @return
     */
    public E remove(int index){
        if(index < 0 || index >= size){
            throw new IllegalArgumentException("Array remove fail, cannot find e");
        }
        E element = data[index];
        for(int i = index; i < size - 1; i ++){
            data[i] = data[i+1];
        }
        size --;
        if(size <= data.length / 2){
            resize(data.length / 2);
        }
        return element;
    }

    /**
     * 删除第一个元素
     * @return
     */
    public E removeFirst(){
        return remove(0);
    }

    /**
     * 删除最后一个元素
     * @return
     */
    public E removeLast(){
        return  remove(size - 1);
    }

    /**
     * 删除数组元素
     * @param e
     * @return
     */
    E removeElement(E e){
        int index = find(e);
        return remove(index);
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append("data:");
        String sizeStr = String.format("size is %d, capcity is %d", size, data.length);
        str.append(sizeStr);
        str.append("[");
        for(int i = 0; i < size; i ++){
            str.append(data[i]);
            if(i != size - 1){
                str.append(",");
            }
        }
        str.append("]");
        return  str.toString();
    }
}
