package com.jumptvs.test.command;

import com.jumptvs.test.Shapes;
import com.jumptvs.test.shapes.Point;
import com.jumptvs.test.shapes.Shape;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jmartin on 6/09/17.
 */
public class ContainsCommand implements Command {
    @Override
    public String execute(String[] args) {

        Point p = new Point(Double.parseDouble(args[0]), Double.parseDouble(args[1]));

        List<Shape> shapes = Shapes.getInstance().getShapes();
        List<Shape> contains = new ArrayList<>();

        String names = "";

        for(Shape s : shapes){
            if(s.contains(p)){
                names += "\n"+s.getName();
            }
        }

        return names;
    }
}
