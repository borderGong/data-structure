public class Array {
    private int[] data;
    private int size;

    /**
     * 构造函数
     * @param capacity
     */
    public Array(int capacity){
        data = new int[capacity];
        size = 0;
    }

    /**
     * 构造函数
     */
    public Array(){
        this(10);
    }

    /**
     * 获取数组的容量
     * @return
     */
    public int getCapacity(){
        return size;
    }

    /**
     * 向数组中插入元素
     * @param index
     * @param e
     */
    public void append(int index, int e){
        if(index < 0 || index >= data.length){
            throw new IllegalArgumentException("Array append failed, index should be index < 0 || index >= data.length");
        }
        if(size == data.length){
            throw new IllegalArgumentException("Array append failed, Array has been out of bound!");
        }
        for(int i = size - 1; i > index; i --){
            data[i+1] = data[i];
        }
        data[index] = e;
        size ++;
    }

    /**
     * 向数组头部插入元素
     * @param e
     */
    public void appendFirst(int e){
        append(0, e);
    }

    /**
     * 向数组尾部插入元素
     * @param e
     */
    public void appendLast(int e){
        append(size, e);
    }

    /**
     * 获取数组元素
     * @param index
     * @return
     */
    int get(int index){
        if(index < 0 || index >= size){
            throw new IllegalArgumentException("Array append failed, index should be index < 0 || index >= size");
        }
        return data[index];
    }

    /**
     * 设置数组中的元素
     * @param index
     * @param e
     */
    void set(int index, int e){
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
    int find(int e){
        for(int i = 0; i < size; i ++){
            if(e == data[i]){
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
    boolean contain(int e){
        int index = find(e);
        return index >= 0;
    }

    /**
     * 删除索引位置的元素
     * @param index
     * @return
     */
    int remove(int index){
        if(index < 0 || index >= size){
            throw new IllegalArgumentException("Array remove fail, cannot find e");
        }
        int element = data[index];
        for(int i = index; i < size - 1; i ++){
            data[i] = data[i+1];
        }
        size --;
        return element;
    }

    /**
     * 删除第一个元素
     * @return
     */
    int removeFirst(){
        return remove(0);
    }

    /**
     * 删除最后一个元素
     * @return
     */
    int removeLast(){
        return  remove(size - 1);
    }

    /**
     * 删除数组元素
     * @param e
     * @return
     */
    int removeElement(int e){
        int index = find(e);
        return remove(index);
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append("data:");
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
