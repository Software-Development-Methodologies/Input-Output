/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fibonacci;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * 
 * @author Tiger
 */
public class Fibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        printFibo();
        readFibo();
        
    }

    private static void printFibo() {
        final int N = 50;
        try {
            BufferedWriter out = new BufferedWriter(new FileWriter("fib50.txt"));
            
            long[] fibNumbers = new long[N];
            fibNumbers[0] = 0;
            fibNumbers[1] = 1;
            
            out.write("F(0) = " + String.valueOf(fibNumbers[0]));
            out.newLine();
            out.write("F(1) = " + String.valueOf(fibNumbers[1]));
            out.newLine();
            
            for (int i = 2; i < N; i++) {
                fibNumbers[i] = fibNumbers[i - 1] + fibNumbers[i - 2];
                out.write("F(" + i + ") = " + String.valueOf(fibNumbers[i]));
                if (i < N - 1) {
                    out.newLine();
                }
            } 
                out.close();
                System.out.println("Print file completed\n");
            } catch (IOException ex) {
                System.err.println(ex.getMessage());
            }
        }
    
    private static void readFibo() {
        try {
            Scanner scanner = new Scanner(new File("fib50.txt"));
            String fib; 
            System.out.println("Start reading file:");
            while (scanner.hasNextLine()) {
                scanner.next();
                scanner.next();
                fib = scanner.next();
                System.out.println(fib);
            }
            scanner.close();
            System.out.println("Read file completed");
        } catch (FileNotFoundException ex) {
            System.err.println(ex.getMessage());
        }
    }
}

