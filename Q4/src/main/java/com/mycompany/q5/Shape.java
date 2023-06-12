
package com.mycompany.q5;

abstract class Shape {
    
    public double area;
    public abstract double calculateArea();
    
    public void display(){
        System.out.println(+area);
    }    
}
