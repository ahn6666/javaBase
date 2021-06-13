package better;

public class ausu implements sale{

    @Override
    public String price(int money) {
        System.out.println("ausu的电脑价格为"+money);
        return "华硕电脑";
    }

    @Override
    public String ausu() {
        return "展示电脑";
    }
}
