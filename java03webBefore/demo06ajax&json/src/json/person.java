package json;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreType;

import java.util.Date;

public class person {
    private String name;
    private int age;
    private String sex;
    //@JsonIgnore//忽略
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date bir;

    public person() {
    }

    public person(String name, int age, String sex, Date bir) {
        this.name = name;
        this.age = age;
        this.sex = sex;
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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Date getBir() {
        return bir;
    }

    public void setBir(Date bir) {
        this.bir = bir;
    }

    @Override
    public String toString() {
        return "person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", bir=" + bir +
                '}';
    }
}
