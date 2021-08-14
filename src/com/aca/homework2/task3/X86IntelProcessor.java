package com.aca.homework2.task3;

public class X86IntelProcessor implements Processor{
    @Override
    public void calculateBinary(long decimal) {
        long startMillis = System.currentTimeMillis();
        boolean b = true;
        while(b){
            if(System.currentTimeMillis() - startMillis > 4000){
                System.out.println(Integer.toBinaryString((int)decimal));
                b = false;
            }

        }
    }

}
