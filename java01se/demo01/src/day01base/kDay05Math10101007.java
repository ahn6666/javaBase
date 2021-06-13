package day01base;

import java.util.Scanner;

public class kDay05Math10101007 {
    public static void main(String[] args) {
        //1、查找某个整数
        //定义一个长度为 10 的整型数组 nums ，循环输入 10 个整数。 然后将输
        //入一个整数，查找此整数，找到输出下标， 没找到给出提示。
        int[] nums=new int[10];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < nums.length; i++) {
            System.out.println("请输入第"+i+"个数");
          nums[i] = scanner.nextInt();
        }
        System.out.println("请输入一个数字，进行查找");
        int num = scanner.nextInt();
        for (int i = 0; i < nums.length; i++) {
            if (num==nums[i]){
                System.out.println("找到的输出下标"+i);
                break;
            }
        }
        //2、找出数组的最值
        //定义一个长度为 10 的整型数组 nums ，循环输入 10 个整数。输出数组
        //的最大值、最小值。
        int max=nums[0];
        int min=nums[0];
        for (int i = 0; i < nums.length; i++) {
            max=max>nums[i]?max:nums[i];
            min=min<nums[i]?min:nums[i];
        }
        System.out.println("最大值"+max);
        System.out.println("最小值"+min);
        //3、两数之和
        //给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为
        //目标值的那两个整数，并输出他们的数组下标
        //假设每种输入只会对应一个答案，不能重复利用这个数组中同样的元素。
        //示例:
        //给定 nums = [2, 7, 11, 15], target = 9
        //因为 nums[0] + nums[1] = 2 + 7 = 9
        //所以输出 0，1
        int target=10;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j <nums.length ; j++) {
                if (nums[i]+nums[j]==target){
                    System.out.println("所以下标为"+i+","+j);
                }
            }
        }

        //4、排序并查找
        //对数组{1，3，9，5，6，7，15，4，8}进行排序，然后使用二分查找 6 并输出排序后的下标。
        System.out.println("-------------");
        int[] one={1,3,9,3,5,6,7,15,4,8};
        int temp;
        //进行冒泡排序
        for (int i = 0; i < one.length; i++) {
            for (int j =i+1; j < one.length; j++) {
             if (one[j]<one[i]){
                temp=one[j];
                one[j]=one[i];
                one[i]=temp;
             }
            }
        }
        for (int i = 0; i < one.length; i++) {
            System.out.print(one[i]+" ");
        }

        //进行二分查找
        int maxIndex=one.length-1;
        int minIndex=0;
        int centerIndex=(maxIndex+minIndex)/2;
        int six=6;
        while (true)
        {
            if (six>one[centerIndex]){
                //目标数比中间数大时
                minIndex=minIndex+1;

            }else if (six<one[centerIndex]){
                //目标数比中间数小时
                maxIndex=maxIndex-1;
            }else{
                System.out.println("找到了下标为" +centerIndex);
                break;
            }
            if (minIndex>maxIndex){
                System.out.println("找不到此数");
                break;
            }
            centerIndex=(maxIndex+minIndex)/2;
        }

        System.out.println("--------移动00");
        //5、移动零
        //给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保
        //持非零元素的相对顺序。
        //输入: [0,1,0,3,12] 输出: [1,3,12,0,0]
        int[] two={0,1,0,3,12};
        int k=0;
        //先把0排序，排到最后
        for (int i = 0; i < two.length-k; i++) {
            if (two[i]==0)
            {
                k++;
                temp=two[i];
                two[i]=two[two.length-k];
                two[two.length-k]=temp;
            }
        }
        //然后把剩余的排序
        for (int i = 0; i < two.length-k; i++) {
            for (int j =i+1; j < two.length-k; j++) {

                 if (two[j]<two[i]){
                    temp=two[j];
                    two[j]=two[i];
                    two[i]=temp;
                }
            }
        }
        for (int i = 0; i < two.length; i++) {
            System.out.print(two[i]+" ");
        }
    }
}
