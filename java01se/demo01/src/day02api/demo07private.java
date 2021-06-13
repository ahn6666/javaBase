package day02api;

public class demo07private {
    String name;
    private int age;
    public void show()
    {
        System.out.println(name+age);
    }

    public void setAge(int age) {
        if(age>0&&age<100)
        {
            this.age = age;
        }else
        {
            System.out.println("该年龄不合理");
        }

    }
    public int getAge() {
        return age;
    }


}
