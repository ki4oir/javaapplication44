/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication44;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author curti_000
 */
public class JavaApplication44 {
    public static void main(String[] args) {
        
        String filePath, content = new String();
        LinkedList list = new LinkedList();
        
        filePath = JOptionPane.showInputDialog(null, "Please enter the full file path of input file:");
        
        try {
            Scanner scan = new Scanner(new File(filePath));
            
            while (scan.hasNextLine()) {
                content = scan.nextLine();
                list.add(content);
                
            }
            
            scan.close();
        
        JOptionPane.showMessageDialog(null, "File uploaded successfully!");
        
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
            filePath = JOptionPane.showInputDialog(null, "File not found. Please enter a valid file path");
            
        }
        catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "\n Program terminated safely");
        }
        
        JOptionPane.showMessageDialog(null, "Linked List Data: " + list);
    }
    
}
