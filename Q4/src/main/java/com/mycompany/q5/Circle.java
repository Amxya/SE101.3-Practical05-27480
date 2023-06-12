package com.mycompany.q5;

public class Circle extends Shape{
    
    private double r;
    
    public void circle(double r){
        this.r = r;
    }
    
    @Override
    public double calculateArea(){
        area = 2 * Math.PI * r;
        return area;
    }
    
}
