package com.powernode.object17;

class Cat {
    private String name;
    private int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * 1.比较两个对象的属性值是否相等
     * 2.先找到两个对象
     *    1.this:当前对象，谁调用了equals方法，谁就是当前对象，所以this = cat1
     *    2.obj：Object obj = cat2
     *
     */
    @Override
    public boolean equals(Object obj) {
        //this和obj的地址相等，说明指向堆中的同一个对象，内容一定相等
        if (this == obj) return true;
        //如果obj为null，那么this不为null，内容不具有比较性，直接返回false
        // this的字节码文件对象 不等于 obj的字节码文件对象，说明就不是一个类，不具有可不行
        if (obj == null || this.getClass() != obj.getClass())  return false;
        Cat cat2 = (Cat) obj;
        return age == cat2.age && name.equals(cat2.name);//字符串比较内容是否相等，使用equals
       // return this.age == cat2.age && this.name.equals(cat2.name);//字符串比较内容是否相等，使用equals
    }
}
class Dog{}
public class Test {
    public static void main(String[] args) {
        Cat cat1 =  new Cat("喵喵",3);
        Cat cat2 =  new Cat("喵喵",3);
        //Dog dog = new Dog();
        /**
         * 1.比较两个对象的属性值是否相等
         * 2.使用 == 无法比较
         * 3.使用equals也无法比较，因为Object类的equals方法比较的也是地址
         * 4.父类的方法不满足子类的需求
         * 5.重写equals方法，在equals方法中比较属性值
         *
         */
        System.out.println(cat1.equals(cat2));
        /**
         * public boolean equals(Object obj) {
         *         return (this == obj);
         * }
         */
    }
}
