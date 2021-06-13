package day11Multi;
//	• 如果子类重写了父类的方法，则上转型对象调用该方法时一定时重写后的方法
//如果子类重写定义了父类的同名字段，则上转型对象访问该字段是必定是父类本身的字段，不是子类定义的字段
public class multi03zzifu {
    public static void main(String[] args) {
            multi03fu obj=new multi03zi();
            obj.methon();//这是一个公共方法
            obj.methonFu();//这是父类独有的方法
            //看new的是谁，优先用谁，没有则向上找。
            //错误obj.methonZi();
    }
}