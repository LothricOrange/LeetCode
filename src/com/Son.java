package com;

public class Son extends Father{
    private int age = 10;

    {
        System.out.println("初始化块");
    }

    static {
        System.out.println("静态初始化块");
    }

    Son() {
        System.out.println(this);
        System.out.println("HEllO son");
        System.out.println(super.getClass());
    }


    public int getAge() {
        return age;
    }
}
