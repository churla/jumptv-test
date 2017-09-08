package com.jumptvs.test.command;

import com.jumptvs.test.Shapes;
import com.jumptvs.test.ShellException;
import com.jumptvs.test.Utils;
import com.jumptvs.test.shapes.Square;
import com.jumptvs.test.shapes.Triangle;

/**
 * Created by jmartin on 6/09/17.
 */
public class TriangleCommand implements Command {
    @Override
    public void check(String[] args) {
        if(args.length != 7){ throw new ShellException("Invalid Parameters for triangle Command.\n"+help()); }
        if(!Utils.isDouble(args[1])) { throw new ShellException("Invalid Parameters for triangle Command.\n"+help()); }
        if(!Utils.isDouble(args[2])) { throw new ShellException("Invalid Parameters for triangle Command.\n"+help()); }
        if(!Utils.isDouble(args[3])) { throw new ShellException("Invalid Parameters for triangle Command.\n"+help()); }
        if(!Utils.isDouble(args[4])) { throw new ShellException("Invalid Parameters for triangle Command.\n"+help()); }
        if(!Utils.isDouble(args[5])) { throw new ShellException("Invalid Parameters for triangle Command.\n"+help()); }
        if(!Utils.isDouble(args[6])) { throw new ShellException("Invalid Parameters for triangle Command.\n"+help()); }
    }

    @Override
    public String execute(String[] args) {
        Triangle t = new Triangle(
                Double.parseDouble(args[1]),
                Double.parseDouble(args[2]),
                Double.parseDouble(args[3]),
                Double.parseDouble(args[4]),
                Double.parseDouble(args[5]),
                Double.parseDouble(args[6])
        );

        String name = Shapes.getInstance().addShape(t);

        t.setName(name);


        return t.printData();
    }

    @Override
    public String help() {
        return "- Create a Triangle shape: <x1> <y1> <x2> <y2> <x3> <y3>";
    }
}
