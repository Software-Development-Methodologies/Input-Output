/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package scannerexercise;

import java.util.Scanner;

/**
 *
 * @author Tiger
 */
public class ScannerExercise {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        readGrades();
    }
    
    static void readGrades() {
        Scanner scanner = new Scanner(System.in);
        String am;
        String course;
        int countCourses;
        float grd;
        float sumGrds;
        
        System.out.println("Enter data : ");
        do {
           am = scanner.next();
           sumGrds = 0.0f;
           countCourses = 0;
           do {
               course = scanner.next();
               grd = scanner.nextFloat();
               sumGrds += grd;
               countCourses++;
           } while (!course.equals("end"));
           printAvg(am, countCourses, sumGrds);
        } while (!am.equals("000000"));
        
        scanner.close();
    }
    
    static void printAvg(String am, int countCourses, float sumGrds) {
        float avg;
        
        avg = sumGrds / (float) countCourses;
        System.out.println("Average of Student " + am + ": " + avg);
    }
    
    
}
