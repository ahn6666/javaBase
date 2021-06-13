package day08Abstract;

public  class abstract03 {
    static int x=10;
    static { x+=5;}

    public static void main(String[] args) {
        System.out.println(x);


        int j = 0;


        for (int k = 0; j + k != 10; j++, k++) {
            System.out.println(j + "," + k);


        }
    }
                 static { x/=3;}



/*
    public static void main(String[] args) {

        abstract final double a() ;
        abstract final double b ();



    }
    public final static native int w();*/

}