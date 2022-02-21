package com.javassignment6;

public class OverloadingConstructor
{

    String name;
    int salary;
    //Constructor One
    public OverloadingConstructor(String name)
    {
        this.name=name;
        System.out.println(this.name);
    }
    //Constructor two
    public OverloadingConstructor(int salary) {
        new OverloadingConstructor("Priya");
        this.salary=salary;
    }

    public static void main(String[] args)
    {
        OverloadingConstructor object=new OverloadingConstructor(50000);//Priya
        System.out.println(object.name);//null
        System.out.println(object.salary);//50000
        OverloadingConstructor[] array=new OverloadingConstructor[3];
        array[0]=new OverloadingConstructor("Keerthi");//Keerthi
        System.out.println(array[0].name);//Keerthi
        System.out.println(array[0].salary);//0

    }
}