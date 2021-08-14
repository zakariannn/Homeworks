package com.aca.homework2.task3;

public class ProcessorsTest {
    public static void main(String[] args) {
        Processor processor1 = new X86IntelProcessor();
        processor1.calculateBinary(25);
        processor1.calculateBinary(884);
        processor1.calculateBinary(721);
        Processor processor2 = new X8664IntelProcessor();
        processor2.calculateBinary(25);
        processor2.calculateBinary(884);
        processor2.calculateBinary(721);
        Processor processor3 = new ArmProcessor();
        processor3.calculateBinary(25);
        processor3.calculateBinary(884);
        processor3.calculateBinary(721);
    }
}
