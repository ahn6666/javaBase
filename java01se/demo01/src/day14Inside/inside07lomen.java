package day14Inside;
//	局部内部类，如果希望访问所在方法的局部变量，那么这个局部变量必须是【有效final的】
/*	原因：1、new出来的对象在堆内存中
		  2、局部变量是跟着方法走的，在栈内存当中
		  3、方法运行结束之后，立刻出栈，局部变量就会立即小时
          4、但是new出来的对象会在堆当中持续存在，直到垃圾回收消失*/
public class inside07lomen {
    public void inslo(){
        int num=10;
//        num=20;
        class inner{
            public  void inner1(){
                System.out.println(num);

            }
        }
    }
}
