package com.jumptvs.test.command;

import com.jumptvs.test.Shapes;
import com.jumptvs.test.shapes.Square;
import com.jumptvs.test.shapes.Triangle;

/**
 * Created by jmartin on 6/09/17.
 */
public class TriangleCommand implements Command {
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
}
