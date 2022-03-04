package com.javassignment7;

public class MainRodent{

    public static void main(String[] args) {
        Rodent[] rodent=new Rodent[3];
        //upcasting
        rodent[0]=new Mouse();
        rodent[0].looks();
        rodent[0].bodySize();

        System.out.println();
        rodent[1]=new Gerbil();
        rodent[1].looks();
        rodent[1].bodySize();
        System.out.println();

        rodent[2]=new Hamster();
        rodent[2].looks();
        rodent[2].bodySize();





    }
}