package com.jumptvs.test.command;

import com.jumptvs.test.Shapes;
import com.jumptvs.test.shapes.Donut;
import com.jumptvs.test.shapes.Square;

/**
 * Created by jmartin on 6/09/17.
 */
public class DonutCommand implements Command {
    @Override
    public String execute(String[] args) {
        Donut d = new Donut(
                Double.parseDouble(args[1]),
                Double.parseDouble(args[2]),
                Double.parseDouble(args[3]),
                Double.parseDouble(args[4])
        );

        String name = Shapes.getInstance().addShape(d);

        d.setName(name);


        return d.printData();
    }

    @Override
    public String help() {
        return "- Create a Donut shape: donut <x> <y> <max radius> <min radius>";
    }
}
