package com.jumptvs.test;

/**
 * Created by jmartin on 7/09/17.
 */
public class ShellException extends RuntimeException {

    public ShellException(String message, Exception e) {
        super(message, e);
    }

    public ShellException(String s) {
        super(s);
    }
}
