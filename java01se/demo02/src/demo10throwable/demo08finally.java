package demo10throwable;

public class demo08finally {
    public static void main(String[] args) {
        int a=10;
        int methon = methon(a);
        System.out.println(methon);
    }

    private static int methon( int a) {

        try{
            return a;
        }catch (Exception e){
            System.out.println(e);
        }
        finally {
            a=100;
            return a;
        }
    }
}
