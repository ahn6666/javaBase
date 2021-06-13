package reflect01;

public class person {
    private  String name;
    private  int age;
    public  String pu1;
    public  String pu2;
    protected String p3;
    String p4;
    public person() {
    }

    public person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "person{" +
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

    public void eat()
    {
        System.out.println("eat>..");
    }
    public void eat(String name)
    {
        System.out.println("eat>.."+name);
    }
}
