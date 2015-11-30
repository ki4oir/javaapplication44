/*
 * Linked List Implemented as a Stack.
 * Curtis Morris
 * 11/23/15.
 */
package javaapplication44;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Curtis Morris
 */
public class JavaApplication44 { //test class
    
    public static void main(String[] args) { //main method
        
        String filePath, content = new String(); // declare String variables
        LinkedList list = new LinkedList(); // construct empty linked list
        
        //enter file path
        filePath = JOptionPane.showInputDialog(null, "Please enter the full file path of input file:"); 
        
        try { //to catch errors
            Scanner scan = new Scanner(new File(filePath)); // pass data in file at path to Scanner
            
            //read each line in file
            while (scan.hasNextLine()) {
                content = scan.nextLine();
                list.push(content);
                
            }
            //close file reader
            scan.close();
        
        JOptionPane.showMessageDialog(null, "File uploaded successfully!"); //message
        
        }
        catch (FileNotFoundException e) { //catch file-not-found error
            e.printStackTrace();
            filePath = JOptionPane.showInputDialog(null, "File not found. Please enter a valid file path");
            
        }
        catch (Exception e) {
            e.printStackTrace(); //not so sure why this is here
            JOptionPane.showMessageDialog(null, "\n Program terminated safely");
        }
        
        //output data in a message dialog box as a list 
        JOptionPane.showMessageDialog(null, "Linked List Data: " + list);
        
        //output data in console and message dialog box popups
        int i = list.size(); //variable representing list size
        System.out.println("List Size: " + i); //list size as number
        int count = 0; //set count to zero
        //for(int count = 0; count < i; count++){ <-----not particularly useful
        while (count < i) {
        System.out.println(list.get(count));
        //count++; <-------------increases count prematurely
        JOptionPane.showMessageDialog(null, list.get(count));
        count++;
        }
        
        System.out.println(); //blank line
        
        //removes a record and reset count to zero
        list.pop(); //must reset size variable
        i = list.size(); //reset the value i (variable representing list size)
        count = 0;
        //display results - i must be actual size of list
        while (count < i) {
        System.out.println(list.get(count));
        //count++; <----------increases count prematurely (causes out-of-bounds error)
        JOptionPane.showMessageDialog(null, list.get(count));
        count++;
        }
        System.out.println("List Size: " + i);
    }
    
}
