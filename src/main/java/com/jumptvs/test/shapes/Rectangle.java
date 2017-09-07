package com.jumptvs.test.shapes;


import java.awt.geom.Rectangle2D;

/**
 * Created by jmartin on 6/09/17.
 */
public class Rectangle implements Shape{

    private Double x;
    private Double y;
    private Double sideH;
    private Double sideV;
    private String name;

    public Rectangle(Double x, Double y, Double sideH, Double sideV) {
        this.x = x;
        this.y = y;
        this.sideH = sideH;
        this.sideV = sideV;
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

    public Double getSideH() {
        return sideH;
    }

    public void setSideH(Double sideH) {
        this.sideH = sideH;
    }

    public Double getSideV() {
        return sideV;
    }

    public void setSideV(Double sideV) {
        this.sideV = sideV;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean contains(Point p) {

        Rectangle2D.Double pol = new Rectangle2D.Double(x, y, sideH, sideV);

        return pol.contains(p.getX(),p.getY());
    }

    @Override
    public String printData() {
        return name+": rectangle with vertice at ("+x+", "+y+") and side horizontal "+sideH+" and side vertical "+sideV;
    }

    @Override
    public Double getArea() {
        return sideH * sideV;
    }
}
