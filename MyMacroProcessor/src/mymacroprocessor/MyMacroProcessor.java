/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mymacroprocessor;

import java.io.FileReader;
import java.util.Scanner;

/**
 *
 * @author samy
 */

class MDT{
    
}

class MNT{
    
}

class ALA{
    
}

class MacroProcessor{
    MDT mdt;
    MNT mnt;
    ALA ala;
    
    boolean inputFile(String path){ //input path for file. False if no file not read
        boolean success=true;
        FileReader fp = null;
        
        try{
            in = new FileReader(path);
            
            
        }finally{
            
        }
        
    }
    boolean process(); //One-line MacroProcessing starter.
     
}

public class MyMacroProcessor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("System Programming Assignment\n****MacroProcessor simulator*****\nEnter file to be processed by MacroProcessor:\n");
        Scanner sc = new Scanner(System.in);
        String FileName = sc.nextLine();
        
        System.out.println("Starting MacroProcessor...\n");
        MacroProcessor MP = new MacroProcessor();
        
        System.out.println("Sending File Name to MacroProcessor...\n");
        if(MP.inputFile(FileName)){
            System.out.println("File accepted by Macroprocessor...\n");
            System.out.println("MacroProcessor starts Processing. Please wait till process finishes...\n");
            if(MP.process()){
                System.out.println("MacroProcessor Processing completed...\n");
                boolean x=true;
                while(x){
                    System.out.println("Select Option\n1. MDT\n2. MNT\n3. ALA\n4. Exit\n");
                    int a = sc.nextInt();
                    switch(a){
                        case 1:
                            MP.mdt.display();
                            break;
                        case 2:
                            MP.mnt.display();
                            break;
                        case 3:
                            MP.ala.display();
                            break;
                        case 4:
                            x=false;
                            break;
                    }
                }
            }
            else
                System.out.println("There was a problem in MacroProcessor processing. Please check errors in your file\n");
        }
        System.out.println("File not found.Please check the file name you entered.\n");
    }
    
}
