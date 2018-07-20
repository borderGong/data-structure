public class Main {

    public static void main(String[] args) {
        // write your code here
        Array arr = new Array(20);
        for (int i = 0; i < 10; i++) {
            arr.appendLast(i);
        }

        System.out.println(arr.toString());

        int index = arr.find(5);
        System.out.println(index);

        boolean containElement = arr.contain(7);
        System.out.println(containElement);

        arr.remove(8);
        System.out.println(arr.toString());
    }
}
