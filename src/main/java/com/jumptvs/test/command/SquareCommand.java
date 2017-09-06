package com.jumptvs.test.command;

import com.jumptvs.test.Shapes;
import com.jumptvs.test.shapes.Square;

/**
 * Created by jmartin on 6/09/17.
 */
public class SquareCommand implements Command {
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
}
