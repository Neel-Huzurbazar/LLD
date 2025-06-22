package DesignPatterns.Creational.Prototype;

import java.util.HashMap;
import java.util.Map;

public class Registry {
    private Map<String,Student> map = new HashMap();

    public void register(String key,Student student)
    {
        map.put(key,student);
    }

    public Student getObject(String key)
    {
        return map.get(key);
    }
}
