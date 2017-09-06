package com.jumptvs.test.command;

import com.jumptvs.test.Shapes;
import com.jumptvs.test.shapes.Rectangle;
import com.jumptvs.test.shapes.Square;

/**
 * Created by jmartin on 6/09/17.
 */
public class RectangleCommand implements Command {
    @Override
    public String execute(String[] args) {

        Rectangle r = new Rectangle(
                Double.parseDouble(args[1]),
                Double.parseDouble(args[2]),
                Double.parseDouble(args[3]),
                Double.parseDouble(args[4])
        );

        String name = Shapes.getInstance().addShape(r);

        r.setName(name);


        return r.printData();

    }
}
