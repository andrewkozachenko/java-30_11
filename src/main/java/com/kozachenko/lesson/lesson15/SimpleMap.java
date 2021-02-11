package com.kozachenko.lesson.lesson15;


import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

class Equipment {
    private Integer id;
    private String url;

    public Equipment() {
    }

    public Equipment(Integer id, String url) {
        this.id = id;
        this.url = url;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Equipment equipment = (Equipment) o;
        return Objects.equals(id, equipment.id) &&
                Objects.equals(url, equipment.url);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, url);
    }

    @Override
    public String toString() {
        return "Equipment{" +
                "id=" + id +
                ", url='" + url + '\'' +
                '}';
    }
}

public class SimpleMap {
    public static void main(String[] args) {
        createSimpleMap();
    }


    private static void createSimpleMap(){
        Equipment cs_pe = new Equipment(1, "http://avic.ua/apple/macbook");
        Equipment journalist = new Equipment(2, "http://moleskin.com");

        Map<Integer, Equipment> map = new HashMap();
        map.put(cs_pe.getId(), cs_pe);
        map.put(journalist.getId(), journalist);
        map.put(1, new Equipment(1, "hhh"));

        System.out.println(map);
        System.out.println(map.get(2));

        System.out.println("Using Map.Entry Set");
        Set<Map.Entry<Integer, Equipment>> set = map.entrySet();
        for (Map.Entry entry : set) {
            System.out.println("Key = " + entry.getKey()
                    + " Value = " + entry.getValue());
        }
        System.out.println("using Map.values()");
        for(Equipment equipment : map.values()){
            System.out.println(equipment);
        }
    }
}
