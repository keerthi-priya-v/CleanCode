package com.javassignment7;

interface newCycle {
    void Unicycle();
    void Bicycle();
    void Tricycle();
}
abstract class factory1 implements newCycle{

    @Override
    public void Unicycle() {
        System.out.println("in unicycle factory");
    }
}
abstract class factory2 implements newCycle{

    @Override
    public void Bicycle() {
        System.out.println("in bicycle factory");
    }
}
abstract class factory3 implements newCycle{

    @Override
    public void Tricycle() {
        System.out.println("in tricycle factory");
    }
}
