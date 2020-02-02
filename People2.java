public class People2 implements Comparable {
    public int age;
    public String name;

    public People2(int age , String name){
        this.age = age;
        this.name = name;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}