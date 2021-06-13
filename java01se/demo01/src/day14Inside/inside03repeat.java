package day14Inside;

public class inside03repeat {

    int num=10;
    public class repeat{
        int num=20;
        public void methon()
        {
            int num=30;
            System.out.println(num);
            System.out.println(this.num);
            System.out.println(inside03repeat.this.num);
        }
    }
}
