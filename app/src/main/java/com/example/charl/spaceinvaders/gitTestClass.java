package com.example.charl.spaceinvaders;

/**
 * Created by pablo on 26/02/17.
 */

public class gitTestClass {

    private int attributeX;
    private int attributeY;
    private int attributeZ;


    private gitTestClass(int x, int y){
        this.attributeX = x;
        this.attributeY = y;
    }

    private String testMethod(){
        return "Esto es una clase de prueba para crear una nueva rama en git, " +
                "el valor de x es: "+ this.attributeX +" y el valor de y: " +this.attributeY;
    }
}
