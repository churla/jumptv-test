package com.jumptvs.test.shapes;

import com.jumptvs.test.Shapes;

import java.awt.geom.Rectangle2D;

/**
 * Created by jmartin on 6/09/17.
 */
public class Square implements Shape{

    private Double x;
    private Double y;
    private Double side;
    private String name;

    public Square(Double x, Double y, Double side) {
        this.x = x;
        this.y = y;
        this.side = side;
    }

    public Double getX() {
        return x;
    }

    public void setX(Double x) {
        this.x = x;
    }

    public Double getY() {
        return y;
    }

    public void setY(Double y) {
        this.y = y;
    }

    public Double getSide() {
        return side;
    }

    public void setSide(Double side) {
        this.side = side;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean contains(Point p) {

        Rectangle2D.Double pol = new Rectangle2D.Double(x, y, side, side);

        return pol.contains(p.getX(),p.getY());

    }

    @Override
    public String printData() {
        return name+": square with vertice at ("+x+", "+y+") and side "+side;
    }

    @Override
    public Double getArea() {
        return side * side;
    }
}
