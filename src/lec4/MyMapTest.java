package lec4;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MyMapTest {
    static class Student {
        int age;
        String name;
        String major;

        public Student(String name, int age, String major) {
            this.name = name;
            this.age = age;
            this.major = major;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "age=" + age +
                    ", name='" + name + '\'' +
                    ", major='" + major + '\'' +
                    '}';
        }
    }

    public static void main(String[] args) {
        Map<Integer, Student> hashMap = new HashMap<>();
        Map<Integer, Student> treeMap = new TreeMap<>();
        Map<Integer, Student> linkedHashMap = new LinkedHashMap<>();

        Student student1 = new Student("Albina", 19, "CS");
        Student student2 = new Student("Gaukhar", 20, "TRA");
        Student student3 = new Student("Bireu", 21, "Math");

        hashMap.put(220107021, student1);
        hashMap.put(210345678, student2);
        hashMap.put(200101111, student3);

        treeMap.put(220107021, student1);
        treeMap.put(210345678, student2);
        treeMap.put(200101111, student3);

        linkedHashMap.put(220107021, student1);
        linkedHashMap.put(200101111, student3);
        linkedHashMap.put(210345678, student2);

        System.out.println("Hashmap: " + hashMap);
        System.out.println("TreeMap: " + treeMap);
        System.out.println("LinkedHashMap: " + linkedHashMap);

        //put, get, remove, containsKey, containsValue, keySet(), getOrDefault(1, 0)

        hashMap.remove(220107021);

        System.out.println("Hashmap after remove 220107021: " + hashMap);

        System.out.println(hashMap.containsValue(student1)); //false
        System.out.println(hashMap.containsValue(student3)); //true

        System.out.println(hashMap.getOrDefault(220107021, null)); // null
        System.out.println(hashMap.getOrDefault(200101111, new Student("a", 20, "aksjkas")));

        //hashmap - key & value can be null
        //treemap - only value can be null
        //linkedhashmap - both can be null
    }
}
