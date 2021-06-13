package demo01object;

import java.util.Objects;

public class demo02person {
    private String name;
    private int num;

    public demo02person() {
    }

    public demo02person(String name, int num) {
        this.name = name;
        this.num = num;
    }


    @Override
    public String toString() {
        return "demo02person{" +
                "name='" + name + '\'' +
                ", num=" + num +
                '}';
    }
    //隐含一个多态
    /*父类对象
    public boolean equals(Object obj) {
        return (this == obj);
    }*/
   /* @Override
    public boolean equals(Object obj)
    {
        //如果是空 直接返回false 提高程序效率
        if(obj==null) return false;
        //如果等于它本身 直接返回true 提高程序效率
        if(obj==this) return true;
        //判断一个demo01person 转型是否可以 防止出现ClassCastException
        if (obj instanceof demo02person)
        {
            //强制向下转型 子类名称 对象名=（子类名称）父类对象；
            demo02person p=(demo02person)obj;
            boolean b=this.name.equals(p.name)&&this.num==p.num;
            return  b;
        }
        //不是person 直接返回false
        return false;

    }*/
   //程序自动生成

/*
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        demo02person that = (demo02person) o;

        if (num != that.num) return false;
        return name != null ? name.equals(that.name) : that.name == null;
    }*/

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        // getClass() != o.getClass() 使用反射技术 判断o是否为person 类型 等效于obj instanceof demo02person
        if (o == null || getClass() != o.getClass()) return false;
        demo02person that = (demo02person) o;
        return num == that.num &&
                Objects.equals(name, that.name);
    }


    public String getName() {
        return name;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public void setName(String name) {
        this.name = name;
    }
}
