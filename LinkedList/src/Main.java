public class Main {

    public static void main(String[] args) {
	// write your code here
        LinkedList<Integer> linkedList = new LinkedList<>();

        for(int i = 0; i < 10; i ++){
            linkedList.addFirst(i);
            System.out.println(linkedList.toString());
        }

        linkedList.add(6, 80);
        System.out.println(linkedList.toString());
    }
}
