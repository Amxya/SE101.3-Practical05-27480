package com.mycompany.q5;

public class Rectangle extends Shape{
    
    private int l,w;
    
     public void rectangle(int l, int w){
        this.l = l;
        this.w = w;
    }
    
    @Override
    public double calculateArea(){
        area = (2 * l) + (2 * w);
        return area;
    }

    
}
