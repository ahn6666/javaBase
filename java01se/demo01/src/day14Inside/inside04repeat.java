package day14Inside;
//如果出现了重名现象，那么格式是：外部类名称.this.外部类成员变量名
public class inside04repeat {
    public static void main(String[] args) {
        inside03repeat.repeat obj=new inside03repeat().new repeat();
        obj.methon();

    }
}
