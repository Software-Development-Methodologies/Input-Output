/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package copyfiles;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Tiger
 */
public class CopyFiles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            BufferedReader bufferReadStrings = new BufferedReader(new InputStreamReader(System.in));
            String file;
            String copyFile;
        
            System.out.println("Δώστε το πλήρες path του αρχείου:");
            file = bufferReadStrings.readLine();
            System.out.println("Δώστε το πλήρες path του αντιγράφου:");
            copyFile = bufferReadStrings.readLine();
            
            BufferedWriter bufferWriteFiles = new BufferedWriter(new FileWriter(file));
            bufferWriteFiles.write("ABCDEFG");
            bufferWriteFiles.newLine();
            bufferWriteFiles.write("HIJKLMN");
            bufferWriteFiles.newLine();
            bufferWriteFiles.write("OPQRSTV");
            bufferWriteFiles.newLine();
            bufferWriteFiles.write("UWXYZ");
                        
            if (!file.isEmpty() && !copyFile.isEmpty()) {
                BufferedReader bufferReadFiles = new BufferedReader(new FileReader(file));
                BufferedWriter bufferWriteCopyFiles = new BufferedWriter(new FileWriter(copyFile));
                String line;
                
                while (bufferReadFiles.ready()) {
                    line = bufferReadFiles.readLine();
                    bufferWriteCopyFiles.write(line);
                }
                bufferReadStrings.close();
                bufferWriteFiles.close();
                bufferReadFiles.close();
                bufferWriteCopyFiles.close();
            }
            
            System.out.println("Η αντιγραφή ολοκληρώθηκε µε επιτυχία.");
            
        } catch (FileNotFoundException ex) {
            System.err.println(ex.getMessage());
        } catch (IOException ex) {
            System.err.println(ex.getMessage());
        }
    }
}
