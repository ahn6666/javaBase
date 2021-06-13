package day15drill;

public class TestDome {
    public static void main(String[] args) {
        Shape s,s1;
        Rectangle r= new Rectangle(13.5, 14);//创建矩形队对象
        s=r;
        System.out.println("矩形的面积是"+s.getArea());
        System.out.println("矩形的周长是"+s.getPerimeter());
        Circle C = new Circle(10);//创建圆形对象
        s1=C;
        System.out.println("圆形的周长是"+s1.getArea());
        System.out.println("圆形的面积是"+s1.getPerimeter());
    }
}
