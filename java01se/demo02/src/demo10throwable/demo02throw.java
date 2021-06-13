package demo10throwable;

public class demo02throw {
    public static void main(String[] args) {
      /*  int[] arr=null;
        int i = get(arr, 0);
        System.out.println(i);*/
        //只会报一个异常
        int[] array={1,2,3};
        int i1= get(array, 3);
        System.out.println(i1);
    }
    public static  int get(int[] index,int num)
    {
        if (index==null)
        {
            throw new NullPointerException("传递的数组的值为NULL");
        }
        if(num<0||num>=index.length)
        {
            throw new ArrayIndexOutOfBoundsException("数组越界");
        }
        System.out.println("后续步骤");
        return 0;
    }
}
