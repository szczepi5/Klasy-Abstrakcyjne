package com.sdajava.abstractclass;

/**
 * Created by RENT on 2017-02-27.
 */
public class ImplementingClass extends abstractclass{


    public void abstractMethod() {
        System.out.println("Metoda abstrakcyjna");

    }

    public void implementMethod(){
        System.out.println("Nadpisanie metody implementMethod()" +
        "z klasy abstractclass");

    }
}
