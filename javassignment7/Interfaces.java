package com.javassignment7;

interface Interface1 {
    void method1();
    void method2();
}

interface Interface2 {
    void method3();
    void method4();
}
interface Interface3 {
    void method5();
    void method6();
}
interface ThreeInterfaces extends Interface1,Interface2,Interface3{
    void newMethod();
}
class concreteClass{
    concreteClass()
    {
        System.out.println("In Concrete class");
    }
}
class newClass extends concreteClass implements ThreeInterfaces {

    @Override
    public void method1() {
        System.out.println("In method1");
    }

    @Override
    public void method2() {
        System.out.println("In method2");
    }

    @Override
    public void method3() {
        System.out.println("In method3");
    }

    @Override
    public void method4() {
        System.out.println("In method4");
    }

    @Override
    public void method5() {
        System.out.println("In method5");
    }

    @Override
    public void method6() {
        System.out.println("In method6");
    }

    @Override
    public void newMethod() {
        System.out.println("In new method");
    }

    void firstInterface(Interface1 interface1){
        interface1.method1();
        interface1.method2();
    }
    void secondInterface(Interface2 interface2){
        interface2.method3();
        interface2.method4();
    }
    void thirdInterface(Interface3 interface3){
        interface3.method5();
        interface3.method6();
    }
}
public class Interfaces{
    public static void main(String[] args){
        newClass obj=new newClass();
        obj.newMethod();
        obj.method1();
        obj.firstInterface(obj);
        obj.secondInterface(obj);
        obj.thirdInterface(obj);
    }
}

