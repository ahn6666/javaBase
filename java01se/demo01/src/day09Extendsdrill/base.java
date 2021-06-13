package day09Extendsdrill;

public class base {
    private String name;
    private int num;

    public base() {
    }

    public base(String name, int num) {
        this.name = name;
        this.num = num;
    }
    public  void show()
    {
        System.out.println("我的名字是"+name +"余额为"+num);
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}
