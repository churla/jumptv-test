package com.jumptvs.test.command;

import com.jumptvs.test.Shapes;
import com.jumptvs.test.ShellException;
import com.jumptvs.test.Utils;
import com.jumptvs.test.shapes.Square;

/**
 * Created by jmartin on 6/09/17.
 */
public class SquareCommand implements Command {
    @Override
    public void check(String[] args) {
        if(args.length != 3){ throw new ShellException("Invalid Parameters for square Command.\n"+help()); }
        if(!Utils.isDouble(args[1])) { throw new ShellException("Invalid Parameters for square Command.\n"+help()); }
        if(!Utils.isDouble(args[2])) { throw new ShellException("Invalid Parameters for square Command.\n"+help()); }

    }

    @Override
    public String execute(String[] args) {
        Square s = new Square(
                Double.parseDouble(args[1]),
                Double.parseDouble(args[2]),
                Double.parseDouble(args[3])
        );

        String name = Shapes.getInstance().addShape(s);

        s.setName(name);


        return s.printData();


    }

    @Override
    public String help() {
        return "- Create a Square shape: square <x> <y> <side>";
    }
}
