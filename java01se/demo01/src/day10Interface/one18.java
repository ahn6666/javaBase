package day10Interface;
//接口的实例化 计应1909 吕孟玲
public class one18 {
    public static void main(String[] args) {
        int x=10,y=5;
        double ss1,ss2;
        one18zi aa=new one18zi();//接口1对象
        aa.set_xy(x,y);
        ss1 = aa.area();//调用方法
        System.out.println("矩形面积= "+ss1);//矩形面积= 50.0
        int r=5;
        one1802 bb=new one1802();//创建接口2对象
        bb.set_r(r);
        ss2=bb.area();//调用方法
        System.out.println("圆面积="+ss2);//圆面积=78.5
    }
}
