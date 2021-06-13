package el;

import java.text.SimpleDateFormat;
import java.util.Date;

//对应的是el3.jsp需要的对象
public class use {
    private String name;
    private  int age;
    private Date bir;

    public use() {
    }

    public use(String name, int age, Date bir) {
        this.name = name;
        this.age = age;
        this.bir = bir;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getBir() {


        return this.bir;
    }
    //逻辑视图
    public String getBirthday()
    {
        SimpleDateFormat S = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return S.format(bir);
    }
    public void setBir(Date bir) {
        this.bir = bir;
    }
}
