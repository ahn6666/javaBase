package demo10throwable;

import java.util.List;

/*		1:多个异常分别处理
		2：多个异常一次捕获 多次处理
        3: 多个异常 一次捕获一次处理*/
public class demo07 {
    public static void main(String[] args) {
        /*int [] arr={1,2,3};
        System.out.println(arr[3]);//ArrayIndexOutOfBoundsException*/
        /*List<Integer> array= List.of(1,2,3);//IndexOutOfBoundsException
        System.out.println(array.get(3));*/
        try{
            int [] arr={1,2,3};
            System.out.println(arr[3]);
            List<Integer> array= List.of(1,2,3);
            System.out.println(array.get(3));}
      /*  catch (IndexOutOfBoundsException e)
        {
            System.out.println(e);
        }catch (ArrayIndexOutOfBoundsException e)
            {
                System.out.println(e);
            } --->错误 因为*ArrayIndexOutOfBoundsException extends ArrayIndexOutOfBoundsException/
*/      catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e);
        }
        catch (IndexOutOfBoundsException e)
        {
            System.out.println(e);
        }
    }
}
