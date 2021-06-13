package demo10throwable;

import java.util.Scanner;

public class drill {
   static String[] user={"李三","张四","王五"};

    public static void main(String[] args) throws ResException.demoException {
        Scanner one=new Scanner(System.in);
        System.out.println("请输入您注册的名字");
        String next = one.next();
        methon(next);
    }
   public static void methon(String name) throws ResException.demoException {
       for (String s : user) {
          /* if(s.equals(name))
           {
               throw new  ResException.demoException("用户名已经注册");
           }*/
           try {
               if (s.equals(name))
               {
                   throw new  ResException.demoException("用户名已经注册");
               }
           }catch(ResException.demoException e){
                e.printStackTrace();
                return;
           }
       }
       System.out.println("注册成功");
   }


}
