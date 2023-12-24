package models;

import java.util.ArrayList;

public class Point {
    private double x;
    private double y;

    public Point(double x,double y){
        setX(x);
        setY(y);
    }

    public double getX(){
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getDistance(Point destination){
        double dx = destination.x - this.x;
        double dy = destination.y - this.y;
        return Math.sqrt(dx*dx + dy*dy);

    }

    public void addPoint(Point point) {
    }

}

