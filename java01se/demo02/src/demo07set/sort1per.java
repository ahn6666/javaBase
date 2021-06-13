package demo07set;

public class sort1per implements Comparable<sort1per>{
    private String name;
    private int age;

    public sort1per() {
    }

    public sort1per(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "sort1per{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(sort1per o) {
       // return 0;
        return this.age-o.age;//升序
    }
}
