public class Person {
    int age;
    String name;
    public Person(int age, String name){
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString(){
        StringBuilder str = new StringBuilder();
        str.append("person name is");
        str.append(name);
        str.append("age is");
        str.append(String.format("%d", age));
        return str.toString();
    }
}
