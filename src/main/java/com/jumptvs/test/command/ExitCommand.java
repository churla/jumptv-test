package com.jumptvs.test.command;

import com.jumptvs.test.Main;

import java.util.List;

/**
 * Created by jmartin on 6/09/17.
 */
public class ExitCommand implements Command{
    @Override
    public String execute(String[] args) {

        Main.end = true;

        return "";
    }
}
