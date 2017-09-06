package com.jumptvs.test.shapes;

import java.awt.*;
import java.awt.geom.Path2D;

/**
 * Created by jmartin on 6/09/17.
 */
public class Triangle implements Shape{

    private Double x1;
    private Double y1;
    private Double x2;
    private Double y2;
    private Double x3;
    private Double y3;
    private String name;

    public Triangle(Double x1, Double y1, Double x2, Double y2, Double x3, Double y3) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.x3 = x3;
        this.y3 = y3;
    }

    public Double getX1() {
        return x1;
    }

    public void setX1(Double x1) {
        this.x1 = x1;
    }

    public Double getY1() {
        return y1;
    }

    public void setY1(Double y1) {
        this.y1 = y1;
    }

    public Double getX2() {
        return x2;
    }

    public void setX2(Double x2) {
        this.x2 = x2;
    }

    public Double getY2() {
        return y2;
    }

    public void setY2(Double y2) {
        this.y2 = y2;
    }

    public Double getX3() {
        return x3;
    }

    public void setX3(Double x3) {
        this.x3 = x3;
    }

    public Double getY3() {
        return y3;
    }

    public void setY3(Double y3) {
        this.y3 = y3;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean contains(Point p) {

        Path2D.Double pol = new Path2D.Double();

        pol.moveTo(x1, y1);
        pol.lineTo(x2, y2);
        pol.lineTo(x3, y3);
        pol.closePath();

        return pol.contains(p.getX(), p.getY());


    }

    @Override
    public String printData() {
        return name+": triangle with vertice 1 at ("+x1+", "+y1+") and vertice 2 at ("+x2+", "+y2+") and vertice 1 at ("+x3+", "+y3+")";
    }
}
