package com.jumptvs.test.command;

import com.jumptvs.test.Shapes;
import com.jumptvs.test.ShellException;
import com.jumptvs.test.Utils;
import com.jumptvs.test.shapes.Circle;

import java.util.List;

/**
 * Created by jmartin on 6/09/17.
 */
public class CircleCommand implements Command {

    @Override
    public void check(String[] args) {

        if(args.length != 5) { throw new ShellException("Invalid Parameters for circle Command.\n"+help()); }
        if(!Utils.isDouble(args[1])) { throw new ShellException("Invalid Parameters for circle Command.\n"+help()); }
        if(!Utils.isDouble(args[2])) { throw new ShellException("Invalid Parameters for circle Command.\n"+help()); }
        if(!Utils.isDouble(args[3])) { throw new ShellException("Invalid Parameters for circle Command.\n"+help()); }

    }

    @Override
    public String execute(String[] args) {

        Circle c = new Circle(
                Double.parseDouble(args[1]),
                Double.parseDouble(args[2]),
                Double.parseDouble(args[3])
        );

        String name = Shapes.getInstance().addShape(c);

        c.setName(name);


        return c.printData();
    }

    @Override
    public String help() {
        return "- Create a Circle shape: circle <x> <y> <radius>";
    }
}
