package com.jumptvs.test.command;

import java.util.List;

/**
 * Created by jmartin on 6/09/17.
 */
public interface Command {


    public String execute(String[] args);

    public String help();

}
