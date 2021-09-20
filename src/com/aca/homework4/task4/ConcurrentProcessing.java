package com.aca.homework4.task4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ConcurrentProcessing implements Runnable{
    final private File file;

    public ConcurrentProcessing(File file) {
        this.file = file;
    }

    @Override
    public void run() {
        Scanner scanner = null;
        try {
            scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        int counter = 0;
        while(scanner.hasNextLine())
        {
            String curLine = scanner.nextLine();
            int index = curLine.indexOf("ab");
            while(index != -1)
            {
                ++counter;
                curLine = curLine.substring(index + 1);
                index = curLine.indexOf("ab");
            }
        }
        System.out.println(String.format("%s contains %d", file.getName(), counter));
        scanner.close();
    }
}
