package zi06io;

import java.io.Serializable;

public class person implements Serializable {
    private static final long serialVersionUID=1L;
    private String name;
    public   int age;
   /*private static  String name;
    private   static  int age;*/
   /*private transient String name;
    private transient int age;*/
//zi06io.person; local class incompatible: stream classdesc serialVersionUID = 675864405494313661, local class serialVersionUID = 7135944314005508275
    public person() {
    }

    public person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
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
}
