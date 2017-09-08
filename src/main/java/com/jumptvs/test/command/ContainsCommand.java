package com.jumptvs.test.command;

import com.jumptvs.test.Shapes;
import com.jumptvs.test.shapes.Point;
import com.jumptvs.test.shapes.Shape;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by jmartin on 6/09/17.
 */
public class ContainsCommand implements Command {
    @Override
    public void check(String[] args) {
    
    }

    @Override
    public String execute(String[] args) {

        Point p = new Point(Double.parseDouble(args[0]), Double.parseDouble(args[1]));

        List<Shape> shapes = Shapes.getInstance().getShapes();
        List<Shape> contains = new ArrayList<>();



        String names = shapes.parallelStream().filter(shape -> shape.contains(p))
                .map(shape -> shape.getName()+": Area "+shape.getArea())
                .reduce((acum, elem) -> {
            if(acum == null) acum = "";

            acum += "\n"+elem;
            return acum;
        }).get();

        return names;
    }

    @Override
    public String help() {
        return "- Find shapes that intersect a point: <X> <Y>";
    }
}
