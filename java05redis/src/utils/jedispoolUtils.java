package utils;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

//JedisPool工具类
/*
* 加载配置工具，配置连接池的参数
* 提供获取连接方式*/
public class jedispoolUtils {
    private  static  JedisPool jedisPool;
    //配置文件
    static {
        //读取配置文件
        InputStream is = jedispoolUtils.class.getClassLoader().getResourceAsStream("jedis.properties");
        //创建pro对象
        Properties pro = new Properties();
        try {
            pro.load(is);
        } catch (IOException e) {
            e.printStackTrace();
        }
        JedisPoolConfig jedisPoolConfig = new JedisPoolConfig();
        jedisPoolConfig.setMaxTotal(Integer.parseInt(pro.getProperty("maxTotal")));
        jedisPoolConfig.setMaxTotal(Integer.parseInt(pro.getProperty("maxIdle")));

        //初始话jedis
        jedisPool=new JedisPool(jedisPoolConfig,pro.getProperty("host"), Integer.parseInt(pro.getProperty("port")));
    }

        /*获取连接方法*/
    public static Jedis getJedis()
    {
        return jedisPool.getResource();
    }

}
