package demo02pack;
/*	构造方法：
      包装类
	Integer(int value)构造一个新分配的Integer对象，它表示指定的int值。
	Integer(String s)构造一个新分配的Integer对象，它表示String参数所指示的int值。
				传递的字符串，必须是基本类型的字符串否则会抛出异常  “100”正确 “a”异常
	静态方法：
	Static Integer valueOf(int i)返回一个表示指定的int 值的Integer实例。
	Static Integer valueOf(String s)返回保存指定的String 的值的Integer对象。
拆箱：在包装类中取出基本类型的数据（包装类->基本类型的数据）
	成员方法：
*/
public class demo01 {
    public static void main(String[] args) {
        Integer one=new Integer(1);
        System.out.println(one);
        Integer one2=new Integer("1");
        System.out.println(one2);
        Integer one3 = Integer.valueOf(1);
        System.out.println(one3);
        Integer one4 = Integer.valueOf("1");
        System.out.println(one4);

       // Integer one5=Integer.valueOf("a");
//        System.out.println(one5);//NumberFormatException

        //拆箱
        int i = one.intValue();
        System.out.println(i);
    }
}
