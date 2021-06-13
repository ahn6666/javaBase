package day11Multi;
/*对象的向下转型，其实是一个【还原】的动作。
格式：子类名称 对象名=（子类名称）父类对象；
含义：将父类对象，【还原】成为本来的子类对象。
对象 instanceof 类名称
这将会得到一boolean值结果，也判断前面的对象能不能当做后面类型的实例。

*/
public class multi05zzifu {
    public static void main(String[] args) {
        //向下转型
        multi05fu animal=new multi05zi();
        animal.eat();//猫吃鱼

        //向上转型
        if (animal instanceof  multi05zi)
        {
            multi05zi cat=(multi05zi)animal;
            cat.methonfu();
        }//这是刚
    }
}
