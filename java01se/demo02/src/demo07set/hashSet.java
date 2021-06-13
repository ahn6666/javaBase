package demo07set;

public class hashSet {
    public static void main(String[] args) {
        person p=new person();
        int i = p.hashCode();
        System.out.println(i);//1967205423
        person p1=new person();
        int i1 = p1.hashCode();
        System.out.println(i1);//42121758


        System.out.println(p);//person{name='null', num=0}
        System.out.println(p1);//person{name='null', num=0}
        System.out.println(p==p1);

        System.out.println("==========");
        //String 的哈希值
        String obj=new String("ABC");
        String obj1=new String("ABC");
        System.out.println(obj.hashCode());//64578
        System.out.println(obj1.hashCode());//64578
        System.out.println(obj1==obj);//false
        System.out.println("重地".hashCode());//1179395
        System.out.println("通话".hashCode());//1179395

    }
}
