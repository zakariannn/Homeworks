package com.aca.homework4.task3;

import java.io.*;
import java.util.Scanner;

public class FilesAnalyzerRunnable {
    public static void main(String[] args) throws IOException {
        new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    File file = new File("C:/Users/marin/Desktop/Java/" + String.format("filename%s.txt", i));
                    String[] words = new String[]{"random1", "random2","random3"};
                    Scanner scanner = null;
                    try {
                        scanner = new Scanner(file);
                    } catch (FileNotFoundException e) {
                        e.printStackTrace();
                    }
                    while(scanner.hasNextLine())
                    {
                        String s = scanner.nextLine();
                        String[] arr = s.split(" ");
                        for(String str: words){
                            for(String str1: arr){
                                if(str.equals(str1))
                                {
                                    System.out.println(String.format("%s contains %s", file.getName(), str));
                                }
                            }
                        }
                    }

                }
            }
        }.run();
    }
}
