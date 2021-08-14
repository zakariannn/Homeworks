package com.aca.homework2.task3;

public class ArmProcessor implements Processor{
    @Override
    public void calculateBinary(long decimal) {
        long startMillis = System.currentTimeMillis();
        boolean b = true;
        while(b){
            if(System.currentTimeMillis() - startMillis > 1000){
                System.out.println(Integer.toBinaryString((int)decimal));
                b = false;
            }

        }
    }
}
