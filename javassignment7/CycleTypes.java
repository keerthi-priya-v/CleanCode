package com.javassignment7;

class Cycle {
    public void balance(){
        System.out.println("balance method in cycle");
    }
}
class Unicycle extends Cycle{
    public void balance(){
        System.out.println("balance method in Unicycle");
    }

}
class Bicycle extends Cycle{
    public void balance(){
        System.out.println("balance method in Bicycle");
    }
}
class Tricycle extends Cycle{
    //No balance method
}
class CycleTypes{
    public static void main(String[] args){

        Cycle[] cycle=new Cycle[4];//array of cycle

        cycle[0]=new Cycle();
        cycle[1]=new Unicycle();
        cycle[2]=new Bicycle();
        cycle[3]=new Tricycle();


        Unicycle unicycle= (Unicycle)cycle[1];//downcasting
        unicycle.balance();

        cycle[2].balance();

        Tricycle tricycle=(Tricycle)cycle[3];
        tricycle.balance();//after downcasting  we can access super class method without method in tricycle
    }
}
