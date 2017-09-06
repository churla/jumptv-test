package com.jumptvs.test;

import com.jumptvs.test.shapes.Shape;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jmartin on 6/09/17.
 */
public class Shapes {

    private static Shapes instance;
    private List<Shape> shapes;

    private Shapes(){
        this.shapes = new ArrayList<Shape>();
    }

    public String addShape(Shape s){

        this.shapes.add(s);
        return "Shape "+this.shapes.size();
    }

    public int size(){
        return shapes.size();
    }

    public static synchronized Shapes getInstance(){
        if(instance == null){
            instance = new Shapes();
        }

        return instance;
    }

    public List<Shape> getShapes() {
        return shapes;
    }
}
