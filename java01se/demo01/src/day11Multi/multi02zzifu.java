package day11Multi;
//1:直接通过对象名称访问成员变量：看等号左边是谁，优先用谁，没有则向上找。
//2:间接通过成员方法访问成员变量：看该方法属于谁，优先用谁，没有则向上找。
public class multi02zzifu {
    public static void main(String[] args) {
        multi02fu obj=new multi02zi();
        System.out.println(obj.num);//10
        obj.show();//20
    }
}