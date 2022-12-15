package org.exercises;

public class Main {
    public static void main(String[] args) {

        //--------------Tema 3---------------------------
        System.out.println(sumar(2.3F,12,13.3F));
        Coche coche1 = new Coche();
        coche1.incrementarPuerta();
        System.out.println(coche1.puertas);

    }

    public static float sumar(float a, float b, float c){
        return a + b + c;
    }


}