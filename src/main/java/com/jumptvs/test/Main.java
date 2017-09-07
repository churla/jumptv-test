package com.jumptvs.test;

import java.io.Console;
import java.io.File;
import java.util.Scanner;

/**
 * Created by jmartin on 6/09/17.
 */
public class Main {

    public static boolean end = false;

    public static void main(String[] args){

        File f = new File(".");
        System.out.println(f.getAbsolutePath());


        CommandHandler ch = new CommandHandler();
        Scanner scn = new Scanner(System.in);




        while(!end){
            try {
                printSimbol();

                String command = scn.nextLine();

                String out = ch.executeCommand(command);

                printOut(out);
            }catch(ShellException se){
                printError(se.getMessage());
            }
        }

    }

    private static void printError(String message) {
        System.out.println("\nERROR: "+message+"\n");

    }

    private static void printOut(String out) {
        System.out.println("\n"+out+"\n");
    }


    private static void printSimbol() {
        System.out.print("\njump> ");
    }

}
