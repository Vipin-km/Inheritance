package io.space.vipin;

public class Fish extends Animal{
    private int gills;
    private int eyes;
    private int fins;

    public Fish(String name, int size, int weight, int gills, int eyes, int fins) {
        super(1, name, 1, size, weight);
        this.gills = gills;
        this.eyes = eyes;
        this.fins = fins;
    }
    public void rest(){

    }
    public void moveMuscles(){

    }
    public void moveBackFin(){

    }
    private void swim(int  speed){
        moveMuscles();
        moveBackFin();
        super.move(speed);
    }
}
