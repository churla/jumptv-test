package com.jumptvs.test.command;

import com.jumptvs.test.ShellException;

import java.util.List;

/**
 * Created by jmartin on 6/09/17.
 */
public interface Command {

    public default String executeCommand(String[] args) throws ShellException{

        this.check(args);
        return execute(args);

    }

    void check(String[] args);

    public String execute(String[] args) throws ShellException;

    public String help();

}
