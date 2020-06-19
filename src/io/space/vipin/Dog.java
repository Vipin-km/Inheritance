package io.space.vipin;

public class Dog extends Animal {
    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;
    public Dog(int brain, String name, int weight,int eyes, int legs, int tail,int teeth, String coat ) {
        super(brain, name, 1, 1, weight);
        this.eyes = eyes;
        this.coat =coat;
        this.legs=legs;
        this.tail=tail;
        this.teeth=teeth;
    }

    private void chew(){
        System.out.println("Dog.chew() called");
    }

    @Override
    public void eat() {
        System.out.println("Dog.eat() called");
        chew();
        super.eat();
    }
}
