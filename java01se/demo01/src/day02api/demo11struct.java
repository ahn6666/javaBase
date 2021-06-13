package day02api;

public class demo11struct {
    private String name;
    private int age;
    public demo11struct()
    {
        System.out.println("==无参数构造成功了");
    }
    public demo11struct(int age,String name)
    {
        System.out.println("全参数构造成功了");
        this.age=age;
        this.name=name;
    }

   /* public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }*/

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

    public demo11struct(String name) {
        this.name = name;
    }

}
