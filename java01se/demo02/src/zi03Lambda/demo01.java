package zi03Lambda;
/*	表达式的标准格式：
	由三部分组成：
	a:一些参数
	b：一个箭头
	c: 一段代码
格式：（参数列表）->{一些重写方法的代码}；*/
//无参数
public class demo01 {
    public static void main(String[] args){
        methon(new demo01imp() {
            @Override
            public void ml() {
                System.out.println("吃饭饭");
            }
        });

      methon(()->{
          System.out.println("睡觉觉");
      });
    }
    public static  void methon(demo01imp demo01imp){
        demo01imp.ml();
    }
}
