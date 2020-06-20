package io.space.vipin;

public class Main {

    public static void main(String[] args) {
	 Animal animal =new Animal(1,"Animal",1,5,5);

	 Dog dog = new Dog(1,"Yorkey",10,2,4,1,35,"Silky");
	 Fish  fish = new Fish("tune", 100, 100, 2,2,4);


	 dog.eat();
	 dog.walk();
	 //dog.run();
    }

}
