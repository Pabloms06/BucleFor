package com.company;
public class Main {


    public static void main(String[] args) {
        long tiempoDeInicio = System.currentTimeMillis();
        CustomThread t = new CustomThread();
        t.start();
        try {
            t.join();
        }catch (InterruptedException e) {
            e.printStackTrace();
        }
        long tiempoDeFin = System.currentTimeMillis();
        System.out.println("He terminado en " + (tiempoDeFin - tiempoDeInicio) + " milisegundos");

        CustomThread t1 = new CustomThread();
        t1.start();
        CustomThread t2 = new CustomThread();
        t2.start();
        CustomThread t3 = new CustomThread();
        t3.start();
    }
}