package com.csc205.project1;

public class Point {
    private double x;
    private double y;
    Point(){
        double x = 0;
        double y = 0;
    }
    Point(double x, double y){
        this.x = x;
        this.y = y;
    }
    public void setX(double x){
        this.x = x;
   }
    public double getX(){
        return x;
    }

    public void setY(double y){
        this.y = y;
   }
    public double getY(){
        return y;
    }
    public void setPoint(double x, double y){
        this.x = x;
        this.y = y;
    }
    public void shiftX(double n){
        x = x + n;
    }
    public void shiftY(double n){
        y = y + n;
    }
    public double distance(Point p2){
       double pointDistance = Math.sqrt(Math.pow((this.x-p2.getX()),2)+Math.pow((this.y-p2.getY()),2));
        return pointDistance;
    }
    public void rotate (double angle){
        this.x = (x*(Math.cos(angle)))-(y*(Math.sin(angle)));
        this.y = (x*(Math.cos(angle)))+(y*(Math.sin(angle)));
    }
    public String toString(){
        return "Point{" + " x=" + x + ", y= " + y + '}';
    }
}
