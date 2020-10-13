package com.company;
public class CustomThread extends Thread {
    @Override
    public void run() {
        try {
            for (int i = 0; i< 10; i++){
                sleep(1000);
                System.out.println("Estoy en la repetición " + i);
            }
        }catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}