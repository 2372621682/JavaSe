package com.powernode.array07;

import java.util.Arrays;
import java.util.Comparator;

class Teacher implements Comparable{
    private String name;
    private int age;

    public Teacher(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        Teacher teacher = (Teacher) o;
       /* if (age >  teacher.age) {
            return 1;
        } else if (age < teacher.age) {
            return -1;
        }
        return 0;*/
        return age - teacher.age;
    }
}
public class Test {
    public static void main(String[] args) {
       Teacher t1 = new Teacher("zs",23);
       Teacher t2 = new Teacher("ls",20);
       Teacher t3 = new Teacher("ww",26);

       Teacher[] teachers = {t1, t2,t3};
        Arrays.sort(teachers);
        System.out.println(Arrays.toString(teachers));
        System.out.println("-----------------------------");
        Arrays.sort(teachers, new Comparator<Teacher>() {
            @Override
            public int compare(Teacher o1, Teacher o2) {
                return o2.getAge() - o1.getAge();
            }
        });
        System.out.println(Arrays.toString(teachers));
    }
}
