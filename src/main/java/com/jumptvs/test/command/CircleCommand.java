package com.jumptvs.test.command;

import com.jumptvs.test.Shapes;
import com.jumptvs.test.shapes.Circle;

import java.util.List;

/**
 * Created by jmartin on 6/09/17.
 */
public class CircleCommand implements Command {

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
}
