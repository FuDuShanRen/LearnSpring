package com.tiance.lazyinit;

public class Person {
    public Person(){
        System.out.println("==正在执行Person的无参构造器==");
    }
    public void setTest(String name){
        System.out.println("正在调用setTest（）方法，传入的参数为"+name);
    }
}
