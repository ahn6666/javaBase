package jedis;

import org.junit.Test;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;
import utils.jedispoolUtils;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class demo01test {
    @Test
    public void test1()
    {
        //进行字符串的操纵
        //获取连接
        Jedis jedis = new Jedis();
        //进行操作
        jedis.set("username","name");
        jedis.set("password","zhangsan");
        String username = jedis.get("username");
        System.out.println(username);
        //关闭连接
        jedis.close();
    }
    @Test
    public void test2()
    {
        //进行字符串的操纵
        //获取连接
        Jedis jedis = new Jedis();
        //进行操作
        //用于激活码 定时销毁
         jedis.setex("user", 20, "nihao");
        String user = jedis.get("user");
        System.out.println(user);
        //关闭连接
        jedis.close();
    }
    @Test
    public void test3()
    {
        //进行hash的操纵
        //获取连接
        Jedis jedis = new Jedis();
        //进行操作
        jedis.hset("hash","my","ml");
        String hget = jedis.hget("hash", "my");
        System.out.println(hget);
        jedis.hset("hash","you","xl");
        jedis.hset("hash","s","s");
        jedis.hset("hash","ss","s");
        Map<String, String> hash = jedis.hgetAll("hash");
        System.out.println(hash);
        //进行遍历
        Set<String> keySet = hash.keySet();
        for (String key : keySet) {
            String s = hash.get(key);
            System.out.println(key +","+ s);
        }
        //关闭连接
        jedis.close();
    }
    @Test
    public void test4()
    {
        //进行list的操纵
        //获取连接
        Jedis jedis = new Jedis();
        //进行操作
        jedis.lpush("list","A");
        jedis.lpush("list","b");
        jedis.lpush("list","c");
        jedis.lpush("list","d");
        jedis.rpush("list","A");
        jedis.rpush("list","b");
        jedis.rpush("list","c");
        jedis.rpush("list","d");

        List<String> list = jedis.lrange("list", 0, -1);
        System.out.println(list);
        jedis.rpop("list");
        jedis.rpop("list");
        System.out.println(jedis.lrange("list", 0, -1));
        //关闭连接
        jedis.close();
    }
        @Test
    public void test5()
    {
        //进行set的操纵
        //获取连接
        Jedis jedis = new Jedis();
        //进行操作
        jedis.sadd("set","a","b","c","d");
        Set<String> set = jedis.smembers("set");
        System.out.println(set);
        jedis.srem("set","a");
        System.out.println(jedis.smembers("set"));
        //关闭连接
        jedis.close();
    }


    @Test
    public void test6()
    {
        //进行sortedset的操纵
        //获取连接
        Jedis jedis = new Jedis();
        //进行操作
        jedis.zadd("sortedset",1,"张三");
        jedis.zadd("sortedset",2,"李四");
        jedis.zadd("sortedset",3,"王五");
        jedis.zadd("sortedset",0,"撇六");
        Set<String> sortedset = jedis.zrange("sortedset", 0, -1);
        System.out.println(sortedset);
        //关闭连接
        jedis.close();
    }


    @Test
    public void test7()
    {
        //进行Jedis连接池的操纵
        //创建配置对象
        JedisPoolConfig jedisPoolConfig = new JedisPoolConfig();
        jedisPoolConfig.setMaxTotal(50);
        jedisPoolConfig.setMaxIdle(10);
        //获取连接
        JedisPool jedisPool = new JedisPool();

        Jedis resource = jedisPool.getResource();
        resource.set("name","zhangsan");
        String name = resource.get("name");
        System.out.println(name);
        //归还
        resource.close();
        jedisPool.close();
    }


    @Test
    public void test8()
    {
        //进行jedispoolUtils连接池的操纵
        Jedis jedis = jedispoolUtils.getJedis();
        jedis.set("namew","awfad");
        jedis.close();
    }
}
