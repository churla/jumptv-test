package com.jumptvs.test.command;

import com.jumptvs.test.ShellException;

/**
 * Created by jmartin on 8/09/17.
 */
public class OverlapCommand implements Command {
    @Override
    public void check(String[] args) {

    }

    @Override
    public String execute(String[] args) throws ShellException {
        return null;
    }

    @Override
    public String help() {
        return "- Find shapes that overlap: circle <x> <y> <radius>";
    }
}
