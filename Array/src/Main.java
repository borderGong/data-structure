public class Main {

    public static void main(String[] args) {
        // write your code here
        Array arr = new Array(20);
        for (int i = 0; i < 10; i++) {
            arr.appendLast(i);
        }

        System.out.println(arr.toString());
        arr.remove(1);
        System.out.println(arr.toString());
        int index = arr.find(5);
        System.out.println(index);

        boolean containElement = arr.contain(7);
        System.out.println(containElement);

        arr.remove(8);
        System.out.println(arr.toString());

        arr.appendLast(20);
        arr.appendLast(22);
        arr.appendLast(22);
        System.out.println(arr.toString());

        Person p1 = new Person(19, "jack");
        Person p2 = new Person(18, "tom");

        Array<Person> personArr = new Array(10);
        personArr.appendLast(p1);
        personArr.appendLast(p2);
        System.out.println(personArr.toString());
    }
}
