package day04Static;

public class static011 {
    public static void main(String[] args) {
        static01 one=new static01("黄蓉",18);
        static01 two=new static01("郭靖",20);
        one.room="教室是101";
        System.out.println(one.getName()+"年龄是" +one.getAge()+"班级是"+one.room+"学号是"+one.getId());
        System.out.println(two.getName()+"年龄是" +two.getAge()+"班级是"+two.room+"学号是"+two.getId());
    }
}
