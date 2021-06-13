package demo08Map;

import java.util.Objects;

public class person {
   private String name;
   private int num;

    public person() {
    }

    public person(String name, int num) {
        this.name = name;
        this.num = num;
    }

    @Override
    public String toString() {
        return "person{" +
                "name='" + name + '\'' +
                ", num=" + num +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        person person = (demo08Map.person) o;
        return num == person.num &&
                Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, num);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}
