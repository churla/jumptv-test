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
        commands.put("exit", new ExitCommand());

    }


    public String executeCommand(String command) {
        String[] cParsed = command.split(" " );
        String cName = cParsed[0];

        Command c = commands.get(cName);

        if(c == null){
            if(cParsed.length == 2 && Utils.isDouble(cParsed[0]) && Utils.isDouble(cParsed[1])){
                c = commands.get("contains");
            }
        }

        return c.execute(cParsed);

    }
}