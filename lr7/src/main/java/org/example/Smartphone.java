package org.example;

public class Smartphone {
    private String model;
    private int memory;
    private  int cameraMP;
    private   static int totalPhones  =0;
    private  static int totalMemory  =0;


    public Smartphone(String model, int memory, int cameraMP) {
        this.model = model;
        this.memory = memory;
        this.cameraMP = cameraMP;

        totalPhones++;
        totalMemory += memory;
    }
public static void test(){
    System.out.println("totalmemory "+ totalMemory +"totalphone "+totalPhones);
}
public void test1(){
    System.out.println("model "+ model+"memory "+memory+"camera "+cameraMP+"phone "+totalPhones+"totalmemory "+totalMemory);
}

    public static int getAverageMemory(){
        if (totalPhones == 0) {
            return 0;
        }
        return totalMemory / totalPhones;
    }

}
