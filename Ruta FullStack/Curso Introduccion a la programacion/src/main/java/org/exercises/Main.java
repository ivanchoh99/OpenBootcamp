package org.exercises;

public class Main {
    public static void main(String[] args) {

        //--------------Tema 3---------------------------
        System.out.println("-------------TEMA 3-------------");
        System.out.println("La suma es: " + sumar(2.3F,12,13.3F));
        Coche coche1 = new Coche();
        coche1.incrementarPuerta();
        System.out.println("puertas del coche: " + coche1.puertas);

        //-------------Tema 4-----------------------------
        System.out.println("-------------TEMA 4-------------");
        int numeroIf = -14, numeroWhile = 0;
//        ,numeroFor = 0;
        System.out.println("IF");
        if(numeroIf < 0){
            System.out.println("numeroIf es un numero negativo");
        }else if(numeroIf == 0){
            System.out.println("numeroIf es 0");
        }else{
            System.out.println("numeroIf es un numero positivo");
        }

        System.out.println("WHILE");
        while(numeroWhile < 3){
            numeroWhile ++;
            System.out.println(numeroWhile);
        }

        System.out.println("DO-WHILE");
        numeroWhile = 0;
        do{
            numeroWhile ++;
            System.out.println(numeroWhile);
        }while (numeroWhile == numeroWhile + 1);

        System.out.println("FOR");
        for (int numeroFor=0; numeroFor <= 3; numeroFor++){
//        for (int i=0; i <= 3; i++){
            numeroFor ++;
            System.out.println(numeroFor);
        }

        System.out.println("SWITCH");
        String estacion = "PAPA";
        switch (estacion){
            case "verano":
                System.out.println("estamos en: " + estacion );
                break;
            case "otoño":
                System.out.println("estamos en: " + estacion );
                break;
            case "primavera":
                System.out.println("estamos en: " + estacion );
                break;
            case "invierno":
                System.out.println("estamos en: " + estacion );
                break;
            default:
                System.out.println("QUEEEE!!!!! " );
        }



    }

    public static float sumar(float a, float b, float c){
        return a + b + c;
    }


}