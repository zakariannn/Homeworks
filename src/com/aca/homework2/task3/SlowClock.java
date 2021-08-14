package com.aca.homework2.task3;

public class SlowClock implements Clock{
    @Override
    public void start() {
        int seconds = 0;
        long startMillis = System.currentTimeMillis();
        while(true){
            long newMillis = System.currentTimeMillis();
            if(newMillis - startMillis > 2000)
            {
                startMillis = newMillis;
                newMillis = System.currentTimeMillis();
                System.out.println(++seconds);
            }
        }
    }

}
