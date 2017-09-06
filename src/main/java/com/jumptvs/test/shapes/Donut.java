package com.jumptvs.test.shapes;

/**
 * Created by jmartin on 6/09/17.
 */
public class Donut implements Shape{

    public Circle cBig;
    public Circle cSmall;
    public String name;

    public Donut(Double x, Double y, Double rB, Double rS ){
        cBig = new Circle(x,y, rB);
        cSmall = new Circle(x, y, rS);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean contains(Point p) {

        if(cBig.contains(p) && !cSmall.contains(p)){
            return true;
        }

        return false;
    }

    @Override
    public String printData() {
        return name+": donut with vertice at ("+cBig.getX()+", "+cBig.getY()+") and large radius "+cBig.getR() + " and short radius "+cSmall.getR();
    }
}
