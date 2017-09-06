package com.jumptvs.test;

import java.io.Console;
import java.util.Scanner;

/**
 * Created by jmartin on 6/09/17.
 */
public class Main {

    public static boolean end = false;

    public static void main(String[] args){

        CommandHandler ch = new CommandHandler();
        Scanner scn = new Scanner(System.in);




        while(!end){
            printSimbol();

            String command = scn.nextLine();

            String out = ch.executeCommand(command);

            printOut(out);
        }

    }

    private static void printOut(String out) {
        System.out.println("\n"+out+"\n");
    }


    private static void printSimbol() {
        System.out.print("\njump> ");
    }

}
