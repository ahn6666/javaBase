package json;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

public class test {
    @Test
    public void demo01() throws IOException {
        person person = new person();
        person.setAge(20);
        person.setName("张三");
        person.setBir(new Date());
        person.setSex("男");

        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.writeValue(new File("e:/one.txt"),person);

    }
    @Test
    public void demo02() throws IOException {
        person person = new person();
        person.setAge(20);
        person.setName("张三");
        person.setBir(new Date());
        person.setSex("男");

        ObjectMapper objectMapper = new ObjectMapper();
        String s = objectMapper.writeValueAsString(person);
        System.out.println(s);

    }
    @Test
    public void demo03() throws IOException {
        person person = new person();
        person.setAge(20);
        person.setName("张三");
        person.setBir(new Date());
        person.setSex("男");
        person person1 = new person();
        person1.setAge(20);
        person1.setName("张三");
        person1.setBir(new Date());
        person1.setSex("男");
        person person2 = new person();
        person2.setAge(20);
        person2.setName("张三");
        person2.setBir(new Date());
        person2.setSex("男");
        person person3 = new person();
        person3.setAge(20);
        person3.setName("张三");
        person3.setBir(new Date());
        person3.setSex("男");

        List<person> people = new ArrayList<>();
        people.add(person);
        people.add(person1);
        people.add(person2);
        ObjectMapper objectMapper = new ObjectMapper();
        String s = objectMapper.writeValueAsString(people);
        System.out.println(s);

    }
    @Test
    public void demo04() throws IOException {
        HashMap<Object, Object> objectObjectHashMap = new HashMap<>();
        objectObjectHashMap.put("name","zhad");
        objectObjectHashMap.put("sex","男");
        objectObjectHashMap.put("age",23);
        ObjectMapper objectMapper = new ObjectMapper();
        String s = objectMapper.writeValueAsString(objectObjectHashMap);
        System.out.println(s);

    }
    @Test
    public void demo05() throws IOException {
            String json="{\"sex\":\"男\",\"name\":\"zhad\",\"age\":23}";
        ObjectMapper objectMapper = new ObjectMapper();
        person person = objectMapper.readValue(json, person.class);
        System.out.println(person);

    }
}
