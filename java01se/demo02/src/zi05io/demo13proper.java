package zi05io;

import java.util.Properties;
import java.util.Set;

/*Propertise:
	Java.util.propertise集合extends hashtable<k,v>implements Map<k,v>
	properties类表示了一个持久的属性集。properties可保存在流中或从流中加载
	properties集合是一个唯一和IO流相结合的集合
		可以使用propertise集合中的方法store 把集合中的临时数据，持久化写入到硬盘中存储
		可以使用propertise集合中的方法load,把硬盘中保存的文件（键值对），读取到集合中使用
		属性列表中给每个键及其对应值都是一个字符串。
		properties集合是一个双列集合，key和value默认都是字符串

	使用propertise集合存储数据 遍历取出properties集合中的数据
	propertise集合是一个双列集合 key和value默认都是字符串
	propertise集合有一些操作字符串的特有方法
		Object setproperty(String key,String value) 调用Habletable的方法put
		String getproperty(String key)通过Key找到value 值，此方法相当于map集合中的get(key)方法
        Set<String> stringPropertyNames() 返回此属性列表中的键集，其中该键及其对应值是字符串，=map集合中的keyset*/
public class demo13proper {
    public static void main(String[] args) {
            methon();
    }

    private static void methon() {
        Properties obj = new Properties();
        obj.setProperty("迪丽热巴","18");
        obj.setProperty("古力娜扎","18");
        obj.setProperty("马儿扎哈","18");
        obj.setProperty("蒙娜丽莎","18");
       Set<String> ob= obj.stringPropertyNames();
        for (String s : ob) {

            System.out.println(s + "=" + obj.getProperty(s));
        }
    }
}
