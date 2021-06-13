package day15drill;
//计应1909吕孟玲
// 创建父类
public class Shape {
    private double area;
    private double perimeter;
//构造全参
    public Shape(double area, double perimeter) {
        this.area = area;
        this.perimeter = perimeter;
    }
//构造无参
    public Shape() {
    }
//getset的构造
    public double getArea() {
        return area;
    }
    public void setArea(double area) {
        this.area = area;
    }
    public double getPerimeter() {
        return perimeter;
    }

    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }
}
