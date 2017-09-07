package com.jumptvs.test.shapes;

import java.awt.geom.Ellipse2D;

/**
 * Created by jmartin on 6/09/17.
 */
public class Circle implements Shape{

    private Double x;
    private Double y;
    private Double r;

    private String name;

    public Circle(Double x, Double y, Double r) {
        this.x = x;
        this.y = y;
        this.r = r;
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

    public Double getR() {
        return r;
    }

    public void setR(Double r) {
        this.r = r;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean contains(Point p) {

        Ellipse2D.Double fig = new Ellipse2D.Double(x-r,y-r,r*2, r*2);

        return fig.contains(p.getX(),p.getY());

    }

    @Override
    public String printData() {
        return name+": circle with centre at ("+x+", "+y+") and radius "+r;
    }

    @Override
    public Double getArea() {
        return Math.PI * (r*r);
    }

}
