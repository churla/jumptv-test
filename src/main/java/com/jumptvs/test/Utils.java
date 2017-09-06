package com.jumptvs.test;

/**
 * Created by jmartin on 6/09/17.
 */
public class Utils {

    public static boolean isDouble(String num){

        try{

            Double.parseDouble(num);
            return true;

        }catch (Exception e){
            return false;
        }

    }

}
