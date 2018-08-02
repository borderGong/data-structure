public class Main {

    public static void main(String[] args) {
	// write your code here
        ArrayQueue<Integer> queue = new ArrayQueue<>();
        for(int i = 0; i < 10; i ++){
            queue.enqueue(i);
//            System.out.println(queue.toString());
        }
        System.out.println(queue.toString());
        queue.dequeue();
        System.out.println(queue.toString());


    }
}
