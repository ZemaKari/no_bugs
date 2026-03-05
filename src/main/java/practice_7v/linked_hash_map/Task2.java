package practice_7v.linked_hash_map;

import java.util.LinkedHashMap;

public class Task2 {
    private LinkedHashMap<String, Integer> map2;

    //конструктор класса

    public Task2(){
        this.map2 = new LinkedHashMap<>();

    }
    //метод добавляет элементя в map

    public void addElement(String name, Integer phone){
        map2.put(name, phone);

    }
    // метод который находит телефон по имени

    public Integer getPhone(String name){
        return map2.get(name);
    }



}
