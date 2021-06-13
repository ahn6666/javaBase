package day14Inside;

public class inside11lei {
    private String name;
    private int num;
    private inside12lei1 lei1;

    public inside11lei() {
    }

    public inside11lei(String name, int num, inside12lei1 lei1) {
        this.name = name;
        this.num = num;
        this.lei1 = lei1;
    }
    public void methon()
    {
        System.out.println(name +"年龄" +num +"做"+lei1.getWep());
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

    public inside12lei1 getLei1() {
        return lei1;
    }

    public void setLei1(inside12lei1 lei1) {
        this.lei1 = lei1;
    }
}
