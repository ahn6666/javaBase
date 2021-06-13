package day15drill;
//计应1909吕孟玲
public class Circle extends Shape{
    private double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    //重写父类的方法
    public  double getArea()
    {
        double a=Math.PI*radius*radius;
        super.setArea(a);
        return a;
    }
    public double getPerimeter() {
        double a=Math.PI*2*radius;
        super.setPerimeter(a);
        return a;
    }
}
