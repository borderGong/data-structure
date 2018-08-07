import java.util.Random;

public class Main {
    public static double testQueue(Queue q, int counter){

        long start = System.nanoTime();
        Random rnd = new Random();
        for(int i = 0; i < counter; i ++)
            q.enqueue(rnd.nextInt(Integer.MAX_VALUE));
        for(int i = 0; i < counter; i ++)
            q.dequeue();
        long end = System.nanoTime();

        return (end - start) / 1000000000.0;
    }
    public static void main(String[] args) {

        int optCount = 100000;
        ArrayQueue<Integer> queue1 = new ArrayQueue<>();
        double time1 = testQueue(queue1, optCount);
        System.out.println(time1);

        LoopQueue<Integer> queue2 = new LoopQueue<>();
        double time2 = testQueue(queue2, optCount);
        System.out.println(time2);


    }
}
