package day10Interface;
//吕孟玲 定义接口1
public class one18zi implements oneFuarea{
    int x,y;
    void set_xy(int x, int y)
    {
        this.y=y;
        this.x=x;
    }

    @Override
    public double area() {
        double s;
        s=x*y;
        return s;
    }
}
