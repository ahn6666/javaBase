package day14Inside;
//接口作为成员变量
public class inside14main {
    public static void main(String[] args) {
        inside14interface obj=new inside14interface();
        obj.setName("地理");
        /*obj.setLei(new inside14zi());
        obj.use();*/
        //使用匿名对象
       /* inside14inter anoy=new inside14inter() {
            @Override
            public void menthon() {
                System.out.println("pia~pia");
            }
        };
        obj.setLei(anoy);
        obj.use();*/
        obj.setLei(new inside14inter() {
            @Override
            public void menthon() {
                System.out.println("biu~pia");
            }
        });
        obj.use();
    }
}
