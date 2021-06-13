package demo07set;

public class sort2per  {
    private String name;
    private int age;

    public sort2per() {
    }

    @Override
    public String toString() {
        return "sort2per{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public sort2per(String name, int age) {
        this.name = name;
        this.age = age;
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


}
