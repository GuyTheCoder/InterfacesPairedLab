package model;

import model.interfaces.IAnimal;
import model.interfaces.ISwim;
import model.interfaces.IEat;
import model.interfaces.ISleep;
import model.interfaces.IRun;


// Hint: missing an interface and a method implementation
public class Tiger implements IAnimal, ISwim, IEat, ISleep, IRun {

    @Override
    public void swim() {
        System.out.println("Tiger is swimming");
    }

    @Override
    public void eat() {
        System.out.println("Tiger is eating");
    }

    @Override
    public void sleep() {
        System.out.println("Tiger is sleeping");
    }

    @Override
    public void run() {
        System.out.println("Tiger is running");
    }

}
