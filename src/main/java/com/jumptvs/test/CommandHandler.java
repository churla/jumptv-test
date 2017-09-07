package com.jumptvs.test;

import com.jumptvs.test.command.*;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by jmartin on 6/09/17.
 */
public class CommandHandler {

    private Map<String, Command> commands;

    public CommandHandler(){

        commands = new HashMap<>();

        commands.put("circle", new CircleCommand());
        commands.put("square", new SquareCommand());
        commands.put("rectangle", new RectangleCommand());
        commands.put("triangle", new TriangleCommand());
        commands.put("donut", new DonutCommand());
        commands.put("contains", new ContainsCommand());
        commands.put("fileload", new FileLoadCommand(this));
        commands.put("exit", new ExitCommand());

    }


    public String executeCommand(String command) throws ShellException {

        try {
            String[] cParsed = command.split(" ");

            String cName = cParsed[0];

            Command c = commands.get(cName);

            if (cName.equals("help")) {
                return help();
            } else if (c != null) {
                if (cParsed.length == 2 && Utils.isDouble(cParsed[0]) && Utils.isDouble(cParsed[1])) {
                    c = commands.get("contains");
                }
            } else {
                throw new ShellException("Command not exist, execute help command for read a complete command list");
            }

            return c.executeCommand(cParsed);
        }catch(Exception e){
            throw new ShellException(e.getMessage(), e);
        }

    }

    private String help() {

       String help =  commands.values().stream().map(Command::help).reduce((acum, com) ->{
            if(acum == null) acum = "";
            acum += "\n"+com;
            return acum;
        }).get();

       return help;
    }
}
