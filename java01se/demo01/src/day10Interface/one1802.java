package day10Interface;
//定义接口2 吕孟玲
public class one1802 implements oneFuarea{
    int r;
    void set_r(int r)//设置值
    {
        this.r=r;
    }
    @Override//重写
    public double area() {
      double s;
      s=3.14*r*r;
        return s;
    }
}
