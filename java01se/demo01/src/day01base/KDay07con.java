package day01base;

import java.util.Random;
import java.util.Scanner;

public class KDay07con {
    public static void main(String[] args) {
        //实现打印指定行数的空心菱形的功能
        /*
        ---*
        --*-*
        -*---*
        *-----*
        -*---*
        --*-*
        ---*
         */
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                if (j == 1 || j == 2 * i - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println("");
        }
        for (int i = 3; i >= 1; i--) {
            for (int j = 1; j <= 4 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 2 * i - 1; j >= 1; j--) {
                if (j == 1 || j == 2 * i - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }


        System.out.println("--打印扫雷的地图。");

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入行");
        int i = scanner.nextInt();//输入行
        System.out.println("请输入列");
        int j = scanner.nextInt();//输入列
        int[][] a = new int[i][j];
        for (int k = 0; k < i; k++) {
            for (int l = 0; l < j; l++) {
                a[k][l] = (int) (Math.random() * 2);
            }
        }
        //标记0为雷,剩下的为数字
        for (int k = 0; k < i; k++) {
            for (int l = 0; l < j; l++) {
                int count = 0;
                if (a[k][j] != 0) {
                    if (k - 1 >= 0 &&l- 1 >= 0) {
                        if (a[k - 1][j - 1] == 1) {
                            count++;
                        }
                    }
                    if (k - 1 >= 0) {
                        if (a[k - 1][j +1] == 1) {
                            count++;
                        }
                    }
                    if (l - 1 >= 0) {
                        if (a[k - 1][j - 1] == 1) {
                            count++;
                        }
                    }
                    if (k - 1 >= 0 && k - 1 >= 0) {
                        if (a[k - 1][j - 1] == 1) {
                            count++;
                        }
                    }

                }
            }
        }
        //打印随机雷

            for (int k = 0; k < i; k++) {
                for (int l = 0; l < j; l++) {
                    System.out.print(a[k][l]);
                }
                System.out.println("");
            }




    }
}
