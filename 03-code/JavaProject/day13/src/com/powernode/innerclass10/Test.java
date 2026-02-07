package com.powernode.innerclass10;
class OuterClass{
    private int x;
    private int y;

    public OuterClass(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * 1.当前类不符合高内聚，低耦合的原则
     * 2.因为当前类，有业务的处理方法和运算方法，这样类处理的功能就不单一了
     *     1.
     */
    //做业务的方法
    //增
    public void insert(){
        System.out.println("OuterClass.insert");
    }
    //删
    public void delete(){
        System.out.println("OuterClass.delete");
    }
    //改
    public void update(){
        System.out.println("OuterClass.update");
    }
    //查
    public void query(){
        System.out.println("OuterClass.query");
    }
    //....
    //做运算的方法
    public void add(){
        System.out.println(x + y);
    }
    public void div(){
        System.out.println(x / y);
    }

}
public class Test {
}
