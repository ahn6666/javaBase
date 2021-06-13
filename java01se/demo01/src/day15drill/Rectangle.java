package day15drill;
//计应1909吕孟玲 矩形
public class Rectangle extends Shape{
    private  double lon;//长
    private  double wide;//宽
    private  boolean isSquare;//是否是正方型
    //创建无参 和全参
    public Rectangle() {
    }

    public Rectangle(double lon, double wide) {
        this.lon = lon;
        this.wide = wide;
    }

    public Rectangle(double lon, double wide, boolean isSquare) {
        this.lon = lon;
        this.wide = wide;
        this.isSquare = isSquare;
    }
    //设置set get方法
    public double getLon() {
        return lon;
    }

    public void setLon(double lon) {
        this.lon = lon;
    }

    public double getWide() {
        return wide;
    }

    public void setWide(double wide) {
        this.wide = wide;
    }

    public boolean isSquare() {
        return isSquare;
    }

    public void setSquare(boolean square) {
        isSquare = square;
    }

    //判断是否时正方形
    public boolean judgeIsSquare()
    {
        if (lon==wide)
            return true;
        else return false;
    }
    //求体积
    public double getArea()
    {
        //先判断是否是正方体
        if (judgeIsSquare())
        {
            double a=lon*lon;
            super.setArea(a);
            return a;
        }else
        {
            double a=lon*wide;
            super.setArea(a);
            return  a;
     }
    }
    //求周长
    public double getPerimeter()
    {
        double a=2*(lon+wide);
        super.setPerimeter(a);
        return a;
    }

}
