package day04Static;
//static修饰成员变量
public class static01 {
        private String name;
        private int age;
        //public下面的可写可不
     static String room;
        private int id;
        private static int count=0;
       //构造无参函数
        public static01() {
          count++;
    }


    public static01(String name, int age) {
        this.name = name;
        this.age = age;
        this.id=++count;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

