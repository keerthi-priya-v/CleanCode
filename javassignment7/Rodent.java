package com.javassignment7;

public class Rodent {

    public Rodent(){
        System.out.println("This is Rodent");
    }
    // abstract void bodySize();
    public void bodySize(){
        System.out.println("Rodents have different body sizes");
    }
    public void looks(){
        System.out.println("Rodents have different looks");
    }
}
class Mouse extends Rodent{
    public Mouse(){
        System.out.println("This is Mouse");
    }
    public void bodySize(){
        System.out.println("5.5 - 7 inches long. Weigh 0.68 - 2 ounces");
    }

    @Override
    public void looks() {
        System.out.println("Mouses color is dull");
    }
}
class Gerbil extends Rodent{

    public Gerbil(){
        System.out.println("This is Gerbil");
    }
    @Override
    public void bodySize() {
        System.out.println("4 inches long. Weigh 2 - 4 ounces");
    }

    @Override
    public void looks() {
        System.out.println("Gerbil color is golden");
    }
}
class Hamster extends Rodent{

    public Hamster(){
        System.out.println("This is Hamster");
    }
    @Override
    public void bodySize() {
        System.out.println("2 - 13inches long. Weigh 3.5 - 7 ounces");
    }

    @Override
    public void looks() {
        System.out.println("Hamsters come in many colors with black, white, " +
                "grey, brown, red, yellow or mixture");
    }
}
