package day05Arrays;
//习题第二题  吕孟玲
public class arrrays03 {
    public static void main(String[] args) {
        int a [][]= new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                a [i][j]=1;  //赋值
            }
        }
        int sum=0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if(i==j||i+j==2)//对角元素 包括左对角和右对角
                {
                    sum=sum+a[i][j];
                }
            }
        }
        System.out.println(sum);
        }
}
