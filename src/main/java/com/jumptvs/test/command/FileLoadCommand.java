package com.jumptvs.test.command;

import com.jumptvs.test.CommandHandler;
import com.jumptvs.test.ShellException;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.util.stream.Stream;

/**
 * Created by jmartin on 7/09/17.
 */
public class FileLoadCommand implements Command {

    private CommandHandler ch;

    public FileLoadCommand(CommandHandler ch) {
        this.ch = ch;
    }

    @Override
    public void check(String[] args) {
        if(args.length != 2) { throw new ShellException("Invalid Parameters for fileload Command.\n"+help()); }

        File f = new File(args[1]);

        if(!f.exists()){ throw new ShellException("Invalid Parameters for fileload Command.\n"+help()); }

    }

    @Override
    public String execute(String[] args) {
        File f = new File(args[1]);

        try {
            Stream<String> commands = FileUtils.readLines(f).stream();

            String res = commands.map(com -> ch.executeCommand(com)).reduce((acum, ele) -> {

                if(acum == null) acum = "";
                return acum + "\n" + ele;

            }).get();

            return res;
        } catch (IOException e) {
            throw new ShellException(e.getMessage(), e);
        }

    }

    @Override
    public String help() {
        return "- Execute command from a file: fileload <path file>";
    }
}
