package day01base;

public class kDay06Leader10101006 {
    public static void main(String[] args) {
        /*今天同学们相约一起爬山游玩，为了更好的进行这场活动，大家准备推举 一个人作为出游的临时队长。
        为了体现合理公平，大家提出了一个比较有趣的 规则。
        所有人围成一圈，顺序排号。从第一个人开始报数（从1到3报数）， 凡报到3的人退出圈子，剩下的人继续报数，最后留下的当选为队长。
         请你通过编写程序，求出一组人中的队长是原来第几位同学。
         */

        boolean[] person=new boolean[9];
        int k=0;
        for (int i = 0; i < person.length; i++) {
            person[i]=true;
        }
        while (true){
            int i=0,z=0;
            z=3-i;
            for ( i= k; i < person.length; i++) {
                if (person[i]==true)
                {
                    if ((i+z)%3==0)
                    {
                        person[i]=false;
                        k++;
                    }else{
                        System.out.println(i);
                        break;
                    }
                }

            }
            i=k;
        }

    }
}
