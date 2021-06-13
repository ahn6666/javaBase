package day02api;

public class api05arr {
    public static void main(String[] args) {
        api05student[] stu=new api05student[3];
        api05student one=new api05student("迪丽热巴",18);
        api05student two=new api05student("古力娜扎",18);
        api05student three=new api05student("易烊千玺",18);
        stu[0]=one;
        stu[1]=two;
        stu[2]=three;
        System.out.println(stu[0]);
        System.out.println(stu[1]);
        System.out.println(stu[2]);
        System.out.println(stu[0].getName());
    }


}
